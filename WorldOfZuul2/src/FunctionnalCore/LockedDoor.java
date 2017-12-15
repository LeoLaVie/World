package FunctionnalCore;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Lets you tell the difference between locked doors that require a key to be
 * opened from those still open and therefor do not require keys
 *
 * @author (Grp10)
 * @version (20 novembre 2017)
 */
public class LockedDoor extends Door {

    // Key attribute that corresponds to the key number
    private Key key;
    // Attribute of type boolean which takes the value true if the door is closed and false if it is open

    private boolean locked;

    /**
     * LockedDoor class object builder, in addition to the following and
     * previous parts, has an identifier of int type which corresponds to the
     * key
     */
    public LockedDoor(Room nextRoom, Room previousRoom, Key keyLocked) {
        super(nextRoom, previousRoom);
        this.locked = true; // The door is locked
        this.key = keyLocked;
        // initialisation des variables d'instance

    }

    /**
     * The isOk method makes it possible to verify that the player has the key
     *
     * @param player The player that wants to open the door
     * @return A true boolean if the key is good and false if the key is not
     * good
     */
    public boolean isOk(Player player) {
        if (player.haveKey(this.key)) {
            unlock(); // The player has the key in his inventory.
            return true;
        } else {
            return false; // The player has not the key.
        }
    }

    /**
     * The isLocked method is used to verify that the door is locked or not
     *
     * @return A true boolean if the door is open or false is closed depending
     * on the state of the door
     */
    public boolean isLocked() {
        if (this.locked) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The unlock method allows you to unlock the door if the key provided is
     * the correct one
     *
     * @param locked provideKey is th number of the key provided
     */
    public void unlock() {
        if (!isLocked()) {
            System.out.println("The door is already unlocked");
        } else {
            this.locked = false;
        }
    }

    /**
     * The nextRoom method is used to obtain the next room reference provided
     * that the door is unlocked
     *
     * @return return the next coin if the coin is unlocked and the previous
     * coin is locked
     */
    public Room nextRoom() {
        if (isLocked()) {
            return null;
        } else {
            return this.getNextRoom();
        }
    }

    /**
     * To get the key of the locked door
     *
     * @return The key that opens the locked door.
     */
    public Key getKey() {
        return this.key;
    }

}
