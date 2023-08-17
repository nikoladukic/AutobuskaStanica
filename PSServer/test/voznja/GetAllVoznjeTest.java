/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voznja;

import domain.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import repository.db.impl.RepositoryVoznja;

/**
 *
 * @author PC
 */
public class GetAllVoznjeTest {
    
    @Test
    public void testGetAllAutobus() {
        try {
            
            
            RepositoryVoznja repository = new RepositoryVoznja();
            
            List<Voznja> voznje =  repository.getAll();
            
            Assert.assertNotSame(1, voznje.size());
        } catch (Exception ex) {
            Logger.getLogger(AddNewVoznjaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
