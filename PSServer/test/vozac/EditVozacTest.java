/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vozac;

import autobus.*;
import domain.Autobus;
import domain.Vozac;
import domain.VrstaAutobusa;
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
public class EditVozacTest {
    
    @Test
    public void testEditVozac() {
        try {
            
            Vozac vozac = new Vozac("1212121212123","TestVozac","TestVozac",new java.sql.Date((new Date()).getTime()),13);
            
            RepositoryDBGeneric repository = new RepositoryDBGeneric();
            
            int result = repository.edit(vozac);
            
            assertEquals(1, result);
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
