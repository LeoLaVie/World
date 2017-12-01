/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.*;

/**
 *
 * @author leov
 */
public class ListenerItem implements ActionListener{
    private InterfaceGame2 game;
    
    public ListenerItem (InterfaceGame2 y)
    {
        game = y;
    }
    
        @Override
    public void actionPerformed(ActionEvent item)
    {
        game.moveGame(item);
    }
    
}
