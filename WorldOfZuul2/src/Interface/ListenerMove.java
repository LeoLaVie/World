/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leov
 */
public class ListenerMove implements ActionListener {
    private InterfaceGame2 game;
    
    public ListenerMove (InterfaceGame2 x)
    {
        game = x;
    }
    
    @Override
    public void actionPerformed(ActionEvent move)
    {
        game.moveGame(move);
    }
}