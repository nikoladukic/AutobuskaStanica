/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Voznja vozac) throws Exception {
         String sql = "INSERT into Vozac VALUES (?,?,?,?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

//            PreparedStatement pstatement = connection.prepareStatement(sql);
//            pstatement.setString(1, vozac.getJMBG());
//            pstatement.setString(2, vozac.getIme());
//            pstatement.setString(3, vozac.getPrezime());
//            pstatement.setDate(4, new java.sql.Date(vozac.getDatumRodjenja().getTime()));
//            pstatement.setInt(5, vozac.getRadniStaz());
//            pstatement.executeUpdate();
//            pstatement.close();
    }

    @Override
    public void edit(Voznja param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                  voznja.setDatumPolaska(new java.util.Date(rs.getDate("DatumPolaska").getTime()));
                  voznja.setVremePolaska(rs.getTime("VremePolaska"));
//                voznja.setVozac(rs.getObject("", type));
//                voznja.setDatumRodjenja(new java.util.Date(rs.getDate("DatumRodjenja").getTime()));
//                voznja.setRadniStaz(rs.getInt("RadniStaz"));
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
    
}
