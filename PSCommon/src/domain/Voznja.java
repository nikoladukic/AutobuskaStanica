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
public class Voznja implements Serializable{
    private Long voznjaID;
    private Date datumPolaska;
    private Time vremePolaska;
    private Vozac vozac;
    private Autobus autobus;

    public Voznja() {
    }

    public Voznja( Date datumPolaska, Time vremePolaska, Vozac vozac, Autobus autobus) {
        this.datumPolaska = datumPolaska;
        this.vremePolaska = vremePolaska;
        this.vozac = vozac;
        this.autobus = autobus;
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
    
    
}
