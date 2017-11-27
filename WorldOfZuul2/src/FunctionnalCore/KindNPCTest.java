package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KindNPCTest.
 *
 * @author  (Grp10)
 * @version 2017-nov
 */
public class KindNPCTest
{
    private KindNPC kindNPC;
    private Room room1;
    
    /**
     * Default constructor for test class EnigmaTest
     */
    public KindNPCTest()
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
        kindNPC = new KindNPC("Loulou", room1, "Qu'est-ce qui est vert et long?", "Un poireau", true);
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
     * Method testGettersOk: with a correct enigma
     * getters are supposed to return constructor parameter values
     * Expected value for questions = "Qu'est-ce qui est vert et long?"
     * Expected value for answers = "Un poireau"
     * Expected value for enable = true
     * Expected value for indexEnigma = 1
     */
    public void testGettersOk()
    {
        assertEquals("Loulou", kindNPC.getNameKNPC());
        assertEquals(room1, kindNPC.getRoomKNPC());
        assertEquals("Un poireau", kindNPC.getAnswer());
    }
}