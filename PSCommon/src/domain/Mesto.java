/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Mesto implements GenericEntity{
    private int mestoID;
    private String naziv;

    
    public Mesto(int mestoID, String naziv) {
        this.mestoID = mestoID;
        this.naziv = naziv;
    }
    public Mesto() {
    }
    

    public void setMestoID(int mestoID) {
        this.mestoID = mestoID;
    }

    public String getNaziv() {
        return naziv;
    }
    public int getMestoID() {
        return mestoID;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.mestoID;
        hash = 41 * hash + Objects.hashCode(this.naziv);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mesto other = (Mesto) obj;
        if (this.mestoID != other.mestoID) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnNamesForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getInsertValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
