/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class VrstaAutobusa {
    
    private Long vrstaAutobusaID;
    private String NazivVrsta;

    public VrstaAutobusa(Long vrstaAutobusaID, String NazivVrsta) {
        this.vrstaAutobusaID = vrstaAutobusaID;
        this.NazivVrsta = NazivVrsta;
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
    
    
}
