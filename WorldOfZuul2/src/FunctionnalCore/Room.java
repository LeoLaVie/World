package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.JButton;

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
     * @param roomName The name of the Room
     * @param background The picture of the background of the room 
     */
    public Room(String nameRoom, String descriptionRoom)
    {
        this.nameRoom = nameRoom;
        this.descriptionRoom = descriptionRoom; 

        // instanciation of the HashMap that will contains the exits of the room
        myExit = new HashMap <String, Door>(); 
        chest = null;
        

    }

    public String getNameRoom() {
        return nameRoom;
    }
    
    


    /**
     * Allows to add a simple or locked exit in the room
     * 
     * @param direction The direction for the door (East,West,South,Nort,Up,Down)
     * @param lock A boolean to know if the door is locked or not
     * @param nextRoom The room behind the door
     */
    public void setExit(String action, Key keyLocked, Room nextRoom)
    {
        if(!this.myExit.containsKey(action)) {
            if(keyLocked!=null) // there is a key
                this.myExit.put(action,new LockedDoor(nextRoom,this,keyLocked));
            else 
                this.myExit.put(action, new Door(nextRoom,this));
        }
        else 
            System.out.println("Error");
    }
    
     /**
     * Accessor for the different exits of a room.
     * @return a hashmap containing the exits.
     */
    public HashMap<String,Door> getExit()
    {
        return(myExit);
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
    
    /** boolean true if there is a chest in the room
     * @return true
     */
    public boolean hasKNPC() {
        if (this.kNPC != null)
            return true;
        else
            return false;
    }
        
            /** boolean true if there is a chest in the room
     * @return true
     */
    public boolean hasMNPC() {
        if (this.mNPC != null)
            return true;
        else
            return false;
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
    
    public void addFight(Fight f1) {
        f = f1;
    }

    public Items getItem() {
        return item;
    }

    public KindNPC getkNPC() {
        return kNPC;
    }

    public MeanNPC getmNPC() {
        return mNPC;
    }

    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    public Fight getF1() {
        return f;
    }
    
    
}
