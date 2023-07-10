/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Autobus;
import domain.Vozac;
import domain.Voznja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import repository.db.DbConnectionFactory;
import repository.db.DbRepository;

/**
 *
 * @author PC
 */
public class RepositoryVoznja implements DbRepository<Voznja>{

    @Override
    public List<Voznja> getAll(Voznja param) throws Exception {
         try {
            String sql = "select * from voznja";
            List<Voznja> voznje = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voznja voznja = new Voznja();
                voznja.setVoznjaID(rs.getLong("VoznjaID"));
                voznja.setDatumPolaska(new java.util.Date(rs.getDate("DatumPolaska").getTime()));
                voznja.setVremePolaska(rs.getTime("VremePolaska"));
                voznja.setVozac(getVozacForJmbg(rs.getString("JMBG")));
                voznja.setAutobus(getAutobusForRegBroj(rs.getString("RegBrojVozila")));
                voznje.add(voznja);
            }
            rs.close();
            statement.close();
            return voznje;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void add(Voznja voznja) throws Exception {
         String sql = "INSERT INTO voznja(datumpolaska,vremepolaska,jmbg,regBrojVozila) VALUES(?,?,?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            pstatement.setDate(1, new java.sql.Date(voznja.getDatumPolaska().getTime()));
            pstatement.setTime(2, voznja.getVremePolaska());
            pstatement.setString(3, voznja.getVozac().getJMBG());
            pstatement.setString(4, voznja.getAutobus().getRegBrojVozila());
            pstatement.executeUpdate();
            
            ResultSet resKey = pstatement.getGeneratedKeys();
            while(resKey.next()){
            long voznjaID = resKey.getLong(1);
            voznja.setVoznjaID(voznjaID);
            }
            
            pstatement.close();
    }

    
    @Override
    public void edit(Voznja voznja) throws Exception {
        String sql = "UPDATE voznja SET DatumPolaska = ?,VremePolaska=?,JMBG = ?,RegBrojVozila=? WHERE VoznjaID= ? ";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setDate(1, new java.sql.Date(voznja.getDatumPolaska().getTime()));
            pstatement.setTime(2, voznja.getVremePolaska());
            pstatement.setString(3, voznja.getVozac().getJMBG());
            pstatement.setString(4, voznja.getAutobus().getRegBrojVozila());
            pstatement.setLong(5, voznja.getVoznjaID());
            pstatement.executeUpdate();
           
            pstatement.close();
    }

    @Override
    public void delete(Voznja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Voznja> getAll() {
        try {
            String sql = "select * from voznja";
            List<Voznja> voznje = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voznja voznja = new Voznja();
                voznja.setVoznjaID(rs.getLong("VoznjaID"));
                voznja.setDatumPolaska(new java.util.Date(rs.getDate("DatumPolaska").getTime()));
                voznja.setVremePolaska(rs.getTime("VremePolaska"));
                voznja.setVozac(getVozacForJmbg(rs.getString("JMBG")));
                voznja.setAutobus(getAutobusForRegBroj(rs.getString("RegBrojVozila")));
                voznje.add(voznja);
            }
            rs.close();
            statement.close();
            return voznje;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    Vozac getVozacForJmbg(String jmbg){
        RepositoryVozac repVozac = new RepositoryVozac();
        List<Vozac> vozaci = repVozac.getAll();
        for(Vozac vozac : vozaci){
            if(vozac.getJMBG().equals(jmbg)){
                return vozac;
            }
        }
        return null;
    }
    Autobus getAutobusForRegBroj(String regBroj){
        RepositoryAutobus repAutobus = new RepositoryAutobus();
        List<Autobus> autobusi = repAutobus.getAll();
        for(Autobus autobus : autobusi){
            if(autobus.getRegBrojVozila().equals(regBroj)){
                return autobus;
            }
        }
        return null;
    }

    @Override
    public Voznja addAndReturn(Voznja voznja) throws Exception {
        String sql = "INSERT INTO voznja(datumpolaska,vremepolaska,jmbg,regBrojVozila) VALUES(?,?,?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            pstatement.setDate(1, new java.sql.Date(voznja.getDatumPolaska().getTime()));
            pstatement.setTime(2, voznja.getVremePolaska());
            pstatement.setString(3, voznja.getVozac().getJMBG());
            pstatement.setString(4, voznja.getAutobus().getRegBrojVozila());
            pstatement.executeUpdate();
            
            ResultSet resKey = pstatement.getGeneratedKeys();
            while(resKey.next()){
            long voznjaID = resKey.getLong(1);
            voznja.setVoznjaID(voznjaID);
            }
            
            pstatement.close();
            return voznja;
    }
    
}
