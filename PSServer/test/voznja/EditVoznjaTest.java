/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voznja;

import autobus.*;
import domain.Autobus;
import domain.Vozac;
import domain.Voznja;
import domain.VrstaAutobusa;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import repository.db.impl.RepositoryDBGeneric;

/**
 *
 * @author PC
 */
public class EditVoznjaTest {
    
    @Test
    public void testEditAutobus() {
        try {
            
            Time vreme =  new Time(12, 12, 12);
            Autobus autobus = new Autobus("1212da", "marka", 2001, 11, new VrstaAutobusa((long)300, "Kombi"));
            Vozac vozac = new Vozac("1212121212123","TestVozac","TestVozac",new java.sql.Date((new Date()).getTime()),12);

            Voznja voznja = new Voznja(11,new java.sql.Date((new Date()).getTime()),vreme,vozac,autobus);
            RepositoryDBGeneric repository = new RepositoryDBGeneric();
            
            int result = repository.edit(voznja);
            
            assertEquals(1, result);
        } catch (Exception ex) {
            Logger.getLogger(AddNewVoznjaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
