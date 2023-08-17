/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

import domain.Autobus;
import domain.VrstaAutobusa;
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
public class RepositoryAutobus implements DbRepository<Autobus>{

    @Override
    public List<Autobus> getAll(Autobus param) throws Exception {
    
    try {
            String sql="Select * from Autobus WHERE RegBrojVozila= "+"'"+param.getRegBrojVozila()+"'";
            List<Autobus> autobusi = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            
            Statement statement = connection.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Autobus autobus = new Autobus();
                autobus.setRegBrojVozila(rs.getString("RegBrojVozila"));
                autobus.setMarkaAutobusa(rs.getString("MarkaAutobusa"));
                autobus.setBrojMesta(rs.getInt("BrojMesta"));
                autobus.setGodinaProizvodnje(rs.getInt("GodinaProizvodnje"));
                autobus.setVrstaAutobusa(getVrstaAutobusasForIDVrste(rs.getLong("VrstaAutobusa")));
                autobusi.add(autobus);
            }
            rs.close();
            statement.close();
            return autobusi;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public int add(Autobus autobus) throws Exception {
        
         RepositoryDBGeneric dBGeneric = new RepositoryDBGeneric();
         return dBGeneric.add(autobus);
         
    }

    @Override
    public int edit(Autobus autobus) throws Exception {
         
            RepositoryDBGeneric dBGeneric = new RepositoryDBGeneric();
            return dBGeneric.edit(autobus);
    }

    @Override
    public int delete(Autobus param) throws Exception {
        return 1;
    }

    @Override
    public List<Autobus> getAll() {
        try {
            String sql = "select * from autobus";
            List<Autobus> autobusi = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Autobus autobus = new Autobus();
                autobus.setRegBrojVozila(rs.getString("RegBrojVozila"));
                autobus.setMarkaAutobusa(rs.getString("MarkaAutobusa"));
                autobus.setBrojMesta(rs.getInt("BrojMesta"));
                autobus.setGodinaProizvodnje(rs.getInt("GodinaProizvodnje"));
                autobus.setVrstaAutobusa(getVrstaAutobusasForIDVrste(rs.getLong("VrstaAutobusa")));
                autobusi.add(autobus);
            }
            rs.close();
            statement.close();
            return autobusi;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
   
    private VrstaAutobusa getVrstaAutobusasForIDVrste(long vrstaID){
        RepositoryVrstaAutobus repositoryVrstaAutobus=new RepositoryVrstaAutobus();
        List<VrstaAutobusa> vrste = repositoryVrstaAutobus.getAll();
        for (VrstaAutobusa vrstaAutobusa : vrste) {
            if(vrstaAutobusa.getVrstaAutobusaID()==vrstaID){
                return vrstaAutobusa;
            }
        }
        return null;
    }

    @Override
    public Autobus addAndReturn(Autobus param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
