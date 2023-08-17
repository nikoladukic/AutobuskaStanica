
package autobus;
import org.junit.Test;
import static org.junit.Assert.*;
import domain.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.db.impl.*;

/**
 *
 * @author PC
 */
public class AddNewAutobusTest {
    
    
    @Test
    public void testInsertObject() {
        try {
            
            Autobus autobus = new Autobus("1212da", "marka", 2001, 11, new VrstaAutobusa((long)300, "Kombi"));
            
            RepositoryDBGeneric repository = new RepositoryDBGeneric();
            
            int result = repository.add(autobus);
            
            assertEquals(1, result);
        } catch (Exception ex) {
            Logger.getLogger(AddNewAutobusTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
