package FunctionnalCore;

import Interface.InterfaceGame;
import Interface.InterfaceGame2;
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
  //  protected static Room currentRoom; 
  //  private static Room outside1, houseluttin1, houseluttin2, outside2, houseluttin3, houseluttin4, outside3, houseluttin5, houseluttin6, outside4, castlePapa;
  //  private static Room mineCastle, roofCastle, entreCastle, roomCastle1, roomCastle2, roomCastle3, roomCastle4, roomCastle5, roomCastle6, roomMama, roomCastle8, roomCastle9, roomCastle10,  roomCastle7, floor2, floor3, floor4, roomBoos;
    private Parser parser;
    private KindNPC kNPC1;
    private MeanNPC mNPC1;
    //private Inventory inventory;
    //private Items items;
    //private Player player;
    public static Scanner userInput = new Scanner(System.in);
    private InterfaceGame interfaceGame;
    //private Weapon w1;

   
    
    private Door exit;
   //private JButton direction;
    
    
    /**
     * Constructor for objects of class Game
    */
    public Game()
    {
        // initialise instance variables
       // createRooms();
        parser = new Parser();
        
       // NPC instantiation
      // kNPC1 = new KindNPC("Batman", "Qu'est-ce qui est jaune et qui attend ?", "Jonathan", true);
       //mNPC1 = new MeanNPC("Joker", 100, 20, true);
       
       
               
    }
    
    
//    /**
//     * This method creates all the rooms of the town of the game.
//     * Create the link between the different rooms.
//     *
//     */
//     public static void createRooms()
//    {
//        // CREATION OF THE DOORS (ROOMS)
//        outside1 = new Room("outside1","outside the main entrance of the Santa claus village");
//        houseluttin1 = new Room("houseluttin1","in a luttin's house");
//        houseluttin2 = new Room("houseluttin2","in a luttin's house");
//        outside2 = new Room("outside2","outside of the Santa claus village");
//
//        // CREATION OF THE EXITS
//        outside1.setExit(InterfaceGame2.getButtonNorth(),null,outside2); //(direction,key,nextRoom)
//        houseluttin1.setExit(InterfaceGame2.getButtonWest(),null,null);
//        houseluttin2.setExit(InterfaceGame2.getButtonEast(),null,null);
//        outside2.setExit(InterfaceGame2.getButtonNorth(),null,null);
//        
//        // CREATION OF KEYS
//        //keyLuttin1 = new Key("Key1","Key of the first luttin house");
//        //keyLuttin2 = new Key("Key2","Key of the second luttin house");
//        
//        //CREATION OF CHEST
//        
//        
//        //CREATION OF POTION
//        
//        
//        //CREATION OF WEAPON
//        
//
//        // Exits 
//        outside1.setExit(InterfaceGame2.getButtonNorth(),null,houseluttin1);
//        houseluttin1.setExit(InterfaceGame2.getButtonNorth(),null,houseluttin2);
//        houseluttin1.setExit(InterfaceGame2.getButtonEast(),null,outside2);
//        houseluttin2.setExit(InterfaceGame2.getButtonSouth(),null,houseluttin1);
//        
//        // WHERE THE GAME START
//        currentRoom = outside1;
//
//        
//        
//    }
    
//    /**
//     *  Main play routine. Loops until end of play.
//     */
//    public void play() 
//    {            
//        printWelcome();
//        // Enter the main command loop.  Here we repeatedly read commands and
//        // execute them until the game is over.                
//        boolean finished = false;
//        while (! finished) {
//            Command command = parser.getCommand();
//            finished = processCommand(command);
//        }
//        System.out.println("Thank you for playing.  Good bye.");
//    }
//    
    
//    /**
//     * Print out the opening message for the player.
//     */
//    protected void printWelcome()
//    {       
//        System.out.println();
//        System.out.println("Welcome to the World of Zuul!");
//        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
//        System.out.println("Type 'help' if you need help.");
//        System.out.println();
//        System.out.println("You are " + currentRoom.getDescription());
//        System.out.print("Exits: ");
//        
//       // Look for all directions
//        for (JButton key : currentRoom.getExit().keySet())
//         {
//            if(currentRoom.getExit().get(key) != null)
//             {
//                System.out.print(key);
//            }    
//         System.out.println();
//        }
//    }
    
//    /**
//     * This method given a command, process (that is: execute) the command.
//     * 
//     * @param command The command to be processed.
//     * @return true If the command ends the game, false otherwise.
//     */
//    private boolean processCommand(Command command) 
//    {
//        boolean wantToQuit = false;
//
//        if(command.isUnknown()) {
//            System.out.println("I don't know what you mean...");
//            return false;
//        }
//
//        String commandWord = command.getCommandWord();
//        if (commandWord.equals("help"))
//            printHelp();
//        else if (commandWord.equals("go"))
//            goRoom2(command);
//        else if (commandWord.equals("quit"))
//            wantToQuit = quit(command);
//
//        return wantToQuit;
  //  }
    
//    /**
//     * Print out some help information.
//     * Here we print some stupid, cryptic message and a list of the command words.
//     */
//    private void printHelp() 
//    {
//        System.out.println("You are lost. You are alone. You wander");
//        System.out.println("around at the Santa Claus's village.");
//        System.out.println();
//        System.out.println("Your command words are:");
//        System.out.println("  go quit help");
//    }
    
    //bientot à supprimer !!!!!!
    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
//     */
//    public void goRoom2(Command command) 
//    {
//        
//        if(!command.hasSecondWord()) {
//            // if there is no second word, we don't know where to go...
//            System.out.println("Go where?");
//            return;
//        }
//
//        String direction = command.getSecondWord();
//
//        // Try to leave current room.
//        Room nextRoom = null;
//        nextRoom = currentRoom.getExit().get(direction).getNextRoom();
//
//       if (nextRoom == null) {
//            System.out.println("There is no door!");
//       }
//       else {
//            currentRoom = nextRoom;
//            System.out.println("You are " + currentRoom.getDescription());
//            System.out.print("Exits: ");
//            
           // for (String key : currentRoom.getExit().keySet())
//            {
//                if (currentRoom.getExit().get(key)!=null)
//                {
//                    System.out.println(key);
//                }
//                System.out.println();
//            }
//       }
//     }
//    
//    /** 
//     * Try to go to one direction. If there is an exit, enter
//     * the new room, otherwise print an error message.
//     */
//    public void goRoom(ActionEvent move)
//    {
//        direction = (JButton)move.getSource();
//        Room nextRoom = null;
//        nextRoom = currentRoom.getExit().get(direction).getNextRoom();
//        if(move.getSource() == interfaceGame.getButtonNorth()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!"); 
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        else if (move.getSource() == interfaceGame.getButtonEast()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!");
//                
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                 System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//            
//        else if (move.getSource() == interfaceGame.getButtonSouth()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!");
//                
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                 System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        else if (move.getSource() == interfaceGame.getButtonWest()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!");
//                
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                 System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        else if (move.getSource() == interfaceGame.getButtonUp()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!");
//                
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                 System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        else if (move.getSource() == interfaceGame.getButtonDown()){
//            if (nextRoom == null) {
//                System.out.println("There is no door!");
//                
//            }
//            else{
//                currentRoom = nextRoom;
//                //Display the new room
//                 System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
//            
//                for (JButton key : currentRoom.getExit().keySet())
//                {
//                    if (currentRoom.getExit().get(key)!=null)
//                    {
//                        System.out.println(key);
//                    }
//                    System.out.println();
//                }
//            }
//        }            
//    }
    
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
//    private boolean quit(Command command) 
//    {
//        if(command.hasSecondWord()) {
//            System.out.println("Quit what?");
//            return false;
//        }
//        else {
//            return true;  // signal that we want to quit
//        }
//    }
    
    /**
     * Method beginEnigma - This method allows to ask a question to the player.
     * The player can answer to the question.
     *
     * @param  
     * @return    
     */
//    public void beginEnigma(KindNPC kNPC1)
//    {
//       // NPC instantiation
//       //kNPC1 = new KindNPC("Batman", "Qu'est-ce qui est jaune et qui attend ?", "Jonathan", true);
//        
//        String answer1;
//        
//        Scanner sc = new Scanner(System.in);
//        
//        kNPC1.displayEnigma();
//        
//        //System.out.println(kNPC1.getAnswer());
//        answer1 = sc.nextLine();
//        if (answer1.equals(kNPC1.getAnswer())) {
//            System.out.println("Good answer !");
//            kNPC1.getAvailability();
//        }
//        else {System.out.println("Bad answer ! :( Try again !");
//        beginEnigma(kNPC1);
//    }
//    
  }
    
        /**
     * Method beginEnigmaMX - Mother Xmas's enigma
     * The player can answer to the question.
     *
     * @param  
     * @return    
     */
//    public void beginEnigmaMX()
//    {
//       // NPC instantiation
//       kNPC1 = new KindNPC("Batman", "Qu'est-ce qui est jaune et qui attend ?", "Jonathan", true);
//        
//        String answer1;
//        
//        Scanner sc = new Scanner(System.in);
//        
//        kNPC1.displayMotherXmas();
//        
//        System.out.println(kNPC1.getAnswer());
//        answer1 = sc.nextLine();
//        if (answer1.equals("Jonathan")) {
//            System.out.println("THANK YOU VERY MUCH ! YOU LIBERATED ME !");
//            kNPC1.getAvailability();
//        }
//        else {System.out.println("Bad answer ! :( Try again !");
//        beginEnigmaMX();
//    }
    
 // }
    
//}

