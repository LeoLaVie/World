/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class InterfaceGameWin extends JFrame implements ActionListener {
    private JButton buttonRestart;
    private InterfaceGame2 interfaceGame;
    
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
        
        buttonRestart = new JButton();
        buttonRestart.setPreferredSize(new Dimension(200, 60));
        buttonRestart.setIcon(new ImageIcon(getClass().getResource("/Images/boutton_game.png")));
        buttonRestart.setText("RESTART GAME");
        buttonRestart.setForeground(Color.black);
        buttonRestart.setOpaque(false);
        buttonRestart.setContentAreaFilled(false);
        buttonRestart.setBorderPainted(false);
        buttonRestart.setDisabledIcon(new ImageIcon(getClass().getResource("/Images/boutton_game.png")));
        buttonRestart.setFont(new java.awt.Font(Font.SERIF, Font.BOLD, 25));
        buttonRestart.setVerticalTextPosition(SwingConstants.CENTER);
        buttonRestart.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonRestart.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        buttonRestart.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(buttonRestart);
        
        Container c = new JLabel(makeImage());
        c.setLayout(new FlowLayout());
        c.add(panel, BorderLayout.SOUTH);
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
     * Method action performed to restart the game
     * @param e action event to send the restart game
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // exit page
        if (e.getSource() == buttonRestart) {
            //interfaceGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            new InterfaceMain();
            this.dispose();
        }

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
