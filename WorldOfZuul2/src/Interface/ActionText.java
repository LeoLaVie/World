package Interface;

import FunctionnalCore.Game;
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
        
    // String text = game.textField.getText();
        // game.textArea.append(text + game.newline);
        // game.textField.selectAll();
 
        // //Make sure the new text is visible, even if there
        // //was a selection in the text area.
        // game.textArea.setCaretPosition(game.textArea.getDocument().getLength());
        
} 

}