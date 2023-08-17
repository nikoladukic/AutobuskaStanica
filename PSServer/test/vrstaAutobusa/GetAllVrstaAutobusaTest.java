/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vrstaAutobusa;

import autobus.*;
import domain.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import repository.db.impl.*;

/**
 *
 * @author PC
 */
public class GetAllVrstaAutobusaTest {
    
    @Test
    public void testGetAllVrstaAutobus() {
        try {
            
            
            RepositoryVrstaAutobus repository = new RepositoryVrstaAutobus();
            
            List<VrstaAutobusa> vrste =  repository.getAll();
            
            Assert.assertNotSame(1, vrste.size());
            
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
