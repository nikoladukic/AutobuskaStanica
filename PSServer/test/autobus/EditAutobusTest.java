/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

import domain.Autobus;
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
public class EditAutobusTest {
    
    @Test
    public void testEditAutobus() {
        try {
            
            Autobus autobus = new Autobus("1212da", "marka", 2001, 212, new VrstaAutobusa((long)300, "Kombi"));
            
            RepositoryDBGeneric repository = new RepositoryDBGeneric();
            
            int result = repository.edit(autobus);
            
            assertEquals(1, result);
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
