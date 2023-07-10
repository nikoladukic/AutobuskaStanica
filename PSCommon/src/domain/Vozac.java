/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Vozac implements GenericEntity{
    
    private String JMBG;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private int radniStaz;

    public Vozac() {
    }

    public Vozac(String JMBG, String ime, String prezime, Date datumRodjenja, int radniStaz) {
        this.JMBG = JMBG;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.radniStaz = radniStaz;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public int getRadniStaz() {
        return radniStaz;
    }

    public void setRadniStaz(int radniStaz) {
        this.radniStaz = radniStaz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.JMBG);
        hash = 11 * hash + Objects.hashCode(this.ime);
        hash = 11 * hash + Objects.hashCode(this.prezime);
        hash = 11 * hash + Objects.hashCode(this.datumRodjenja);
        hash = 11 * hash + this.radniStaz;
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
        final Vozac other = (Vozac) obj;
        if (this.radniStaz != other.radniStaz) {
            return false;
        }
        if (!Objects.equals(this.JMBG, other.JMBG)) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        return Objects.equals(this.datumRodjenja, other.datumRodjenja);
    }

    @Override
    public String toString() {
        return ime+" " + prezime;
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
