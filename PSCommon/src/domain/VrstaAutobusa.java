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
public class VrstaAutobusa implements GenericEntity{
    
    private Long vrstaAutobusaID;
    private String NazivVrsta;

    public VrstaAutobusa(Long vrstaAutobusaID, String NazivVrsta) {
        this.vrstaAutobusaID = vrstaAutobusaID;
        this.NazivVrsta = NazivVrsta;
    }

    public VrstaAutobusa() {
    }

    public Long getVrstaAutobusaID() {
        return vrstaAutobusaID;
    }

    public void setVrstaAutobusaID(Long vrstaAutobusaID) {
        this.vrstaAutobusaID = vrstaAutobusaID;
    }

    public String getNazivVrsta() {
        return NazivVrsta;
    }

    public void setNazivVrsta(String NazivVrsta) {
        this.NazivVrsta = NazivVrsta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.vrstaAutobusaID);
        hash = 59 * hash + Objects.hashCode(this.NazivVrsta);
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
        final VrstaAutobusa other = (VrstaAutobusa) obj;
        if (!Objects.equals(this.NazivVrsta, other.NazivVrsta)) {
            return false;
        }
        return Objects.equals(this.vrstaAutobusaID, other.vrstaAutobusaID);
    }

    @Override
    public String toString() {
        return NazivVrsta;
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

    @Override
    public String getConditionForEdit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
