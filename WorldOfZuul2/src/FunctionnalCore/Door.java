package FunctionnalCore;

import Interface.InterfaceGame2;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * This Door class stands for a door that a player can use to navigate between
 * two different rooms.
 *
 *
 * @author (Group 10)
 * @version (23 novembre 2017)
 */
public class Door {

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
    public Door(Room nextRoom, Room previousRoom) {
        if (nextRoom == null) {
            this.nextRoom = previousRoom;
        } else {
            this.nextRoom = nextRoom;
        }
        if (previousRoom == null) {
            System.out.println("Error, No Room");
        } else {
            this.previousRoom = previousRoom;
        }

    }

    public Door() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isLocked() {
        return false;

    }

    /**
     * Pour que le test marche --> proposition de NetBeans
     *
     * @param room
     */
//    Door(Room room) {
    //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
    
    /**
     * Function to know the next room of the player.
     *
     * @return The next room of the player.
     */
    public Room getNextRoom() {
        return this.nextRoom;

    }

    /**
     * Function to know the previous room of the player.
     *
     * @return The previous room of the player. coucoucoucou
     */
    public Room getPreviousRoom() {
        return this.previousRoom;
    }

    /**
     * Function allowing the player to go in another room.
     *
     * @return The next room the player is going to enter.
     */
    public Room goNextRoom() {
        return this.getNextRoom();
    }
}
