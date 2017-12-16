package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class weapon allows to know if the player is equiped. And the damage
 * generate by this weapon. The class is extends with Items because the list of
 * the weapons is present in this class
 *
 * @author G10
 * @version nov 2017
 */
public class Weapon extends Items {
    // instance variables 

    /**
     * the player is equiped or not with a weapon
     */
    private boolean equiped;

    /**
     * attribut for the weapon causes a number of damage
     */
    private int damages;

    /**
     * Constructor for objects of class weapon
     * @param newName name of the weapon
     * @param aDescription description of the weapon
     * @param nbDamage the number of the damage of the weapon
     */
    public Weapon(String newName, String aDescription, int nbDamage) {
        super(newName, aDescription);
        damages = nbDamage;
        equiped = false;
    }

    /**
     * This method returns if the weapon is use by the player
     * 
     *@return boolean equiped
     */
    public boolean getEquiped() {
        return equiped;
    }

    /**
     * This method returns the number of damages of a weapon.
     *
     * @return integer : number of damages of the weapon
     */
    public int getDamages() {
        return damages;
    }

    /**
     * This method allows the character to equip or unequip a weapon.
     *
     */
    public void equip() {
        if (this.getEquiped() == false) {
            equiped = true;
        } else {
            equiped = false;
        }
    }
}


