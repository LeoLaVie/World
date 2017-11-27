package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * MeanNPC class - This class allows to manage the nasty NPCs
 *
 * @author (Grp10)
 * @version (11/2017)
 */
public class MeanNPC
{
    /** NPC's name */
    private String nameMNPC, nameMPC;
    /** Room where the NPC is */
    private Room roomMNPC, roomMPC;
    /** Number of NPC health points */
    private int health, health1;
    /** Damage caused by a NPC attack */
    private int attack, attack1;
    /** Boolean that says if the boolean is alive or not */
    private boolean alive, live;

    /**
     * Constructor for objects of class NPC
     */
    public MeanNPC(String nameMPC, Room roomMPC, int health1, int attack1, boolean live)
    {
        // initialise instance variables
        nameMNPC = nameMPC;
        roomMNPC = roomMPC;
        health = health1;
        attack = attack1;
        alive = live;
    }
    
    /**
     * Method getHealth - This method displays the NPC health points
     *
     * @param  
     * @return    
     */
    public int getHealth()
    {
          return health;
    } 
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setHealth(int health, int attPower)
    {
        this.health = health - attPower;
    }
    
    /**
     * Method losePointNPC - This method allows to manage the NPC health points during a fight
     *
     * @param  
     * @return    
     */
    public void losePointNPC(int lostHP)
    {
    }
    
    /**
     * Method getAlive - This method allows to display if the NPC is alive or not
     *
     * @param  
     * @return    
     */
    public boolean getAlive()
    {
          return alive;  
    }
    
    /**
     * Method getAttaque - This method allows to display the damage caused by a NPC attack
     *
     * @param  
     * @return    
     */
    public int getAttack()
    {
          return attack;
    }
    
    /**
     * Method getNameMNPC - This method displays the name of the nasty NPC
     *
     * @param  
     * @return    
     */
    public String getNameMNPC()
     {
          return nameMNPC;
     }

    /**
     * Method displayDialogue - This method displays the nasty NPC dialogue on the terminal
     *
     * @param  
     * @return    
     */
    public void displayDialogue()
    {
        System.out.println("*** Hello dear Enemy ! My name is " + nameMNPC + " and I would like to KILL you ! ***");
        System.out.println("*** Do you want to confront me ? ***");
    }

}
