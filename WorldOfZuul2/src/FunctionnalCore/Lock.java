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
public class Lock
{
    private Key key;
    private boolean lock;

    /**
     * Constructor for objects of class Lock
     */
    public Lock()
    {
        lock = true;
        key = null;
    }
    
    /**
     *  return if the lock is false or not
     */
    public boolean getLock()
    {
        return lock;
    }
    
    /**
     *  return if the lock is false or not
     */
    public Key getKey()
    {
        return key;
    }
    
    public void addKey(Key newKey)
    {
    if (key == null)
    {
            key = newKey; 
        }
    }
    
    public boolean unlock(Key keyTest)
    {
    if (keyTest.getKeyToken() == key.getKeyToken())
    {
        lock = false; 
        return true;
    }
    else
    {
        return false;
    }
    }
}


