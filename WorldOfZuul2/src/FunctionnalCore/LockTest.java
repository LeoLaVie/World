package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LockTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LockTest
{
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
        key1 = new Key("first key", "first key descript");
        key2 = new Key("second key", "second key descript");
        locked = new Lock();
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
    public void testKey()
    {
        assertSame(key1, locked.getKey());
    }

    /**
     * check fi the method unlock works with the good key
     *
     */
    @Test
    public void key1Test()
    {
        locked.unlock(key1);
        assertSame(key1, locked.getKey());
        assertEquals(false, locked.getLock());
    }
    
    /**
     * check if the method unlock works with a wrong key
     *
     */
    @Test
    public void key2Test()
    {
        locked.unlock(key2);
        assertSame(key2, locked.getKey());
        assertEquals(true, locked.getLock());
    }

}
