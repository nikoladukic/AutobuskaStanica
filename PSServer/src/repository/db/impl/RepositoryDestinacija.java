/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Autobus;
import domain.DestinacijaVoznje;
import domain.Mesto;
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
    public int add(DestinacijaVoznje destinacijaVoznje) throws Exception {
       RepositoryDBGeneric dBGeneric = new RepositoryDBGeneric();
        return  dBGeneric.add(destinacijaVoznje);
    }
    

    @Override
    public int edit(DestinacijaVoznje destinacijaVoznje) throws Exception {
        return 1;
    }

    @Override
    public int delete(DestinacijaVoznje destinacijaVoznje) throws Exception {
        return 1;
    }

    @Override
    public List<DestinacijaVoznje> getAll() {
        
        try {
           String sql="Select * from destinacijavoznje" ;
            List<DestinacijaVoznje> destinacije =  new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            
            Statement statement = connection.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DestinacijaVoznje destinacija = new DestinacijaVoznje();
                destinacija.setDestinacijaID(rs.getInt("RedniBroj"));
                destinacija.setMesto(new Mesto(rs.getInt("MestoID"),null));
                destinacija.setVoznja(new Voznja(rs.getLong("VoznjaID"),null,null,null,null));
                
                destinacije.add(destinacija);
            }
            rs.close();
            statement.close();
            return destinacije;
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
