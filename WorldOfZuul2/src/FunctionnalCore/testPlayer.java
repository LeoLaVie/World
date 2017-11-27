package FunctionnalCore;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testPlayer.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testPlayer
{
    private Player p1;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        p1 = new Player("Pseudo");
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
     * Method testCharacterEmptyName
     * <p>test the constructor with the default value "feignant"</p>
     */
     @Test
     public void testCharacterEmptyName()
     {
	Player p2 = new Player("Player");
	assertEquals(p2.getName(), "feignant");	
     }
    
    /**
     * Method testCharacter
     * <p>test the constructor with the setUp value</p>
     */
    @Test
    public void testCharacter()
    {
    	assertEquals(p1.getName(), "Pseudo");
    }
    
	/**
	 * Method testSetHealth
	 * <p>This method test that a player's hp will never go out of [0/MaxHp]</p>
	 * <p>It also test if the health is correctly modified</p>
	 * 
	 */
	@Test
	public void testAddHealth() 
	{
		//p1.addHealth(p1.getMaxHealth() + 200);
		//assertEquals(p1.getHealth(),p1.getMaxHealth());
	}
    
		/**
	 * Method testSetHealth
	 * <p>This method test that a player's hp will never go out of [0/MaxHp]</p>
	 * <p>It also test if the health is correctly modified</p>
	 */
	@Test
	public void testLooseHealth() 
	{
		//p1.addHealth(-300);
		//assertEquals(p1.getHealth(),p1.getMaxHealth());
	}

    private void assertEquals(String name, String feignant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
