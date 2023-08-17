/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vozac;

import autobus.*;
import domain.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import repository.db.impl.RepositoryVozac;

/**
 *
 * @author PC
 */
public class GetAllVozacTest {
    
    @Test
    public void testGetAllAutobus() {
        try {
            
            
            RepositoryVozac repository = new RepositoryVozac();
            
            List<Vozac> vozaci =  repository.getAll();
            
            Assert.assertNotSame(1, vozaci.size());
            
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
