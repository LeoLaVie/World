package FunctionnalCore;


import Interface.InterfaceGameOver;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

/**
 *The class player allows to take care of the character of the game.
 *
 * @author G10
 * @version nov 2017
 */
public class Player
{
    /** instance variables */
    private static String name;
    /**the health points of the character
     * the max health points of the character.*/
    private int health, maxHealth;
    /**the character is alive or not*/
    private boolean aLive;
    /**the character is in fight or not.*/
    private boolean inFight;
    /**where the character is in the town.*/
    private Room location;
    /**the inventory of the character*/
    public Inventory inventory;    
    private int attPower;
    private Weapon weapon;
    private Usable usable;
    private int soin;
    private int nouvHealth;
    private ArrayList<Items> items;
    
    /**
     * Constructor for objects of class Player. 
     */
    public Player(String newName)
    {
        if (newName.equals(""))
        {
           name = "Feignant";
        }
       else
       {
           name = newName;
       }
       
       attPower = 30;
       health = 100;
       maxHealth = 100;
       inFight = false;
       aLive = true;
       inventory = new Inventory(10);
       location = new Room("Start", "good to start");       
    }
    
    /**
     * This method returns the name of the character.
     */    
    public static String getName()
    {
        return name;
    }
    
    
    /**
     * This method returns the health points of the character.
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
     * This method returns the max health points of the character.
     */
     public int getMaxHealth()
    {
        return maxHealth;
     }
     
         /**
     * Return true if the player has a specific key
     * @param key The specific key
     * @return Return true if the player has a specific key
     */
    public boolean haveKey(Key key){
        for (Items item : items) {
            if(item.equals(key))
                return true;
        }
        return false;
    }

    /**
     * This method allows to loose points when the character loose a fight.. .
     */
    public void looseHealth(int hp)
    {
        if(health < 0 | health == 0){
            aLive = false;
            new InterfaceGameOver();
        }
        else
        {
            health += hp;
        }
    }

    /**
     * This method allows to win points when a potion is use. 
     */
    public void addHealth()
    {       
        if (health + usable.getCare() > maxHealth)
        {
            health = maxHealth;
        }
        else
        {
             health += usable.getCare();         
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int calculSoin()
    {
        if (health + usable.getCare() > maxHealth)
        {
            soin = maxHealth - health;
        }
        else if (health > usable.getCare())
        {
            soin = health - usable.getCare();
        }
        else
        {
            nouvHealth += usable.getCare();
            soin = health - health;
        }
        return soin;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAttPower()
    {
        return attPower;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setAttPower(int attPower)
    {
        this.attPower = weapon.getDamages();
    }
    
    /**
     * Method for return the statut alive
     * 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean getALive()
    {
        // put your code here
        setaLive(aLive);
        return aLive;
    }
    
    /**
     * Method for modify the statut of player in death for the random death event.
     *
     * @param  aLive
     * @return   nothing
     */
    public void setaLive(boolean aLive)
    {
        aLive = false;
    }
    
     /**
     * This method return the location of the character in the town
     */
    public Room getLocation()
    {
        return location;
    }
    
    public void moveRoom(Room newRoom)
    {
        location = newRoom;
    }

    
    /**
     * return the inventory of the player
     */
    public Inventory getInventory() {
        return inventory;
    }

        /**
     * This method modifies HP of the character
     *
     * @param hp HP added to the character. Negative value to take damages. HP max are 20
     */
    public void manageHealth(int hp)
    {
        if (health + hp > maxHealth)
        {
            health = maxHealth;
        }
        else if (health + hp < 0)
        {
            health = 0;
        }
        else
        {
            health += hp;
        }
    }
}
