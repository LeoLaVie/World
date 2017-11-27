package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class weapon allows to know if the player is equiped.
 * And the damage generate by this weapon.
 * The class is extends with Items because the list of the weapons is present in this class
 *
 * @author G10
 * @version nov 2017
 */
public class Weapon extends Items
{
    // instance variables 
    /** the player is equiped or not*/
    private boolean equiped;
    /**the weapon causes a number of damage*/
    private int damage;

    /**
     * Constructor for objects of class weapon
     */
    public Weapon(String name, String description, int nbDamage)
    {
        super(name,description);
        damage = nbDamage;
        equiped = false;
    }
    
    /**
     * This method returns if the weapon is use by the player
     */
    public boolean getEquiped()
    {
        return equiped;
    }
    
    /**
      * This method returns the number of damages of a weapon.
      * @return integer : number of damages of the weapon
      */
    public int getDamages()
    {
        return damage;
    }
    
    /**
      * This method allows the character to equip or unequip a weapon.
      * @return boolean : true if the the character is equiped
      */
    public void equip()
    {
        if (this.getEquiped()==false)
        {
            equiped=true;
        }
        else
        {
        equiped=false;
        }
    }   
}

