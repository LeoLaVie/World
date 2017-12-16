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
public class Inventory {

    // instance variables 
    /**
     * List of the all the items of the inventory
     */
    private ArrayList<Items> items;
    private int maxItems;
    private int gold;

    /**
     * Constructor for objects of class Inventory
     * @param nbMaxItems the number of the max items
     */
    public Inventory(int nbMaxItems) {
        items = new ArrayList<Items>();
        gold = 100;
        maxItems = nbMaxItems;
    }

    /**
     * Constructor used only to create a player's inventory
     *
     * @param nbMaxItems int : number max of items in the inventory
     * @param golds int : number of gold in the inventory By default the inventory has any item.
     */
    public Inventory(int nbMaxItems, int golds) {
        items = new ArrayList<Items>();
        if (golds < 0) {
            golds = 0;
        } else {
            gold = golds;
        }
        if (nbMaxItems < 0) {
            maxItems = 10;
        } else {
            maxItems = nbMaxItems;
        }
    }

    /**
     * This method returns a list of item from the inventory
     * @return items it is a array list of item
     */
    public ArrayList<Items> getItems() {
        return items;
    }

    /**
     * This method returns the number of items in the inventory
     * @return the size of the items
     */
    public int getNbItems() {
        return this.getItems().size();
    }

    /**
     * Method to get the number of items max in the inventory
     * @return the maxItems
     */
    public int getMaxItems() {
        return maxItems;
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
     * @param itemToDelete The item deleted to the inventory
     * @return true if the item is correctly delete
     */
    public boolean deleteItem(Items itemToDelete) {
        items.remove(itemToDelete);
        return true;
    }

    /**
     * This method adds one item in an inventory.
     *
     * @param itemToAdd The item added to the inventory
     * @return true if the item is correctly add, false if not
     */
    public boolean addItem(Items itemToAdd) {
        if (items.size() == this.getMaxItems()) {
            return false;
        } else if (items.contains(itemToAdd)) {
            return false;
        } else {
            items.add(itemToAdd);
            return true;
        }
    }

    public void addInventory(Items itemToAdd) {
        items.add(itemToAdd);
    }

    /**
     * This method allow to add or remove money (by minus int) from the
     * inventory
     * @param money integer for the money
     * @return boolean 
     */
    public boolean manageGold(int money) {
        if (gold + money >= 0) {
            gold += money;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns gold from the inventory of a character - simple
     * accessor
     * @return gold
     */
    public int getGold() {
        return gold;
    }
}

