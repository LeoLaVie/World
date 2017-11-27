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
        

        JLabel labelback = new JLabel();
        labelback.setIcon(new ImageIcon(getClass().getResource("/Images/outside1.jpg")));
        labelback.setPreferredSize(new Dimension(1000, 550)); 

         
        //creation of buttons and label
        buttonNorth = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheNorth.gif")));
        buttonNorth.setOpaque(false);
        buttonNorth.setContentAreaFilled(false);
        buttonNorth.setBorderPainted(false);
        
      //  buttonNorth.addActionListener(ae);
        
        buttonEast = new JButton();
        buttonEast.setIcon(new ImageIcon(getClass().getResource("/Images/flecheEast.gif")));
        buttonEast.setOpaque(false);
        buttonEast.setContentAreaFilled(false);
        buttonEast.setBorderPainted(false);
        
        buttonSouth = new JButton();
        buttonSouth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheSouth.gif")));
        buttonSouth.setOpaque(false);
        buttonSouth.setContentAreaFilled(false);
        buttonSouth.setBorderPainted(false);
        
        buttonWest = new JButton();
        buttonWest.setIcon(new ImageIcon(getClass().getResource("/Images/flecheWest.gif")));
        buttonWest.setOpaque(false);
        buttonWest.setContentAreaFilled(false);
        buttonWest.setBorderPainted(false);
       
        buttonUp = new JButton();
        buttonUp.setIcon(new ImageIcon(getClass().getResource("/Images/flecheUp.gif")));
        buttonUp.setOpaque(false);
        buttonUp.setContentAreaFilled(false);
        buttonUp.setBorderPainted(false);
        
        buttonDown = new JButton();
        buttonDown.setIcon(new ImageIcon(getClass().getResource("/Images/flecheDown.gif")));
       // buttonDown.setPreferredSize(new Dimension(80, 30)); 
        buttonDown.setOpaque(false);
        buttonDown.setContentAreaFilled(false);
        buttonDown.setBorderPainted(false);

        
       //add to panel up/down
        JPanel panelUpDown = new JPanel();
        panelUpDown.setLayout(new GridLayout(2,1));
        panelUpDown.add(buttonUp);
        panelUpDown.add(buttonDown);
        
       //add to panel move        
        //Creation of a container with a horizontal gestion
        Box b1 = Box.createHorizontalBox();
        b1.add(Box.createHorizontalGlue());
        b1.add(buttonNorth);
        add(b1, BorderLayout.NORTH);


        
        //Idem
       Box b2 = Box.createHorizontalBox();
        b2.add(Box.createHorizontalGlue());
       b2.add(buttonWest);
       b2.add(buttonEast);
       add(b2, BorderLayout.CENTER);
      
        //Idem
       Box b3 = Box.createHorizontalBox();
       b3.add(Box.createHorizontalGlue());
       b3.add(buttonSouth);
       add(b3, BorderLayout.SOUTH);
        
        //Creation of a container with a vertical gestion
      Box panelMove = Box.createVerticalBox();
      panelMove.add(Box.createHorizontalGlue());
      panelMove.add(Box.createRigidArea(new Dimension(10, 0)));
       panelMove.add(b1);
      panelMove.add(b2);
      panelMove.add(b3);
       
      //   JPanel b1 = new JPanel();
         //On définit le layout en lui indiquant qu'il travaillera en ligne
       //  b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
        // b1.add(buttonNorth);
         
      //   JPanel b2 = new JPanel();
        //Idem pour cette ligne
      //  b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
      //  b2.add(buttonWest);
       // b2.add(buttonEast);


      //  JPanel b3 = new JPanel();
         //Idem pour cette ligne
       // b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
       // b3.add(buttonSouth);


       // JPanel panelMove = new JPanel();
         //On positionne maintenant ces trois lignes en colonne
      //  panelMove.setLayout(new BoxLayout(panelMove, BoxLayout.PAGE_AXIS));
    //    panelMove.add(b1);
     //  panelMove.add(b2);
      //  panelMove.add(b3);
        
        JPanel panelMoveTot = new JPanel();
        panelMoveTot.add(panelMove);
        panelMoveTot.add(panelUpDown);
        
        
        //label pv
        labelPv = new JLabel("PV : " + "0");
        labelPv.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
        labelPv.setForeground(Color.black);
        
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
        panelTot.setLayout(new BorderLayout());
        panelTot.add(labelback,BorderLayout.CENTER);
        panelTot.add(panelInterface,BorderLayout.SOUTH);
        
        //this.setSize(800, 800);
        //this.setJMenuBar(menuBar);
        //  Container c = new JLabel(makeImage());
        //   c.setLayout(new FlowLayout());
         //  c.add(panelInterface);
       //   c.setPreferredSize(new Dimension(1600,1000));
      //  c.setMaximumSize(new Dimension(1600,1000));
       // c.setMinimumSize(new Dimension(1600,1000));
       // this.add(c);
        this.setTitle("World Of Zuul");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    
    private ImageIcon makeImage()
     {
       return new ImageIcon(getClass().getResource("/Images/outside1.jpg"));
        
     }
     

}
