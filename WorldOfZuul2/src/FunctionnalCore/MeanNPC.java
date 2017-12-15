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
public class MeanNPC {

    /**
     * NPC's name
     */
    private String nameMNPC;
    /**
     * Number of NPC health points
     */
    private int health;
    /**
     * Damage caused by a NPC attack
     */
    private int attack;
    /**
     * Boolean that says if the boolean is alive or not
     */
    private boolean alive;

    /**
     * Constructor for objects of class NPC
     */
    public MeanNPC(String nameMPC, int health1, int attack1, boolean live) {
        // initialise instance variables
        nameMNPC = nameMPC;
        health = health1;
        attack = attack1;
        alive = live;
    }

    /**
     * Method getHealth - This method displays the NPC health points
     *
     * @return NPC's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method setHealth - this method edit the NPC's health when the NPC has an
     * attack of player
     *
     * @param health NPC's health
     * @param attPower Power Attack of the player
     */
    public void setHealth(int health, int attPower) {
        this.health = health - attPower;
    }

    /**
     * Method getAlive - This method allows to display if the NPC is alive or
     * not
     *
     * @return alive - attribut boolean
     */
    public boolean getAlive() {
        return alive;
    }

    /**
     * Method getAttack - This method allows to display the damage caused by a
     * NPC attack
     *
     * @return attack - attribut integer
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Method getNameMNPC - This method displays the name of the nasty NPC
     * return nameMNPC the name of the mean NPC
     */
    public String getNameMNPC() {
        return nameMNPC;
    }

    /**
     * Method displayDialogue - This method displays the nasty NPC dialogue on
     * the terminal
     *
     */
    public void displayDialogue() {
        System.out.println("*** Hello dear Enemy ! My name is " + nameMNPC + " and I would like to KILL you ! ***");
        System.out.println("*** Do you want to confront me ? ***");
    }

    /**
     * Method displaySantaClaus - This method displays the Santa Claus dialogue
     * on the terminal
     *
     */
    public void displaySantaClaus() {
        System.out.println("*** Hello dear Enemy ! I am the " + nameMNPC + " You are lucky to have arrived here ! ***");
        System.out.println("*** Are you ready to die ? ***");
    }
}
