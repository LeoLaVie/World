package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class keyTest.
 *
 * @author  (Jamot Nicolas)
 * @version (a version number or a date)
 */
public class KeyTest
{
    private Key key;
    private Room room;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        key = new Key("Key test", "Key able to open all things");
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
     * Method test key
     */
    @Test
    public void testKey()
    {
        assertEquals("Key test", key.getName());
        assertEquals("Key able to open all things", key.getDescription());
    }

    private void assertEquals(String key_test, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
