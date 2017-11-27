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
    private String nameKNPC, a;
    // Enigma that the NPC will give to the player
    private String enigma, c;
    // Enigma's answer
    private String answer, d;
    //Enigma's availability
    private boolean available, disp;
    /**
     * Constructor for objects of class NPC
     */
    public KindNPC(String a, String c, String d, boolean disp)
    {
        // initialise instance variables
        nameKNPC = a;
        enigma = c;
        answer = d;
        available = disp;
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
        return nameKNPC;
    }
    
    /**
     * Method getAnswer - This method displays the answer of the enigma linked to the kind NPC
     *
     * @param  
     * @return    
     */
    public String getAnswer()
    {

        return answer;
    }
    
    
    /**
     * Method getAvailability - This method displays the availability of the enigma linked to the kind NPC
     *
     * @param  
     * @return    
     */
    public boolean getAvailability()
    {
        // put your code here
        available = false;
        return available;
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

}