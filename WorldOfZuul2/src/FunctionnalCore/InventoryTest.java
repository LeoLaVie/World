package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * The test class InventoryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InventoryTest
{
    private Inventory inventory;
    private ArrayList<Items> items;
    private Usable usable;
    private Weapon weapon;
    private Key key1, key2, key3;   
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        inventory = new Inventory();
        usable = new Usable("Potion", "Add health point", 20);
        key1 = new Key("first key", "first key description");
        weapon = new Weapon("hache", "cut", 50);
        items = new ArrayList<Items>();
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
    public void addInventoryTest()
    {
        items.add(usable);
        inventory.addItem(usable);
        assertEquals(items, inventory.getItems());
        items.add(key1);
        inventory.addItem(key1);
        assertEquals(items, inventory.getItems());
        items.add(weapon);
        inventory.addItem(weapon);
        assertEquals(items, inventory.getItems());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    @Test
    public void testDeleteInventory()
    {
        items.add(usable);
        inventory.addItem(usable);
        assertEquals(items, inventory.getItems());
        items.add(key1);
        inventory.addItem(key1);
        assertEquals(items, inventory.getItems());
        items.add(weapon);
        inventory.addItem(weapon);
        assertEquals(items, inventory.getItems());
        items.remove(usable);
        inventory.deleteItem(usable);
        assertEquals(items, inventory.getItems());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    @Test
    public void testResetInventory()
    {
        inventory.addItem(usable);
        inventory.addItem(key1);
        inventory.addItem(weapon);
        inventory.resetInventory();
        assertEquals(items, inventory.getItems());
    }

    private void assertEquals(ArrayList<Items> items, ArrayList<Items> items0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
