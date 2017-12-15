package Interface;

import FunctionnalCore.Game;
import FunctionnalCore.Inventory;
import FunctionnalCore.KindNPC;
import FunctionnalCore.Player;
import Interface.InterfaceGame2;
import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class ActionText here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActionText extends AbstractAction { 

    
    // instance variables - replace the example below with your own
    private InterfaceGame2 interfaceGame;
    private Player aPlayer;
    private Inventory inventory;
    JOptionPane dial;
    private KindNPC npc;
    /**
     * Constructor for objects of class ActionText
     */
    public ActionText(InterfaceGame2 interfaceGame, String texte)
    {
        // initialise instance variables
        super(texte);
 
    this.interfaceGame = interfaceGame;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void actionPerformed(ActionEvent e) { 
        String texteUtilisateur = interfaceGame.getTextField().getText();
        interfaceGame.getTextArea().setText(texteUtilisateur);
        
        System.out.println(interfaceGame.getCurrentRoom().getkNPC().getAnswer());
        // answer = sc.nextLine();
        if (texteUtilisateur.equals(interfaceGame.getCurrentRoom().getkNPC().getAnswer())){
            System.out.println("THANK YOU VERY MUCH ! Good answer !");
            dial = new JOptionPane();
            dial.showMessageDialog(null, "*** THANK YOU VERY MUCH ! YOU LIBERATED ME ! *** ", null,
            JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            System.out.println("Bad answer ! :( Try again !");
            dial = new JOptionPane();
            dial.showMessageDialog(null, "*** Bad answer ! :( Try again ! *** ", null,
            JOptionPane.INFORMATION_MESSAGE);
            interfaceGame.beginEnigma(interfaceGame.getCurrentRoom().getkNPC());
        }         
} 

}