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
public class Key extends Items {

    private String keyToken;

    /**
     * Constructor for objects of class Key
     */
    public Key(String name, String description) {
        super(name, description);
        keyToken = UUID.randomUUID().toString();
    }

    /**
     * @return the key token
     */
    public String getKeyToken() {
        return keyToken;
    }
}

