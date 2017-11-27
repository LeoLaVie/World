package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class inventory allows to lead the inventory of the player
 *
 * @author G10
 * @version nov 2017
 */
public class Inventory
{
    // instance variables 
    /** List of the all the items of the inventory */
    private ArrayList<Items> items;
    private Player player;
   
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        items = new ArrayList<Items>();   
    }

    /**
     * This method returns a list of item from the inventory
     */
    public ArrayList<Items> getItems() {
        return items;
    }
    
    /**
     * This method returns the number of items in the inventory - simple accessor
     */
    public int getNbItems() {
        return this.getItems().size();
    }
    
    /**
     * This method deletes all items in an inventory.
     */
    public void resetInventory() {
        items.clear();
    }
    
    /**
     * This method deletes one item in an inventory.
     *
     * @param item: The item deleted to the inventory
     * @return true if the item is correctly delete
     */
    public boolean deleteItem(Items itemToDelete) {
        items.remove(itemToDelete);
        return true;
    }
    
    /**
     * This method adds one item in an inventory.
     *
     * @param item: The item added to the inventory
     * @return true if the item is correctly add, false if not
     */
    public boolean addItem(Items itemToAdd) {
        if (items.contains(itemToAdd)) {
            return false;
        } else {
            items.add(itemToAdd);
            return true;
        }
    }
}
