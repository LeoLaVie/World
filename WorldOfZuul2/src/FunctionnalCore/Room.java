package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * This class allows to manage the different rooms in our game. 
 * Allows to create exits in a room
 * 
 * @author (CHAMFEUIL Victor-Gabriel)
 * @version (23 novembre 2017)
 */
public class Room
{
    // instance variables - 
    private String descriptionRoom;
    // Description of the room

    private HashMap <String, Door> myExit;
    // All the exits present in the room

    private String nameRoom;
    // Name of the Room.
    
    private Chest chest;
    
    private Items item;
    
    private KindNPC kNPC;
    
    private MeanNPC mNPC;
    
    /**
     * Constructor for objects of class Room
     * @param roomName The name of the Room
     * @param background The picture of the background of the room 
     */
    public Room(String nameRoom, String descriptionRoom)
    {
        this.descriptionRoom = descriptionRoom; 

        myExit = new HashMap <String, Door>(); 
        // instanciation of the HashMap that will contains the exits of the room

    }

    Room(String room1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Allows to add a simple or locked exit in the room
     * 
     * @param direction The direction for the door (East,West,South,Nort,Up,Down)
     * @param lock A boolean to know if the door is locked or not
     * @param nextRoom The room behind the door
     */
    public void setExit(String direction, Key lock, Room nextRoom)
    {
        
    }
    
    /**
     * Allows to recover a door in the room for a specific decision.
     * @return an exit
     */
    public String getExit()
    {
        return null;
    }

    /** 
     * To get the description of the Room
     * @return The description of the room.
     * 
     */
    public String getDescription()
    {
        return descriptionRoom;
    }
    
    /**
     * return if they are a chest in the room
     */
    public Chest getChest() {
        return chest;
    }
            
    /**
     * method for add a chest in a room
     */
    public void addChest(Chest aChest) {
        chest = aChest;
    }
    
    /** boolean true if there is a chest in the room
     * @return true
     */
    public boolean hasChest() {
        if (this.chest != null)
            return true;
        else
            return false;
    }
    /** 
     * 
     * @param it
     */
    public void addItem(Items it) {
        item = it;
    }
    
    /** 
     * 
     */
    public void addkNPC(KindNPC kiNPC) {
        kNPC = kiNPC;
    }
    
    /** 
     * 
     */
    public void addmNPC(MeanNPC meNPC) {
        mNPC = meNPC;
    }
    
}