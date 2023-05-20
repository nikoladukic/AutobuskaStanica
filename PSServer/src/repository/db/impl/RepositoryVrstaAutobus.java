/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Autobus;
import domain.Vozac;
import domain.Voznja;
import domain.VrstaAutobusa;
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
public class RepositoryVrstaAutobus implements DbRepository<VrstaAutobusa>{

    @Override
    public List<VrstaAutobusa> getAll(VrstaAutobusa param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(VrstaAutobusa autobus) throws Exception {
         
    }

    @Override
    public void edit(VrstaAutobusa param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(VrstaAutobusa param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VrstaAutobusa> getAll() {
        try {
            String sql = "select * from vrstaautobusa";
            List<VrstaAutobusa> vrste = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                VrstaAutobusa vrsta = new VrstaAutobusa();
                vrsta.setNazivVrsta(rs.getString("NazivVrsta"));
                vrsta.setVrstaAutobusaID(rs.getLong("VrstaAutobusaID"));
               
                vrste.add(vrsta);
            }
            rs.close();
            statement.close();
            return vrste;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}