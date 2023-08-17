/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesto;

import autobus.AddNewAutobusTest;
import domain.Autobus;
import domain.Mesto;
import domain.VrstaAutobusa;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import repository.db.impl.RepositoryDBGeneric;

/**
 *
 * @author PC
 */
public class AddMestoTest {
    
    @Test
    public void testInsertObject() {
        try {
            
            Mesto mesto = new Mesto(12545,"TestMesto");
            
            RepositoryDBGeneric repository = new RepositoryDBGeneric();
            
            int result = repository.add(mesto);
            
            assertEquals(1, result);
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
