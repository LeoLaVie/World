package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The class chest allows to lead the chests: the name, the description, if it
 * is open or not with a key.
 *
 * @author G10
 * @version nov 2017
 */
public class Chest extends Inventory {

    // instance variables - replace the example below with your own
    private Lock lock;
    private String name;
    private String description;
    private Inventory inventory;

    /**
     * Constructor for objects of class Chest
     * @param aName string for the name of the chest
     * @param aDescription string for the description of the chest
     * @param maxItems int for the items
     * @param golds integer for the gold
     * @param aLock class Lock
     */
    public Chest(String aName, String aDescription, int maxItems, int golds, Lock aLock) {
        super(maxItems, golds);
        name = aName;
        description = aDescription;
        lock = aLock;
    }

    /**
     * This method returns the name of the chest.
     *
     * @return String name of chest
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the name of the chest.
     *
     * @return String name of chest
     */
    public String getDescription() {
        return description;
    }

    /**
     * Access to the chest locket
     *
     * @return Lock : chest locket
     */
    public Lock getLock() {
        return lock;
    }

   /**
    * Method to change the status of the chest
    * @param key the attribut key
    * @return boolean, true if the chest is open, false if is not
    */
    public boolean openChest(Key key) {
        if (lock.unlock(key) == true) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method deletes one item in a chest. New method for chest : test if
     * the chest is open or not
     *
     * @param itemToDelete The item deleted to the inventory
     * @return True if it works or false if it don't (chest close)
     */
    public boolean deleteItem(Items itemToDelete) {
        if (lock.getLock() == false) {
            inventory.deleteItem(itemToDelete);
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method allow to add or remove money (by minus int) from the
     * inventory
     *
     * @param money the money you try to add
     * @return If the money can be add or not : depending if the chest is open
     * or not
     */
    public boolean manageGold(int money) {
        if (lock.getLock() == false) {
            return super.manageGold(money);
        } else {
            return false;
        }
    }

    /**
     * Method getter to return the inventory
     * @return inventory 
     */
    public Inventory getInventory() {
        return inventory;
    }

}

