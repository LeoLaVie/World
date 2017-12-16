/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import FunctionnalCore.Game;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author leov
 */
public class InterfaceGame extends JFrame  {
     
    private Game game;
    
    /**
     * Attributes menubar
     * menuBar is the JMenuBar for the menu
     * quit is the JMenuItem to quit the game
     * help is the JMenuItem to have a help
    */
    private JMenuBar menuBar;
    private final JMenuItem quit = new JMenuItem("Quit");
    private final JMenuItem help = new JMenuItem("Help");
    
    /**
     * Attributes panel
     * myPanel is the JPanel for creat different panel.
    */
    private JPanel myPanel;
    
    /**
     * Attributes button
     * buttonNorth
     * buttonEast
     * buttonSouth
     * buttonWest
     * buttonUp
     * buttonDown
    */
    protected JButton buttonNorth;
    protected JButton buttonEast;
    protected JButton buttonSouth;
    protected JButton buttonWest;
    protected JButton button;
    protected JButton buttonUp;
    protected JButton buttonDown;
    
    /**
     * Attributes label
     * labelPv
     * labelVide
     * labelVide2
     * labelVide3
     * labelVide4
     * labelVide5
     * labelback
    */
     private JLabel labelPv;
     private JLabel labelVide;
     private JLabel labelVide2;
     private JLabel labelVide3;
     private JLabel labelVide4;
     private JLabel labelVide5;
     private JLabel labelback;
     
    //champ textuel
    protected JTextField textField;
    protected JTextArea textArea;
    protected final static String newline = "\n";
    protected JPanel panelText;
    private JLabel labelText;
    
    //other attribut
    
    
     public InterfaceGame(String playerName)
    {
    //creation of menu bar
        menuBar = new JMenuBar();
        menuBar.add(help);
        menuBar.add(quit);
                
        

         
                
        Icon background = new ImageIcon("/Images/rugby.jpg");
        labelback = new JLabel(background);
        labelback.setPreferredSize(new Dimension(1000, 550));
        //Icon iconNorth = new ImageIcon("/Images/flecheNorth.gif");
       // Icon iconEast = new ImageIcon("/Images/flecheEast.gif");
       //Icon iconSouth = new ImageIcon("/Images/flecheSouth.gif");
      //  Icon iconWest = new ImageIcon("/Images/flecheWest.gif");
      //  Icon iconUp = new ImageIcon("/Images/flecheUp.gif");
       // Icon iconDown = new ImageIcon("/Images/flecheDown.gif");
        
        //creation of buttons and label
        buttonNorth = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheNorth.gif")));
        buttonNorth.setOpaque(false);
        buttonNorth.setContentAreaFilled(false);
        buttonNorth.setBorderPainted(false);
        
        //buttonNorth.addActionListener(ae);
        
        buttonEast = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheEast.gif")));
        buttonEast.setOpaque(false);
        buttonEast.setContentAreaFilled(false);
        buttonEast.setBorderPainted(false);
        
        buttonSouth = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheSouth.gif")));
        buttonSouth.setOpaque(false);
        buttonSouth.setContentAreaFilled(false);
        buttonSouth.setBorderPainted(false);
        
        buttonWest = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheWest.gif")));
        buttonWest.setOpaque(false);
        buttonWest.setContentAreaFilled(false);
        buttonWest.setBorderPainted(false);
       
        buttonUp = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheUp.gif")));
        buttonUp.setOpaque(false);
        buttonUp.setContentAreaFilled(false);
        buttonUp.setBorderPainted(false);
        
        buttonDown = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheDown.gif")));
       // buttonDown.setPreferredSize(new Dimension(80, 30)); 
        buttonDown.setOpaque(false);
        buttonDown.setContentAreaFilled(false);
        buttonDown.setBorderPainted(false);

        //label pv
        labelPv = new JLabel("PV : " + "0");
        labelVide = new JLabel("");
        labelVide2 = new JLabel("");
        labelVide3 = new JLabel("");
        labelVide4 = new JLabel("");
        labelVide5 = new JLabel("");
        
       //add to panel up/down
        JPanel panelUpDown = new JPanel();
        panelUpDown.setLayout(new GridLayout(2,1));
        panelUpDown.add(buttonUp);
        panelUpDown.add(buttonDown);
        
       //add to panel move        
        //Creation of a container with a horizontal gestion
        Box b1 = Box.createHorizontalBox();
        b1.add(buttonNorth);

        //Idem
        Box b2 = Box.createHorizontalBox();
        b2.add(buttonWest);
        b2.add(buttonEast);
        
        //Idem
        Box b3 = Box.createHorizontalBox();
        b3.add(buttonSouth);
        
        //Creation of a container with a vertical gestion
        Box panelMove = Box.createVerticalBox();
        panelMove.add(b1);
        panelMove.add(b2);
        panelMove.add(b3);
       
        JPanel panelMoveTot = new JPanel();
        panelMoveTot.add(panelMove);
        panelMoveTot.add(panelUpDown);
        
        //panel interface
        JPanel panelInterface = new JPanel();
        panelInterface.setLayout(new GridLayout(1,1,200,200));
        panelInterface.add(labelPv, BorderLayout.WEST);
        panelInterface.add(buildContentPane(), BorderLayout.CENTER);
        panelInterface.add(panelMoveTot, BorderLayout.EAST);

        //panel total
        //receive background
        //receive panel interface;
        JPanel panelTot = new JPanel();
        panelTot.add(labelback);
        panelTot.add(panelInterface);
        
        // help 
       help.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent e)
        {
          // help page
          System.out.println("You are lost. You are alone. You wander");
          System.out.println("around at the Santa Claus's village.");
          System.out.println();
          System.out.println("Your command words are:");
          System.out.println("   go quit help");
        }     
       });
    
       // quit the game
       quit.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent e)
        {
          // exit page
          System.exit(0);
        }       
       });
        
        //this.setSize(800, 800);
        this.setTitle("World Of Zuul");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setJMenuBar(menuBar);
        this.add(panelTot);
        this.pack();
        
        
       this.setResizable(false);
       this.setPreferredSize(new Dimension(1000,550));
       this.setMaximumSize(new Dimension(1000,550));
       this.setMinimumSize(new Dimension(1000,550));
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }


    private Box buildContentPane(){
        textArea = new JTextArea(6, 25);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        //textArea.setText(String.ValueOf(this.play()));
        
        // GridBagConstraints c = new GridBagConstraints();
        // c.gridwidth = GridBagConstraints.REMAINDER;
        // c.fill = GridBagConstraints.BOTH;
        // c.weightx = 1.0;
        // c.weighty = 1.0;
        // add(scrollPane, c);
        // c.fill = GridBagConstraints.HORIZONTAL;
        // add(textField, c);
        
        textField = new JTextField(5);

       // JButton boutonText = new JButton(new ActionText(this, "Entrer"));
 
        Box bt1 = Box.createHorizontalBox();
        bt1.add(textArea);

        //Idem
        Box bt2 = Box.createHorizontalBox();
        bt2.add(textField);
        //bt2.add(boutonText);
        
        Box panelText = Box.createVerticalBox();
        panelText.add(bt1);
        panelText.add(bt2);
        
        return panelText;
    }
    
    /**
    * Method to return a text field
    * @return textField
    */   
    public JTextField getTextField(){
        return textField;
    }
 
    /**
    * Method to return a text area
    * @return textArea
    */   
    public JTextArea getTextArea(){
         return textArea;
    }

    /**
    * Method to return a buttonNorth
    * @return buttonNorth
    */   
    public JButton getButtonNorth() {
        return buttonNorth;
    }
    
    /**
    * Method to return a button east
    * @return buttonEast
    */   
    public JButton getButtonEast() {
        return buttonEast;
    }

    public JButton getButtonSouth() {
        return buttonSouth;
    }

    public JButton getButtonWest() {
        return buttonWest;
    }

    public JButton getButtonUp() {
        return buttonUp;
    }

    public JButton getButtonDown() {
        return buttonDown;
    }
    
    
}