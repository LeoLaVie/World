package FunctionnalCore;

import Interface.InterfaceGame2;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * This class is the event for the fighting between the player and a npc.
 *
 * @author (Grp 10)
 * @version (23/11/2017)
 */
public class Fight extends Events
{
    // instance variables - replace the example below with your own
    private boolean isWin;
    private int health;
    private MeanNPC meanNPC;
    private Player myPlayer;
    private boolean fighting = true;
    JOptionPane jop1, dial;
    private InterfaceGame2 interfaceGame;
    /**
     * Constructor for objects of class Fight
     */
    public Fight(Player player, MeanNPC myNPC)
    {
        // initialise instance variables
        myPlayer = player;
        meanNPC = myNPC;
    }
    
    /**
     * Method to run the step of turn by turn
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
//    public void runFight(ActionEvent fight)
//    {
//       //appelle du joueur, vie, etat...
//       //appelle de l'ennemie, vie, etat..
//       
//       System.out.print("\nChose your action with buttons !");
//       jop1 = new JOptionPane();
//       jop1.showMessageDialog(null, "\nChose your action with buttons !", "Warning",
//               JOptionPane.INFORMATION_MESSAGE);
//       
//       InterfaceGame2.getButtonAttack().setEnabled(true);
//       
//       //fight system
//        while(fighting) {
//            if (player.getHealth() <= 0 || meanNpc.getHealth() <= 0){
//                fighting = false;
//                break;
//            }
//            else if (fight.getSource() == InterfaceGame2.getButtonAttack()) {
//                //start the fight
//                fight1();
//            }
//            else if (fight.getSource() == InterfaceGame2.getButtonLife()){
//                //take a potion
//                takePotion();
//            }
//            else{
//                enemyAttack();
//                statusUpdate();
//            }
//        }
//      if (!fighting){
//        if (player.getHealth() <= 0){
//            youLose();
//        }
//        else if (meanNpc.getHealth() <= 0){
//            youWin();
//        }
//       }
//    }   
    
    /**
     * Method to run the round of fight
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fight1()
    {
       // Player myPlayer = new Player(interfaceGame.getaPlayer().getName());
        //MeanNPC meanNPC = new MeanNPC(interfaceGame.getCurrentRoom().getmNPC().getNameMNPC(), interfaceGame.getCurrentRoom().getmNPC().getHealth(), interfaceGame.getCurrentRoom().getmNPC().getAttack(), interfaceGame.getCurrentRoom().getmNPC().getAlive());
        System.out.print("\nYour attack does " + myPlayer.getAttPower() + " damage to the enemy!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\n*** Your attack does " + myPlayer.getAttPower() + " damage to the enemy!*** ", null,
        JOptionPane.INFORMATION_MESSAGE);
        
        meanNPC.setHealth(meanNPC.getHealth(), myPlayer.getAttPower());
        

        
        enemyAttack();
        statusUpdate();
    }
    
    /**
     * method to take a potion during a fighting
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void takePotion()
    {
        // put your code here
       // Player myPlayer = new Player(Player.getName());
        System.out.print("\nYou have decide to take a potion.");
        System.out.print("\nYou have regained" + myPlayer.calculSoin());
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nYou have decide to take a potion.\n You have regained" + myPlayer.calculSoin(), null,
        JOptionPane.INFORMATION_MESSAGE);
        myPlayer.addHealth();
        enemyAttack();
        statusUpdate();
    }
    
    /**
     * method when the enemy attack
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enemyAttack()
    {
       // Player myPlayer = new Player(Player.getName());
        //MeanNPC meanNPC = new MeanNPC(interfaceGame.getCurrentRoom().getmNPC().getNameMNPC(), interfaceGame.getCurrentRoom().getmNPC().getHealth(), interfaceGame.getCurrentRoom().getmNPC().getAttack(), interfaceGame.getCurrentRoom().getmNPC().getAlive());
        System.out.print("\nThe enemy's attack does" + meanNPC.getAttack() + "damage to you!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nThe enemy's attack does" + meanNPC.getAttack() + "damage to you!", null,
        JOptionPane.INFORMATION_MESSAGE);
        myPlayer.setHealth(myPlayer.getHealth(), meanNPC.getAttack());
    }
    
    /**
     * methode to update the statut of player and enemy
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void statusUpdate() {
       // Player myPlayer = new Player(Player.getName());
        //MeanNPC meanNPC = new MeanNPC(interfaceGame.getCurrentRoom().getmNPC().getNameMNPC(), interfaceGame.getCurrentRoom().getmNPC().getHealth(), interfaceGame.getCurrentRoom().getmNPC().getAttack(), interfaceGame.getCurrentRoom().getmNPC().getAlive());
        System.out.print("\n------------------------------------------");
        System.out.print("\n(HP = " + myPlayer.getHealth() + "|| (ENEMY HP = " + meanNPC.getHealth() + ")");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\n(HP = " + myPlayer.getHealth() + "|| (ENEMY HP = " + meanNPC.getHealth() + ")", null,
        JOptionPane.INFORMATION_MESSAGE);
        
    }

    /**
     * Method to get the win when the player has win
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean getWin()
    {
        return isWin;
    }
    
    /**
     * Method to describe that the player has win
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void youWin()
    {
        // put your code here
        System.out.print("\nCongratulations!\nYou have defeated the enemy!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nCongratulations!\nYou have defeated the enemy!", null,
        JOptionPane.INFORMATION_MESSAGE);
        //Game.contDialogue();
       // Game.userInput.nextLine();

    }
    
    /**
     * Method to describe that the player is death
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void youLose() {
        System.out.print("\nSorry but you have lose!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nSorry but you have lose!", null,
        JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean isIsWin() {
        return isWin;
    }

    public void setIsWin(boolean isWin) {
        this.isWin = isWin;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    
}
