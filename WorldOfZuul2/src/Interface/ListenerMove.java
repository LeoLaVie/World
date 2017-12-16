/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

//import FunctionnalCore.Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leov
 */
public class ListenerMove implements ActionListener {
    private InterfaceGame2 room;
    
    /**
    * Constructor of the listener move
    * @param x it is the InterfaceGame2 class
    */   
    public ListenerMove (InterfaceGame2 x)
    {
        room = x;
    }
    
    
    /**
     * 
     * @param move action event for the move
     */
    @Override
    public void actionPerformed(ActionEvent move)
    {
        room.goRoom(move);
    }
}