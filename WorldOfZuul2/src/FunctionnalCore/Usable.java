package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * Usable class allows to lead the potions with the health points
 *
 * @author G10
 * @version nov 2017
 */
public class Usable extends Items {

    // instance variables - replace the example below with your own
    private int care;
    private String effect;

    /**
     * Constructor for objects of class Usable
     */
    public Usable(String newName, String aDescription, String anEffect, int HPcare) {
        super(newName, aDescription);
        if (HPcare < 0) {
            care = 0;
        } else {
            care = HPcare;
        }
    }

    public String getEffect() {
        return effect;
    }

    /**
     * This method returns the number of health points give by the consumable.
     *
     * @return integer : number of health points
     */
    public int getCare() {
        return care;
    }
}

