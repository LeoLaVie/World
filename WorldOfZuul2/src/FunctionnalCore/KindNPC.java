package FunctionnalCore;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

/**
 * Kind NPC class - This class allows to manage the kind NPCs
 *
 * @author (Grp10)
 * @version (11/2017)
 */
public class KindNPC
{
    // NPC's name
    private String nameKNPC;
    // Room where the NPC is
    private Room roomKNPC;
    // Enigma that the NPC will give to the player
    private String enigma;
    // Enigma's answer
    private String answer;
    // ...
    private String a, c, d;
    // ...
    private Room b;

    /**
     * Constructor for objects of class NPC
     */
    public KindNPC(String a, Room b, String c, String d)
    {
        // initialise instance variables
        nameKNPC = a;
        roomKNPC = b;
        enigma = c;
        answer = d;
    }
    
    /**
     * Method getNameKNPC - This method displays the name of the kind NPC
     *
     * @param  
     * @return    
     */
    public String getNameKNPC()
    {
        // put your code here
        return a;
    }
    
    /**
     * Method getRoomKNPC - This method displays the name of the room where the kind NPC is
     *
     * @param  
     * @return    
     */
    public Room getRoomKNPC()
    {
        // put your code here
        return b;
    }

    /**
     * Method getEnigma - This method displays the enigma linked to the kind NPC
     *
     * @param  
     * @return    
     */
    public String getEnigma()
    {
        // put your code here
        return c;
    }
    
    /**
     * Method getAnswer - This method displays the answer of the enigma linked to the kind NPC
     *
     * @param  
     * @return    
     */
    public String getAnswer()
    {
        // put your code here
        return d;
    }
    
    /**
     * Method displayEnigma - This method displays the NPC enigma on the terminal
     *
     * @param  
     * @return    
     */
    public void displayEnigma()
    {
        System.out.println("*** Hello my Friend ! My name is " + nameKNPC + " and I would like to help you ! ***");
        System.out.println("*** Can you solve the following riddle please ? " + enigma + " ***");
    }
    
    /**
     * Method checkAnswer - This method checks if the answer provided is right
     *
     * @param  
     * @return    
     */
    public String checkAnswer(String reponse)
    {
        // put your code here
        // If reponse = answer ...
        // If reponse /= answer ...
        return "";
    }

}
