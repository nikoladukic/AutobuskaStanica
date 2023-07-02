/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Vozac;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class RepositoryVozac implements DbRepository<Vozac>{

    @Override
    public List<Vozac> getAll(Vozac param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Vozac vozac) throws Exception {
         String sql = "INSERT into Vozac VALUES (?,?,?,?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setString(1, vozac.getJMBG());
            pstatement.setString(2, vozac.getIme());
            pstatement.setString(3, vozac.getPrezime());
            pstatement.setDate(4, new java.sql.Date(vozac.getDatumRodjenja().getTime()));
            pstatement.setInt(5, vozac.getRadniStaz());
            pstatement.executeUpdate();
            pstatement.close();
    }

    @Override
    public void edit(Vozac vozac) throws Exception {
        String sql = "UPDATE vozac SET RadniStaz = ? WHERE JMBG= ? ";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, vozac.getRadniStaz());
            pstatement.setString(2, vozac.getJMBG());
            pstatement.executeUpdate();
            pstatement.close();
    }

    @Override
    public void delete(Vozac param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Vozac> getAll() {
        try {
            String sql = "select * from vozac";
            List<Vozac> vozaci = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Vozac vozac = new Vozac();
                vozac.setJMBG(rs.getString("JMBG"));
                vozac.setIme(rs.getString("Ime"));
                vozac.setPrezime(rs.getString("Prezime"));
                vozac.setDatumRodjenja(new java.util.Date(rs.getDate("DatumRodjenja").getTime()));
                vozac.setRadniStaz(rs.getInt("RadniStaz"));
                vozaci.add(vozac);
                System.out.println(vozac);
            }
            rs.close();
            statement.close();
            return vozaci;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Vozac addAndReturn(Vozac param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
