package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.UUID;

/**
 * Write a description of class Key here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Key extends Items
{
    private String keyToken;
    private String description;
    private int index;

    /**
     * Constructor for objects of class Key
     */
    public Key(String newItem, String newDescription)
    {
        super(newItem,newDescription);
        keyToken = UUID.randomUUID().toString();
        index = 0;
    }
    
    /**
      * @return the key token
      */
    public String getKeyToken()
    {
	return keyToken;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return index + y;
    }
}
