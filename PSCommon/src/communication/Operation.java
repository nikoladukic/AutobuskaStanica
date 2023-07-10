/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public enum Operation  implements Serializable{
    KreirajAutobus,
    ZapamtiAutobus,
    UcitajListuAutobusa,
    PretraziAutobus,
    DodajMesto,
    ZapamtiMesto,
    UcitajListuMesta,
    KreirajVozaca,
    ZapamtiVozaca,
    NadjiVozaca,
    UcitajListuVozaca,
    KreirajVoznju,
    ZapamtiVoznju,
    NadjiVoznju,
    UcitajListuVoznji,
    GetMestoZaZadatuVoznju,
    KreirajDestinacijuVoznje,
    UcitajListuVrstiAutobusa,
    UcitajListuDestinacija,
    LogIn
    
}
