package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ChestTest.
 *
 * @author  (Jamot Nicolas)
 * @version (a version number or a date)
 */
public class ChestTest
{
    private Chest chest;
    private Lock locked;
    private Key key1, key2;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        locked = new Lock();
        key1 = new Key("key for chest", "test key1", null);
        key2 = new Key("other key", "test key2", null);
        chest = new Chest("chest for test", "beautiful chest", locked, null);
        locked.addKey(key1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    @Test
    public void testChest()
    {
        assertEquals("chest for test", chest.getName());
        assertEquals("beautiful chest", chest.getDescription());
        assertEquals(locked, chest.getLock());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void testOpen ()
    {
        assertEquals(true, chest.getLock());
        chest.openChest(key2);
        assertEquals(true, chest.getLock());
        chest.openChest(key1);
        assertEquals(false, chest.getLock());
    }

    private void assertEquals(String b, String lock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(boolean b, Lock lock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(Lock locked, Lock lock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
