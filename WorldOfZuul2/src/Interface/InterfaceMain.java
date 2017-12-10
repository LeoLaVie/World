/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

    import FunctionnalCore.Door;
    import FunctionnalCore.Game;
    import FunctionnalCore.Inventory;
    import FunctionnalCore.Items;
    import FunctionnalCore.Player;
    import FunctionnalCore.Game;
    import FunctionnalCore.Inventory;
    import FunctionnalCore.Player;
    import Interface.InterfaceInventory;
    import java.applet.Applet;
    import java.applet.AudioClip;
    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;
    import java.util.Scanner;
    import java.awt.*;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.net.URL;
    import javax.swing.*;
    
/**
 *
 * @author leov 
 */
public class InterfaceMain extends JFrame implements ActionListener
{
    private Inventory anInventory;
    private Player aPlayer;
    private Game aGame; 
    private final JButton butStart;
    
    ///////////////////////////////////
    private final JPanel panelBottom = new JPanel();
    private final JPanel myMainPanel = new JPanel();
    private final JPanel panelStart = new JPanel();
   
    ////////////////////////////
    private JLabel label;
    private JLabel labelback;
    ////////////////////////////
    private final JLabel labTitle;
    
    ////////////////////////////
    private JTextField fieldName;
    
     /////////////////////////
    private String playerName;
    
     /*
   The constructor of the class game is composed of button, panel for each herol and label.
   
   */
    
    public InterfaceMain ()
    {
        URL url = InterfaceGameOver.class.getResource("/Sound/wind.wav");
        final AudioClip clip = Applet.newAudioClip(url);
 
 
	// pour l'exécuter au moment ou la fenêtre s'ouvre
	this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowOpened(WindowEvent e) {
	            clip.play();
		}
	});
        
       
       this.setTitle("World Of Zuul");// Titre
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //-----------------------------------------------------------------------
        labTitle = new JLabel("Horror in Laponia",JLabel.CENTER);
        labTitle.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,45));
        labTitle.setForeground(Color.red);
       
        
         //-----------------------------------------------------------------------
       
       //1er label de la frame 
       label = new JLabel ("Choose your name and click on start to begin your game!",JLabel.CENTER);
       label.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,25));
       label.setForeground(Color.white);
       JLabel label2 = new JLabel(" ");
       label2.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,25));
       
       JPanel panLabel = new JPanel(new BorderLayout());
       panLabel.add(labTitle,BorderLayout.NORTH);
       panLabel.add(label,BorderLayout.CENTER);
       panLabel.add(label2,BorderLayout.SOUTH);
       panLabel.setOpaque(false);
       
       ///////////////////
       
       JLabel labelName = new JLabel("Enter your name :  ");
       labelName.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
       labelName.setForeground(Color.white);
       fieldName = new JTextField(15);
       JPanel panelName = new JPanel();
       panelName.add(labelName);
       panelName.add(fieldName);
       panelName.setOpaque(false);
       
       /// BOTTOM : Boutons start
        butStart = new JButton();
        butStart.setPreferredSize(new Dimension(200,60));
        butStart.setIcon(new ImageIcon(getClass().getResource("/Images/boutton.jpg")));
        butStart.setText("Start Game");
        butStart.setForeground(Color.black);
        butStart.setOpaque(false);
        butStart.setContentAreaFilled(false);
        butStart.setBorderPainted(true);
        butStart.setDisabledIcon(new ImageIcon(getClass().getResource("/Images/boutton.jpg")));
        butStart.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,25));
        butStart.setVerticalTextPosition(SwingConstants.CENTER);
        butStart.setHorizontalTextPosition(SwingConstants.CENTER);
        butStart.setBorder(BorderFactory.createLineBorder(Color.BLACK));
               
        
        panelStart.add(butStart);
        panelStart.setOpaque(false);
        
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BorderLayout());
        panelCenter.add(panelName,BorderLayout.SOUTH);
        panelCenter.setOpaque(false);
       
        labelback = new JLabel(makeImage());
        labelback.setPreferredSize(new Dimension(1600, 800));
        
        myMainPanel.setLayout(new BorderLayout());
        myMainPanel.add(panLabel,BorderLayout.NORTH);
        myMainPanel.add(panelCenter,BorderLayout.CENTER);
        myMainPanel.add(panelStart,BorderLayout.SOUTH);
        myMainPanel.setOpaque(false);
        
        butStart.addActionListener(this); 
       // butStart.setEnabled(false);
        
       Container c = new JLabel(makeImage());
       c.setLayout(new FlowLayout());
       c.add(myMainPanel);
       c.setPreferredSize(new Dimension(1600,1000));
       c.setMaximumSize(new Dimension(1600,1000));
       c.setMinimumSize(new Dimension(1600,1000));
       this.add(c);
       this.setResizable(false);
       this.setPreferredSize(new Dimension(1300,650));
       this.setMaximumSize(new Dimension(1300,650));
       this.setMinimumSize(new Dimension(1300,650));
       this.setLocationRelativeTo(null);
       this.setVisible(true);        
        
    }
    
     private ImageIcon makeImage()
     {
       return new ImageIcon(getClass().getResource("/Images/fond2.gif"));
        
     }

      /*
   The method actionPerformed allows to make action in fonction of the button 
   clicked by the player.
   */
   
   @Override
   public void actionPerformed(ActionEvent e)
    {
      // When the user click on Marion's picture, the button Start and Change 
      //become accessible but all the other hero button become unaccessible 
      
      if (e.getSource() == butStart)
      {
         playerName = fieldName.getText();
         //new InterfaceInventory(anInventory, aPlayer, aGame);
         new InterfaceGame2(playerName);
        // new InterfaceGameOver();
         //new InterfaceGameWin();
         this.dispose();
      }
      
    }
    
 }
