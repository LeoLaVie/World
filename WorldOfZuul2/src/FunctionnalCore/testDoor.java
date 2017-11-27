package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testDoor. 
 * It is in construction
 *
 * @author  G10
 * @version nov 2017
 */
public class testDoor
{
    protected Door door;
    protected Player player;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        door = new Door(new Room("garden"));
        player = new Player("Maurice");
    }

    /**
     * test if the next room is not empty
     */
    @Test
    public void testNotEmptyRoom()
    {
        assertNotNull(door.getNextRoom());
    }
    
    /**
     * test if the next room is not the same as previous
     */
    @Test
    public void testDifferentRooms() {
       assertNotSame(player.getLocation(),door.getNextRoom());
    }
}
