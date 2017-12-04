package FunctionnalCore;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testRoom.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testRoom
{
    protected Room room;
    
    /**
     * Default constructor for test class testRoom
     */
    public testRoom()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
       // room = new Room("Room1");
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
     * Checks if the description given in the constructor are correctly set to the attributes
     */
    @Test
    public void testRoom() {
        assertEquals("Room 1", room.getDescription());
    }
    
    /**
     * Checks if description is not empty
     */
    @Test
    public void testEmptyDescription() {
       // Room Room2 = new Room("");
       // assertEquals("UndescribedRoom", Room2.getDescription());
    }
}
