/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author leov
 */
public class ListenerMouse extends MouseAdapter
{
    private InterfaceGame2 mouse;
    
    /**
     * Constructor for the listener mouse
     * @param m it is the interfaceGame2 class
     */
    public ListenerMouse (InterfaceGame2 m)
    {
        mouse = m;
    }
    
    /**
     * 
     * @param evt mouse event
     */
    @Override
    public void mouseEntered(MouseEvent evt)
    {
        mouse.compteurMouse(evt);
    }
    
    
}
