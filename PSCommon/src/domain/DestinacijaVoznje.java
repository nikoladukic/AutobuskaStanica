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
public class DestinacijaVoznje implements GenericEntity{
    int destinacijaID;
    Voznja voznja;
    Mesto mesto;

    public DestinacijaVoznje() {
    }

    
    public DestinacijaVoznje(int destinacijaID, Voznja voznja, Mesto mesto) {
        this.destinacijaID = destinacijaID;
        this.voznja = voznja;
        this.mesto = mesto;
    }

    public int getDestinacijaID() {
        return destinacijaID;
    }

    public void setDestinacijaID(int destinacijaID) {
        this.destinacijaID = destinacijaID;
    }

    public Voznja getVoznja() {
        return voznja;
    }

    public void setVoznja(Voznja voznja) {
        this.voznja = voznja;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.destinacijaID;
        hash = 61 * hash + Objects.hashCode(this.voznja);
        hash = 61 * hash + Objects.hashCode(this.mesto);
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
        final DestinacijaVoznje other = (DestinacijaVoznje) obj;
        if (this.destinacijaID != other.destinacijaID) {
            return false;
        }
        if (!Objects.equals(this.voznja, other.voznja)) {
            return false;
        }
        return Objects.equals(this.mesto, other.mesto);
    }

    @Override
    public String getTableName() {
        return "destinacijavoznje";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "(voznjaid,mestoid)";
    }

    @Override
    public String getInsertValues() {
        return getVoznja().getVoznjaID()+","+getMesto().getMestoID();
    }

    @Override
    public void setId(Long id) {
        setDestinacijaID(Integer.parseInt(id+""));
    }

    @Override
    public String getConditionForEdit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
