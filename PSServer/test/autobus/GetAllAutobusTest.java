/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

import domain.Autobus;
import domain.VrstaAutobusa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import repository.db.impl.RepositoryAutobus;
import repository.db.impl.RepositoryDBGeneric;

/**
 *
 * @author PC
 */
public class GetAllAutobusTest {
    
    @Test
    public void testGetAllAutobus() {
        try {
            
            
            RepositoryAutobus repository = new RepositoryAutobus();
            
            List<Autobus> autobusi =  repository.getAll();
            
            Assert.assertNotSame(1, autobusi.size());
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
