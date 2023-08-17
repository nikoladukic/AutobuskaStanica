/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesto;

import autobus.AddNewAutobusTest;
import domain.Mesto;
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
public class GetAllMestoTest {
    @Test
    public void testGetAllAutobus() {
        try {
            
            
            RepositoryMesto repository = new RepositoryMesto();
            
            List<Mesto> mesta =  repository.getAll();
            
            Assert.assertNotSame(1, mesta.size());
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
