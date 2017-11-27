/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Container;
    import java.awt.Dimension;
    import java.awt.FlowLayout;
    import java.awt.Font;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
    import javax.swing.Box;
    import javax.swing.BoxLayout;
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
import javax.swing.SwingConstants;
/**
 *
 * @author leov
 */
public class InterfaceGame2 extends JFrame {
    
    private JPanel myPanel;
    
    protected JButton buttonNorth;
    protected JButton buttonEast;
    protected JButton buttonSouth;
    protected JButton buttonWest;
    protected JButton button;
    protected JButton buttonUp;
    protected JButton buttonDown;
    
    private JLabel labelPv;
    
     //champ textuel
    protected JTextField textField;
    protected JTextArea textArea;
    protected final static String newline = "\n";
    protected JPanel panelText;
    private JLabel labelText;
    
     
     public InterfaceGame2(String playerName){
        

       // JLabel labelback = new JLabel();
        //labelback.setIcon(new ImageIcon(getClass().getResource("/Images/outside1.jpg")));
       // labelback.setPreferredSize(new Dimension(1000, 550)); 

        //creation of buttons and label
        buttonNorth = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheNorth.gif")));
        buttonNorth.setOpaque(false);
        buttonNorth.setContentAreaFilled(false);
        buttonNorth.setBorderPainted(true);
        buttonNorth.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
      //  buttonNorth.addActionListener(ae);
        
        buttonEast = new JButton();
        buttonEast.setIcon(new ImageIcon(getClass().getResource("/Images/flecheEast.gif")));
        buttonEast.setOpaque(false);
        buttonEast.setContentAreaFilled(false);
        buttonEast.setBorderPainted(true);
        buttonEast.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonSouth = new JButton();
        buttonSouth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheSouth.gif")));
        buttonSouth.setOpaque(false);
        buttonSouth.setContentAreaFilled(false);
        buttonSouth.setBorderPainted(true);
        buttonSouth.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonWest = new JButton();
        buttonWest.setIcon(new ImageIcon(getClass().getResource("/Images/flecheWest.gif")));
        buttonWest.setOpaque(false);
        buttonWest.setContentAreaFilled(false);
        buttonWest.setBorderPainted(true);
        buttonWest.setBorder(BorderFactory.createLineBorder(Color.WHITE));
       
        buttonUp = new JButton();
        buttonUp.setIcon(new ImageIcon(getClass().getResource("/Images/flecheUp.gif")));
        buttonUp.setOpaque(false);
        buttonUp.setContentAreaFilled(false);
        buttonUp.setBorderPainted(true);
        buttonUp.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonDown = new JButton();
        buttonDown.setIcon(new ImageIcon(getClass().getResource("/Images/flecheDown.gif")));
       // buttonDown.setPreferredSize(new Dimension(80, 30)); 
        buttonDown.setOpaque(false);
        buttonDown.setContentAreaFilled(false);
        buttonDown.setBorderPainted(true);
        buttonDown.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        
       //add to panel up/down
        JPanel panelUpDown = new JPanel();
        panelUpDown.setLayout(new GridLayout(2,1));
        panelUpDown.setBackground(Color.GRAY);
        panelUpDown.add(buttonUp);
        panelUpDown.add(buttonDown);
        
       //add to panel move        
        //Creation of a container with a horizontal gestion
        Box b1 = Box.createHorizontalBox();
        b1.add(buttonNorth);
        add(b1);
 
        //Idem
       Box b2 = Box.createHorizontalBox();
       b2.add(buttonWest);
       b2.add(buttonEast);
       add(b2);
      
        //Idem
       Box b3 = Box.createHorizontalBox();
       b3.add(buttonSouth);
       add(b3);
        
        //Creation of a container with a vertical gestion
       Box panelMove = Box.createVerticalBox();
       panelMove.add(b1);
       panelMove.add(b2);
       panelMove.add(b3);
        
        JPanel panelMoveTot = new JPanel();
        panelMoveTot.setBackground(Color.GRAY);
       // panelMoveTot.setLayout(new GridLayout(1,1));
        panelMoveTot.add(panelMove);
        panelMoveTot.add(panelUpDown);
        
        
        //label pv
        labelPv = new JLabel("100");
        labelPv.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
        labelPv.setForeground(Color.red);
        
        JLabel labelLife = new JLabel();
        labelLife.setIcon(new ImageIcon(getClass().getResource("/Images/boutton_game.png")));
        labelLife.setText("Life");
        labelLife.setForeground(Color.black);
        labelLife.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,25));
        labelLife.setVerticalTextPosition(SwingConstants.CENTER);
        labelLife.setHorizontalTextPosition(SwingConstants.CENTER);
        
        JPanel panelPv = new JPanel();
        panelPv.setLayout(new GridLayout(2,1));
        panelPv.setBackground(Color.GRAY);
        panelPv.add(labelLife, BorderLayout.CENTER);
        panelPv.add(labelPv, BorderLayout.CENTER);
        
        
         //panel interface
        JPanel panelInterface = new JPanel();
        panelInterface.setLayout(new GridLayout(1, 1, 200, 200));
        panelInterface.add(panelPv);
        panelInterface.add(buildContentPane(), BorderLayout.CENTER);
        panelInterface.add(panelMoveTot, BorderLayout.EAST);
        panelInterface.setBackground(new Color(192,192,192));
        
        
         
        JLabel labelback = new JLabel(makeImage());
        labelback.setPreferredSize(new Dimension(1000, 550));
        
        Container c = new JLabel(makeImage());
        c.setLayout(new BorderLayout());
        c.add(panelInterface,BorderLayout.SOUTH);
        c.setPreferredSize(new Dimension(1300,650));
        c.setMaximumSize(new Dimension(1300,650));
        c.setMinimumSize(new Dimension(1300,650));
        this.add(c);
        this.setTitle("World Of Zuul");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setPreferredSize(new Dimension(1000,550));
        this.setMaximumSize(new Dimension(1000,550));
        this.setMinimumSize(new Dimension(1000,550));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
     }
     
     private ImageIcon makeImage()
     {
       return new ImageIcon(getClass().getResource("/Images/Outside1.jpg"));
        
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

        JButton boutonText = new JButton(new ActionText(this, "Entrer"));
 
        Box bt1 = Box.createHorizontalBox();
        bt1.add(textArea);

        //Idem
        Box bt2 = Box.createHorizontalBox();
        bt2.add(textField);
        bt2.add(boutonText);
        
        Box panelText = Box.createVerticalBox();
        panelText.add(bt1);
        panelText.add(bt2);
        
        return panelText;
    }
    
    
    public JTextField getTextField(){
        return textField;
    }
 
    public JTextArea getTextArea(){
         return textArea;
    }
    
     

}
