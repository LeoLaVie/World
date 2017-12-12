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
    private String name;
    /** The description of the item */ 
    private String description;
    private boolean display;

    /**
     * Constructor for objects of class Items
     */
    public Items(String newName, String aDescription)
    {
        name = newName;
        description = aDescription;
        display = false;
    }

    /**
     * This method returns the description of an item.
     * @return String   description of the item
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
      * This method returns the name of an item.
      * @return String    name of the item
     */
    public String getName()
    {
        return name;
    }
    
    /** 
     * This method is in contruction
     * Allow to know if the character us equiped or not
     */
    public void equip()
    {         
    }
    
        /**
     * This method returns if the item is managed.
     * @return Boolean : true if this item is displayed.
     */
    public boolean getDisplay()
    {
        return display;
    }
    
        /**
     * This method returns if the item is managed.
     * @return Boolean : true if this item is displayed.
     */
    public void setManaged()
    {
        if (this.getDisplay()==true)
        {
            this.display=false;
        }
        else
        {
            this.display=true;
        }
    }
}

