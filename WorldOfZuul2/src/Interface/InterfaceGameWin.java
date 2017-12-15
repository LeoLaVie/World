/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author leov
 */
public class InterfaceGameWin extends JFrame {
    
    public InterfaceGameWin(){
         
        URL url = InterfaceGameWin.class.getResource("/Sound/gamewin.wav");
        final AudioClip clip = Applet.newAudioClip(url);
 
 
	// pour l'exécuter au moment ou la fenêtre s'ouvre
	this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowOpened(WindowEvent e) {
	            clip.play();
		}
	});
        
        Container c = new JLabel(makeImage());
        c.setLayout(new FlowLayout());
      // c.add();
        c.setPreferredSize(new Dimension(920,650));
        c.setMaximumSize(new Dimension(920,650));
        c.setMinimumSize(new Dimension(920,650)); 
       this.add(c);
       this.setTitle("World Of Zuul");// Titre
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.setPreferredSize(new Dimension(920,700));
       this.setMaximumSize(new Dimension(920,700));
       this.setMinimumSize(new Dimension(920,700));
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }
    
    /**
     * method to add the picture of game win
     * @return Image icon of game win
     */
     private ImageIcon makeImage()
     {
       return new ImageIcon(getClass().getResource("/Images/gamewin.gif"));
        
     }
}
