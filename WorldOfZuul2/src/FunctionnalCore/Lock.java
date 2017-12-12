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
    private Key associatedKey;
    private boolean locked;

    /**
     * Constructor for objects of class Lock
     */
    public Lock()
    {
        locked = true;
        associatedKey = null;
    }
    
    /**
     *  return if the lock is false or not
     */
    public boolean getLock()
    {
        return locked;
    }
    
    /**
     *  return if the lock is false or not
     */
    public Key getKey()
    {
        return associatedKey;
    }
    
    public void addKey(Key newKey)
    {
    if (associatedKey == null)
    {
            associatedKey = newKey; 
        }
    }
    
    public boolean unlock(Key keyTest)
    {
    if (keyTest.getKeyToken() == associatedKey.getKeyToken())
    {
        locked = false; 
        return true;
    }
    else
    {
        locked = true;
        return false;
    }
    }
}


