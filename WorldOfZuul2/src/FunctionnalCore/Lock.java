package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * The Lock class allows to lead the keys
 *
 * @author G10
 * @version nov 2017
 */
public class Lock {

    private Key key;
    private boolean lock;

    /**
     * Constructor for objects of class Lock
     */
    public Lock() {
        lock = true;
        key = null;
    }

    /**
     * return if the lock is false or not
     * @return lock boolean
     */
    public boolean getLock() {
        return lock;
    }

    /**
     * Method to return if the lock is false or not
     * @return key of class Key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Method to add a key in the class lock
     *
     * @param newKey a new key for the class lock
     */
    public void addKey(Key newKey) {
        if (key == null) {
            key = newKey;
        }
    }

    /**
     * Method boolean for return the statut of the chest, lock or unlock
     *
     * @param keyTest it is a class Key
     * @return boolean 
     */
    public boolean unlock(Key keyTest) {
        if (keyTest.getKeyToken() == key.getKeyToken()) {
            lock = false;
            return true;
        } else {
            return false;
        }
    }
}
