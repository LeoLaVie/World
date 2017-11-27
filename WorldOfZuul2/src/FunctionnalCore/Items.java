package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class Items allos to lead the different items of the game
 *
 * @author G10
 * @version nov 2017
 */
public class Items
{
    // instance variables 
    /** The name of the item */ 
    private String nameItem;
    /** The description of the item */ 
    private String descriptionItem;
    private Room room;

    /**
     * Constructor for objects of class Items
     */
    public Items(String name, String description, Room room)
    {
        nameItem = name;
        descriptionItem = description;
    }

    /**
     * This method returns the description of an item.
     * @return String   description of the item
     */
    public String getDescription()
    {
        return descriptionItem;
    }
    
    /**
      * This method returns the name of an item.
      * @return String	name of the item
     */
    public String getName()
    {
        return nameItem;
    }
    
    /** 
     * This method is in contruction
     * Allow to know if the character us equiped or not
     */
    public void equip()
    {		 
    }
}

