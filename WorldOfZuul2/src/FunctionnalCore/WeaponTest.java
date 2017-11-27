package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test WeaponTest.
 *
 * @author  (Jamot Nicolas)
 * @version (23/11/2017)
 */
public class WeaponTest
{
    private Weapon equipment;


    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() 
    {
     equipment = new Weapon("hache", "cut", 20, null);
    }
    
    /**
      * Test if the weapon is correctly completed
      *
      */
    @Test
    public void testWeapon()
    {
        assertEquals("hache", equipment.getName());
        assertEquals("cut", equipment.getDescription());
        assertEquals(20, equipment.getDamages());
        assertEquals(false, equipment.getEquiped());
    }
    
    /**
     * Test if the player can equip and remove a
     * 
     */
    @Test
    public void testEquiped()
    {
        assertEquals(false, equipment.getEquiped());
        equipment.equip();
        assertEquals(true, equipment.getEquiped());
        equipment.equip();
        assertEquals(false, equipment.getEquiped());
    }  

    private void assertEquals(String hache, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(int i, int damages) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(boolean b, boolean equiped) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
