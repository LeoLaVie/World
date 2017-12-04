/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import FunctionnalCore.Fight;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leov
 */
public class ListenerFight implements ActionListener{
    private Fight game;
    
    public ListenerFight (Fight a)
    {
        game = a;
    }
    
        @Override
    public void actionPerformed(ActionEvent fight)
    {
        game.runFight(fight);
    }
    
}
