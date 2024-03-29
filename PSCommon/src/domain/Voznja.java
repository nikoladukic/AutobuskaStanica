/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Voznja implements  GenericEntity{
    private Long voznjaID;
    private Date datumPolaska;
    private Time vremePolaska;
    private Vozac vozac;
    private Autobus autobus;

    public Voznja() {
    }

    public Voznja( long voznjaID,Date datumPolaska, Time vremePolaska, Vozac vozac, Autobus autobus) {
        this.voznjaID = voznjaID;
        this.datumPolaska = datumPolaska;
        this.vremePolaska = vremePolaska;
        this.vozac = vozac;
        this.autobus = autobus;
    }

    public Long getVoznjaID() {
        return voznjaID;
    }

    public void setVoznjaID(Long voznjaID) {
        this.voznjaID = voznjaID;
    }

    

    public Date getDatumPolaska() {
        return datumPolaska;
    }

    public void setDatumPolaska(Date datumPolaska) {
        this.datumPolaska = datumPolaska;
    }

    public Time getVremePolaska() {
        return vremePolaska;
    }

    public void setVremePolaska(Time vremePolaska) {
        this.vremePolaska = vremePolaska;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.voznjaID);
        hash = 59 * hash + Objects.hashCode(this.datumPolaska);
        hash = 59 * hash + Objects.hashCode(this.vremePolaska);
        hash = 59 * hash + Objects.hashCode(this.vozac);
        hash = 59 * hash + Objects.hashCode(this.autobus);
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
        final Voznja other = (Voznja) obj;
        if (!Objects.equals(this.voznjaID, other.voznjaID)) {
            return false;
        }
        if (!Objects.equals(this.datumPolaska, other.datumPolaska)) {
            return false;
        }
        if (!Objects.equals(this.vremePolaska, other.vremePolaska)) {
            return false;
        }
        if (!Objects.equals(this.vozac, other.vozac)) {
            return false;
        }
        return Objects.equals(this.autobus, other.autobus);
    }

    @Override
    public String toString() {
        return "Voznja{" + "datumPolaska=" + datumPolaska + ", vremePolaska=" + vremePolaska + '}';
    }

    @Override
    public String getTableName() {
        return "voznja";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "(datumpolaska,vremepolaska,jmbg,regBrojVozila)";
    }

    @Override
    public String getInsertValues() {
        return "'" + (new java.sql.Date(getDatumPolaska().getTime())).toString()+"','"+vremePolaska+"','"+
                getVozac().getJMBG()+"','"+getAutobus().getRegBrojVozila()+"'";
    }

    @Override
    public void setId(Long id) {
        setVoznjaID(id);
    }

    @Override
    public String getConditionForEdit() {
        
        return "DatumPolaska = '" + new java.sql.Date(getDatumPolaska().getTime()).toString()+"',VremePolaska= '"+
                getVremePolaska()+"',JMBG = '"+getVozac().getJMBG()+"',RegBrojVozila='"+getAutobus().getRegBrojVozila()+
                "'WHERE VoznjaID="+getVoznjaID() ; 
        }
    
    
    
}
