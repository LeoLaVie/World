/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

//import FunctionnalCore.Fight;
import FunctionnalCore.Fight;
import FunctionnalCore.MeanNPC;
import Interface.InterfaceGame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * 
 * @author leov
 */
public class ListenerFight implements ActionListener{
    private InterfaceGame2 game;
    JOptionPane jop1;
    private boolean fighting = true;
    private static Fight fight;
    private MeanNPC meanNpc;
    
    /**
     * Constructor of the listener fight class
     * @param a interfaceGame2 class
     */
    public ListenerFight (InterfaceGame2 a)
    {
        game = a;
    }
    
    /**
     * 
     * @param fightRun action event for the fight in the runfight method
     */
        @Override
    public void actionPerformed(ActionEvent fightRun)
    {
        game.runFight(fightRun);
    }
    
}
