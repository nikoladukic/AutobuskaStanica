/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Autobus;
import domain.DestinacijaVoznje;
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
public class RepositoryDestinacija implements DbRepository<DestinacijaVoznje>{

    @Override
    public List<DestinacijaVoznje> getAll(DestinacijaVoznje destinacijaVoznje) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(DestinacijaVoznje destinacijaVoznje) throws Exception {
        String sql = "INSERT INTO destinacijavoznje(voznjaid,mestoid) VALUES(?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            
            pstatement.setLong(1, destinacijaVoznje.getVoznja().getVoznjaID());
            pstatement.setLong(2, destinacijaVoznje.getMesto().getMestoID());
            pstatement.executeUpdate();
            pstatement.close();
        
    }
    

    @Override
    public void edit(DestinacijaVoznje destinacijaVoznje) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(DestinacijaVoznje destinacijaVoznje) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DestinacijaVoznje> getAll() {
        try {
           return  null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public DestinacijaVoznje addAndReturn(DestinacijaVoznje param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
