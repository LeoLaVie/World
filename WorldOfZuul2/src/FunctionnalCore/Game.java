package FunctionnalCore;

import Interface.InterfaceGame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author G10
 * @version nov 2017
 */
public class Game 
{
    // instance variables - replace the example below with your own
    protected Room currentRoom; 
    private Room outside1, houseluttin1, houseluttin2, outside2, houseluttin3, houseluttin4, outside3, houseluttin5, houseluttin6, outside4, castlePapa;
    private Room mineCastle, roofCastle, entreCastle, roomCastle1, roomCastle2, roomCastle3, roomCastle4, roomCastle5, roomCastle6, roomMama, roomCastle8, roomCastle9, roomCastle10,  roomCastle7, floor2, floor3, floor4, roomBoos;
    private Parser parser;
    private KindNPC kNPC1;
    private MeanNPC mNPC1;
    public static Scanner userInput = new Scanner(System.in);
    private InterfaceGame interfaceGame;
   

    
    /**
     * Constructor for objects of class Game
    */
    public Game()
    {
        // initialise instance variables
        createRooms();
        parser = new Parser();
       
        //creation listener
        ListenerMove ae = new ListenerMove(this);
        
       // NPC instantiation
       kNPC1 = new KindNPC("Batman", houseluttin1, "Qu'est-ce qui est jaune et qui attend ?", "Jonathan");
       mNPC1 = new MeanNPC("Joker", houseluttin2, 100, 20, true);

                
    }
    
    
    /**
     * This method create all the rooms of the town of the game.
     * Create the link between the different rooms.
     *
     */
     public void createRooms()
    {
        // CREATION OF THE DOORS (ROOMS)
        outside1 = new Room("outside1","outside the main entrance of the Santa claus village");
        houseluttin1 = new Room("houseluttin1","in a luttin's house");
        houseluttin2 = new Room("houseluttin2","in a luttin's house");
        outside2 = new Room("outside2","outside of the Santa claus village");

        // CREATION OF THE EXITS
        outside1.setExit("NORTH",null,outside2); //(direction,key,nextRoom)
        houseluttin1.setExit("SOURTH",null,null);
        houseluttin2.setExit("UP",null,null);
        outside2.setExit("DOWN",null,null);
        
        // CREATION OF KEYS
        //keyLuttin1 = new Key("Key1","Key of the first luttin house");
        //keyLuttin2 = new Key("Key2","Key of the second luttin house");
        

        // WHERE THE GAME START
        currentRoom = outside1;

        
        
    }
    
    /**
     *  Main play routine. Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }
    
    
    /**
     * Print out the opening message for the player.
     */
    protected void printWelcome()
    {       
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + currentRoom.getDescription());
        System.out.print("Exits: ");
        
       // Look for all directions
       // for (String key : currentRoom.getExit().keySet())
        // {
            // if(currentRoom.getExit().get(key) != null)
            // {
                // System.out.print(key);
            // }    
        // System.out.println();
       // }
    }
    
    /**
     * This method given a command, process (that is: execute) the command.
     * 
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = quit(command);

        return wantToQuit;
    }
    
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the Santa Claus's village.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("  go quit help");
    }
    
    //bientot à supprimer !!!!!!
    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom(Command command) 
    {
        
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        //nextRoom = currentRoom.getExit().get(direction);

       if (nextRoom == null) {
            System.out.println("There is no door!");
       }
       else {
            currentRoom = nextRoom;
            System.out.println("You are " + currentRoom.getDescription());
            System.out.print("Exits: ");
            
            // for (String key : currentRoom.getExit().keySet())
            // {
               // if (currentRoom.getExit().get(key)!=null)
                // {
                   // System.out.println(key);
                // }
            // System.out.println();
             // }
       }
     }
    
    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom2(ActionEvent ae)
    {
        Room nextRoom = null;
        //nextRoom = currentRoom.getExit().get(ae);
        if(ae.getSource() == interfaceGame.getButtonNorth()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
        else if (ae.getSource() == interfaceGame.getButtonEast()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
        else if (ae.getSource() == interfaceGame.getButtonSouth()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
        else if (ae.getSource() == interfaceGame.getButtonWest()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
        else if (ae.getSource() == interfaceGame.getButtonUp()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
        else if (ae.getSource() == interfaceGame.getButtonDown()){
            if (nextRoom == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                
            }
        }
                
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
     public static void contDialogue() {
        System.out.print("\nPress [ENTER] to continue...");
        userInput.nextLine();
    }
    
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
      /**
     * Method beginEnigma - This method allows to ask a question to the player
     * The player can answr to the question.
     *
     * @param  
     * @return    
     */
    public void beginEnigma()
    {
       // NPC instantiation
       kNPC1 = new KindNPC("Batman", houseluttin1, "Qu'est-ce qui est jaune et qui attend ?", "Jonathan");
        
        String answer1;
        
        Scanner sc = new Scanner(System.in);
        
        kNPC1.displayEnigma();
        
        System.out.println("Your answer: ");
        answer1 = sc.nextLine();
        if (answer1 == kNPC1.getAnswer()) {
            System.out.println("Good answer !");
        }
        else {System.out.println("Bad answer ! :( Try again !");
    }
    
  }
    
}
