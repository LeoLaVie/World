package FunctionnalCore;

import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;
/**
 * ListenerTeam2 is a listener for to use different action with button of team 2.
 *
 * @author (Léo Vivant)
 * @version (20/10/2017)
 */
public class ListenerMove implements ActionListener
{
    // Attribute counter for add value at i
    private Game move; 

        // The counter
   public ListenerMove (Game  e){ 
        move = e; 
    } 
       
   public void actionPerformed(ActionEvent ae){ 
        move.goRoom2(ae); 
   } 
   
   
}