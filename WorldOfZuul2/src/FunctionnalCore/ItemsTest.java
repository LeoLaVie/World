package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ItemsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ItemsTest
{
    private Items items;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        items = new Items("name test item", "description test item", null);
    }

    /**
     * 
     *
     */
    @Test
    public void testGettersOk()
    {
        assertEquals("name test item", items.getName());
        assertEquals("description test item", items.getDescription());
    }

    private void assertEquals(String name_test_item, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
