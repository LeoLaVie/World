package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * Usable class allows to lead the potions with the health points
 *
 * @author G10
 * @version nov 2017
 */
public class Usable extends Items
{
    // instance variables - replace the example below with your own
    private int pdv;
    private String effect;

    /**
     * Constructor for objects of class Usable
     */
    public Usable(String name, String description, int Health)
    {
        super(name,description);
        pdv = Health;
    }

    
    /**
      * This method returns the number of health points give by the consumable.
      * @return integer : number of health points
      */
    public int getHealth()
    {
        return pdv;
    }

}
