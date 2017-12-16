package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.JButton;

/**
 * This class allows to manage the different rooms in our game. Allows to create
 * exits in a room
 *
 * @author (Grp 10)
 * @version (23 novembre 2017)
 */
public class Room {

    // instance variables - 
    private String descriptionRoom;
    // Description of the room

    private HashMap<String, Door> myExit;
    // All the exits present in the room

    private String nameRoom;
    // Name of the Room.

    private Chest chest;
    // Chest in the room

    private Items item;
    // Item in the room

    private KindNPC kNPC;
    // Kind NPC in the room

    private MeanNPC mNPC;
    // Mean NPC in the room

    private Fight f;

    /**
     * Constructor for objects of class Room
     *
     * @param nameRoom roomName The name of the Room
     * @param descriptionRoom The picture of the background of the room
     */
    public Room(String nameRoom, String descriptionRoom) {
        this.nameRoom = nameRoom;
        this.descriptionRoom = descriptionRoom;

        // instanciation of the HashMap that will contains the exits of the room
        myExit = new HashMap<String, Door>();
        chest = null;

    }

    
    /**
     * Method getter to return the room's name
     * @return nameRoom the name of room
     */
    public String getNameRoom() {
        return nameRoom;
    }

    /**
     * Method getter to return the kind npc
     * @return kNPC it is the kind npc of the room
     */
    public KindNPC getKNPC() {
        return kNPC;
    }

    /**
     * Allows to add a simple or locked exit in the room
     *
     * @param action The direction for the door(East,West,South,Nort,Up,Down)
     * @param keyLocked A boolean to know if the door is locked or not
     * @param nextRoom The room behind the door
     */
    public void setExit(String action, Key keyLocked, Room nextRoom) {
        if (!this.myExit.containsKey(action)) {
            if (keyLocked != null) // there is a key
            {
                this.myExit.put(action, new LockedDoor(nextRoom, this, keyLocked));
            } else {
                this.myExit.put(action, new Door(nextRoom, this));
            }
        } else {
            System.out.println("Error");
        }
    }

    /**
     * Accessor for the different exits of a room.
     *
     * @return a hashmap containing the exits.
     */
    public HashMap<String, Door> getExit() {
        return (myExit);
    }

    /**
     * To get the description of the Room
     *
     * @return The description of the room.
     *
     */
    public String getDescription() {
        return descriptionRoom;
    }

    /**
     * return if they are a chest in the room
     * @return the chest
     */
    public Chest getChest() {
        return chest;
    }

    /**
     * method for add a chest in a room
     * @param aChest add a chest in a room
     */
    public void addChest(Chest aChest) {
        chest = aChest;
    }

    /**
     * boolean true if there is a chest in the room
     *
     * @return true
     */
    public boolean hasChest() {
        if (this.chest != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * boolean true if there is a chest in the room
     *
     * @return true
     */
    public boolean hasKNPC() {
        if (this.kNPC != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * boolean true if there is a chest in the room
     *
     * @return true
     */
    public boolean hasMNPC() {
        if (this.mNPC != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to add a Kind NPC in the corresponding room
     * @param kiNPC adding a kind npc in a room
     */
    public void addkNPC(KindNPC kiNPC) {
        kNPC = kiNPC;
    }

    /**
     * Method to add a Mean NPC in the corresponding room
     * @param meNPC adding a mean npc in a room
     */
    public void addmNPC(MeanNPC meNPC) {
        mNPC = meNPC;
    }

    /**
     * Method to add a fight in the corresponding room
     * @param f1 adding a fight event in a room
     */
    public void addFight(Fight f1) {
        f = f1;
    }


    /**
    * Method to return an array list item
    * @return item which is array list
    */    
    public Items getItem() {
        return item;
    }
    
    /**
    * Method to return an kind npc
    * @return kNPC
    */   
    public KindNPC getkNPC() {
        return kNPC;
    }

    /**
    * Method to return a mean NPC
    * @return mNPC
    */   
    public MeanNPC getmNPC() {
        return mNPC;
    }

    /**
    * Method to return the description of the room
    * @return descriptionRoom
    */   
    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    /**
    * Method to return the event fight
    * @return f
    */   
    public Fight getF1() {
        return f;
    }

}
