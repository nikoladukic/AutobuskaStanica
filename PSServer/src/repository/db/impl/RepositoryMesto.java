/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db.impl;

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
public class RepositoryMesto implements DbRepository<Mesto>{

    @Override
    public List<Mesto> getAll(Mesto param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int add(Mesto mesto) throws Exception {
         RepositoryDBGeneric dBGeneric = new RepositoryDBGeneric();
         return dBGeneric.add(mesto);
    }

    @Override
    public int edit(Mesto param) throws Exception {
        return 1;
    }

    @Override
    public int delete(Mesto param) throws Exception {
        return 1;
    }

    @Override
    public List<Mesto> getAll() {
        try {
            String sql = "select * from mesto";
            List<Mesto> mesta = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Mesto mesto = new Mesto();
                mesto.setMestoID(rs.getInt("MestoID"));
                mesto.setNaziv(rs.getString("NazivMesta"));
                mesta.add(mesto);
            }
            rs.close();
            statement.close();
            return mesta;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Mesto addAndReturn(Mesto param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
