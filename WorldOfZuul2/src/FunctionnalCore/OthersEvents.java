package FunctionnalCore;

import java.lang.Math;
import java.util.*;
import java.io.*;

/**
 * The class OthersEvents allows to lead the fight with the Sauta Claus. Lead
 * the mean events.
 *
 * @author (Grp 10)
 * @version (23/11/2017)
 */
public class OthersEvents extends Events {

    // instance variables - replace the example below with your own
    private int rand;
    private Player player;
    private String answer;

    /**
     * Constructor for objects of class OthersEvents
     */
    public OthersEvents(String answer) {
        // initialise instance variables
        Random rand = new Random();
        answer = " ";
    }

    /**
     * Method to a random death event.
     *
     * @param randomMort is a random value between 0 and 10
     * @return the state of player's death or player's live
     */
    public void eventMortAllea() {
        //initialisation du random
        Random rand = new Random();
        int randomMort = rand.nextInt(10);

        if (randomMort < 2) {
            //Death of player
            player.getALive();
            youLose();
        } else {
            // life of player
            nothing();
        }
    }

    /**
     * Method to an event in the mine of the castle
     *
     */
    public void eventMine(String answer) {
        // dialogue
        System.out.print("\nYou arrive in the mine. Despite the darkness, you can see moving shadows...");
        System.out.print("\nYou arrive to distinguish that these shadows are elves locked up !");
        System.out.print("\nAn elve : blablabla");

        System.out.print("What is your answer ?");

        //condition celon la réponse
        if (answer == "yes" || answer == "yes") {
            //result condition
            //reçoit un objet (potion/épée)

        } else if (answer == "no" || answer == "non") {
            //result condition
            System.out.print("\nAn elve : Noooo, please please pleaseeeee siiiir !!!");
            //quitte la pièce directe ?

        } else {
            //result other answer
            System.out.println();
            System.out.print("\nPLease, answer the question!");
        }
    }

    public void nothing() {
        // put your code here
        System.out.print("\nThere is nothing on the balcony");
    }

    /**
     * Method to describe that the player is death during an other event
     *
     */
    private void youLose() {
        System.out.print("\nSorry but you have death!\nThe floor was slippery, you fell and died on the spot !!!");
    }
}
