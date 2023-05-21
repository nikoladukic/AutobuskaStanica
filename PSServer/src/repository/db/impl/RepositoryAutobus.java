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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Autobus autobus) throws Exception {
         String sql = "INSERT into Autobus VALUES (?,?,?,?,?)";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setString(1, autobus.getRegBrojVozila());
            pstatement.setString(2, autobus.getMarkaAutobusa());
            pstatement.setInt(3, autobus.getGodinaProizvodnje());
            pstatement.setInt(4, autobus.getBrojMesta());
            pstatement.setLong(5, autobus.getVrstaAutobusa().getVrstaAutobusaID());
            pstatement.executeUpdate();
            pstatement.close();
    }

    @Override
    public void edit(Autobus autobus) throws Exception {
         String sql = "UPDATE autobus SET BrojMesta = ? WHERE RegBrojVozila= ? ";

            Connection connection = DbConnectionFactory.getInstance().getConnection();

            PreparedStatement pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, autobus.getBrojMesta());
            pstatement.setString(2, autobus.getRegBrojVozila());
            pstatement.executeUpdate();
            pstatement.close();
    }

    @Override
    public void delete(Autobus param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
}
