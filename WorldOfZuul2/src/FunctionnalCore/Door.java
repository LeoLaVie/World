package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * This Door class stands for a door that a player can use to navigate between two different rooms. 
 *
 * 
 * @author (CHAMFEUIL Victor-gabriel)
 * @version (23 novembre 2017)
 */
public class Door
{
    // the next room 
    private Room nextRoom;

    // the previous room 
    private Room previousRoom;

    /**
     * Constructor of the class Door.
     * 
     * @param nextRoom The next room
     * @param previousRoom The previous room
     */
    public Door (Room nextRoom, Room previousRoom)
    {
        this.nextRoom=nextRoom;
        this.previousRoom=previousRoom;

    }  

    /**
     * Function to know the next room of the player.
     *
     * @returnThe next room  of the player. 
     */
    public Room getNextRoom()
    {
        return null;

    }

    /**
     * Function to know the previous room of the player.
     * @return The previous room  of the player. coucoucoucou
     */
    public Room getPreviousRoom(){
        return null;
    }

}