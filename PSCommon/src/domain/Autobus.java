/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Autobus implements Serializable{
    
    private String regBrojVozila;
    private String markaAutobusa;
    private int godinaProizvodnje;
    private int brojMesta;
    private VrstaAutobusa vrstaAutobusa;

    public Autobus() {
    }

    public Autobus(String regBrojVozila, String markaAutobusa, int godinaProizvodnje, int brojMesta, VrstaAutobusa vrstaAutobusa) {
        this.regBrojVozila = regBrojVozila;
        this.markaAutobusa = markaAutobusa;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojMesta = brojMesta;
        this.vrstaAutobusa = vrstaAutobusa;
    }

    public String getRegBrojVozila() {
        return regBrojVozila;
    }

    public void setRegBrojVozila(String regBrojVozila) {
        this.regBrojVozila = regBrojVozila;
    }

    public String getMarkaAutobusa() {
        return markaAutobusa;
    }

    public void setMarkaAutobusa(String markaAutobusa) {
        this.markaAutobusa = markaAutobusa;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public VrstaAutobusa getVrstaAutobusa() {
        return vrstaAutobusa;
    }

    public void setVrstaAutobusa(VrstaAutobusa vrstaAutobusa) {
        this.vrstaAutobusa = vrstaAutobusa;
    }

    @Override
    public String toString() {
        return regBrojVozila + ", " + markaAutobusa + ", " + brojMesta ;
    }
    
    
    
}
