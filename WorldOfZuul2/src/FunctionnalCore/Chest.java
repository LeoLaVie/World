package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class chest allows to lead the chests: the name, the description,
 * if it is open or not with a key.
 * 
 * @author G10
 * @version nov 2017
 */
public class Chest
{
    // instance variables - replace the example below with your own
    private Lock alock;
    private String name;
    private String description;
    private Room room;

    /**
     * Constructor for objects of class Chest
     */
    public Chest(String nameChest, String descriptionChest, Lock aLock, Room room)
    {
        name = nameChest;
        description = descriptionChest;
        alock = aLock;        
    }

    /**
      * This method returns the name of the chest.
      * @return String name of chest
      */
    public String getName()
    {
	return name;
    }
    
    /**
      * This method returns the name of the chest.
      * @return String name of chest
      */
    public String getDescription()
    {
	return description;
    }
    
    /**
      * Access to the chest locket
      * @return Lock : chest locket 
      */
    public Lock getLock()
    {
        return alock;
    }
    
    public boolean openChest(Key key)
    {
        if (alock.unlock(key) == true)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
