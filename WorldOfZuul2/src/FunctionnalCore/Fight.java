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
    private boolean fighting = true;
    JOptionPane jop1;
    /**
     * Constructor for objects of class Fight
     */
    public Fight()
    {
        // initialise instance variables
        
    }
    
    /**
     * Method to run the step of turn by turn
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void runFight(ActionEvent fight)
    {
       //appelle du joueur, vie, etat...
       //appelle de l'ennemie, vie, etat..
       
       System.out.print("\nChose your action with buttons !");
       jop1 = new JOptionPane();
       jop1.showMessageDialog(null, "\nChose your action with buttons !", "Warning",
               JOptionPane.INFORMATION_MESSAGE);
       
       InterfaceGame2.getButtonAttack().setEnabled(true);
       
       //fight system
        while(fighting) {
            if (player.getHealth() <= 0 || meanNpc.getHealth() <= 0){
                fighting = false;
                break;
            }
            else if (fight.getSource() == InterfaceGame2.getButtonAttack()) {
                //start the fight
                fight1();
            }
            else if (fight.getSource() == InterfaceGame2.getButtonLife()){
                //take a potion
                takePotion();
            }
            else{
                enemyAttack();
                statusUpdate();
            }
        }
      if (!fighting){
        if (player.getHealth() <= 0){
            youLose();
        }
        else if (meanNpc.getHealth() <= 0){
            youWin();
        }
       }
    }   
    
    /**
     * Method to run the round of fight
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fight1()
    {
        System.out.print("\nYour attack does " + player.getAttPower() + " damage to the enemy!");
        meanNpc.setHealth(meanNpc.getHealth(), player.getAttPower());
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
        System.out.print("\nYou have decide to take a potion.");
        System.out.print("\nYou have regained" + player.calculSoin());
        player.addHealth();
    }
    
    /**
     * method when the enemy attack
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void enemyAttack()
    {
        System.out.print("\nThe enemy's attack does" + meanNpc.getAttack() + "damage to you!");
        player.setHealth(player.getHealth(), meanNpc.getAttack());
    }
    
    /**
     * methode to update the statut of player and enemy
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void statusUpdate() {
        System.out.print("\n------------------------------------------");
        System.out.print("\n(HP = " + player.getHealth() + "|| (ENEMY HP = " + meanNpc.getHealth() + ")");
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
        Game.contDialogue();
        Game.userInput.nextLine();
    }
    
    /**
     * Method to describe that the player is death
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void youLose() {
        System.out.print("\nSorry but you have lose!");
    }
}
