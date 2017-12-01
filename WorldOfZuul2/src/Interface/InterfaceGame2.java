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
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
    import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.*;
    import javax.swing.*;
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
    import javax.swing.ScrollPaneConstants;
    import javax.swing.SwingConstants;
    import javax.swing.text.BadLocationException;
    import javax.swing.text.Document;
/**
 *
 * @author leov
 */
public class InterfaceGame2 extends JFrame {
    
    private JPanel myPanel;
    
    private JButton buttonNorth;
    private JButton buttonEast;
    private JButton buttonSouth;
    private JButton buttonWest;
    private JButton button;
    private JButton buttonUp;
    private JButton buttonDown;
    private JButton buttonLife;
    private JButton buttonAttack;
    
    private JLabel labelPv;
    
     //champ textuel
    private JTextField textField;
    private JTextArea textArea;
    protected final static String newline = "\n";
    private JPanel panelText;
    private JLabel labelText;
    
    private String name;
    private Document doc; 
    private JScrollPane pa;
    
    private Boolean reponseBoolean;
    private String stri;
    private String reponse;
    
     public InterfaceGame2(String playerName){
        
         name = playerName;

        //creation of buttons and label
        buttonNorth = new JButton();
        buttonNorth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheNorth.gif")));
        buttonNorth.setOpaque(true);
        buttonNorth.setContentAreaFilled(true);
        buttonNorth.setBorderPainted(true);
        buttonNorth.setBackground(Color.GRAY);
        buttonNorth.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
      //  buttonNorth.addActionListener(ae);
        
        buttonEast = new JButton();
        buttonEast.setIcon(new ImageIcon(getClass().getResource("/Images/flecheEast.gif")));
        buttonEast.setOpaque(true);
        buttonEast.setContentAreaFilled(true);
        buttonEast.setBorderPainted(true);
        buttonEast.setBackground(Color.GRAY);
        buttonEast.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonSouth = new JButton();
        buttonSouth.setIcon(new ImageIcon(getClass().getResource("/Images/flecheSouth.gif")));
        buttonSouth.setOpaque(true);
        buttonSouth.setContentAreaFilled(true);
        buttonSouth.setBorderPainted(true);
        buttonSouth.setBackground(Color.GRAY);
        buttonSouth.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonWest = new JButton();
        buttonWest.setIcon(new ImageIcon(getClass().getResource("/Images/flecheWest.gif")));
        buttonWest.setOpaque(true);
        buttonWest.setContentAreaFilled(true);
        buttonWest.setBorderPainted(true);
        buttonWest.setBackground(Color.GRAY);
        buttonWest.setBorder(BorderFactory.createLineBorder(Color.WHITE));
       
        buttonUp = new JButton();
        buttonUp.setIcon(new ImageIcon(getClass().getResource("/Images/flecheUp.gif")));
        buttonUp.setOpaque(true);
        buttonUp.setContentAreaFilled(true);
        buttonUp.setBorderPainted(true);
        buttonUp.setBackground(Color.GRAY);
        buttonUp.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonDown = new JButton();
        buttonDown.setIcon(new ImageIcon(getClass().getResource("/Images/flecheDown.gif")));
       // buttonDown.setPreferredSize(new Dimension(80, 30)); 
        buttonDown.setOpaque(true);
        buttonDown.setContentAreaFilled(true);
        buttonDown.setBorderPainted(true);
        buttonDown.setBackground(Color.GRAY);
        buttonDown.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonLife = new JButton();
        buttonLife.setIcon(new ImageIcon(getClass().getResource("/Images/buttonPotion2.gif")));
        buttonLife.setOpaque(true);
        buttonLife.setContentAreaFilled(true);
        buttonLife.setBorderPainted(false);
        buttonLife.setBackground(Color.lightGray);
       // buttonLife.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonAttack = new JButton();
        buttonAttack.setIcon(new ImageIcon(getClass().getResource("/Images/buttonSword2.gif")));
        buttonAttack.setOpaque(true);
        buttonAttack.setContentAreaFilled(true);
        buttonAttack.setBorderPainted(false);
        buttonAttack.setBackground(Color.lightGray);
      //  buttonAttack.setBorder(BorderFactory.createLineBorder(Color.WHITE));
      
        
        //Creation of listener
        ListenerMouse m = new ListenerMouse(this);
        
        //listener mouse for directiv button 
        buttonNorth.addMouseListener(m);
        buttonEast.addMouseListener(m);
        buttonSouth.addMouseListener(m);
        buttonWest.addMouseListener(m);
        buttonUp.addMouseListener(m);
        buttonDown.addMouseListener(m);
        
        ListenerMove x = new ListenerMove(this);
        
        //listener move in the game
        buttonNorth.addActionListener(x);
        buttonEast.addActionListener(x);
        buttonSouth.addActionListener(x);
        buttonWest.addActionListener(x);
        buttonUp.addActionListener(x);
        buttonDown.addActionListener(x);
        
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
        panelMoveTot.add(panelMove);
        panelMoveTot.add(panelUpDown);
        
        
        //panel life and attakc button
        JPanel panelLifeAttack = new JPanel();
        panelLifeAttack.setLayout(new GridLayout(2,2));
        panelLifeAttack.setMaximumSize(new Dimension(30, 30));
        panelLifeAttack.setPreferredSize(new Dimension(30,30));
        panelLifeAttack.setMinimumSize(new Dimension(30, 30));
        JLabel labelvide = new JLabel(" ");
        JLabel labelvide2= new JLabel(" ");
        panelLifeAttack.setBackground(Color.lightGray);
        panelLifeAttack.add(buttonLife);
        panelLifeAttack.add(labelvide);
        panelLifeAttack.add(labelvide2);
        panelLifeAttack.add(buttonAttack);
        
        
        //label pv
        labelPv = new JLabel("100");
        labelPv.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
        labelPv.setForeground(Color.red);
        labelPv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        JLabel labelLife = new JLabel();
        labelLife.setIcon(new ImageIcon(getClass().getResource("/Images/boutton_game.png")));
        labelLife.setText("Life");
        labelLife.setForeground(Color.black);
        labelLife.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLife.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,25));
        labelLife.setVerticalTextPosition(SwingConstants.CENTER);
        labelLife.setHorizontalTextPosition(SwingConstants.CENTER);
        
        JPanel panelPv = new JPanel();
        panelPv.setLayout(new GridLayout(2,1));
        panelPv.setBackground(Color.GRAY);
        panelPv.add(labelLife, BorderLayout.CENTER);
        panelPv.add(labelPv, BorderLayout.CENTER);
        
        JPanel panelYolo = new JPanel();
        panelYolo.setBackground(Color.lightGray);
        panelYolo.add(buildContentPane());
        panelYolo.setMaximumSize(new Dimension(300, 100));
        panelYolo.setMinimumSize(new Dimension(300,100));
        panelYolo.setPreferredSize(new Dimension(300, 100));
        
         //panel interface
        JPanel panelInterface = new JPanel();
        panelInterface.setLayout(new GridLayout(1, 4));
        panelInterface.add(panelPv);
        panelInterface.add(panelYolo, BorderLayout.CENTER);
        panelInterface.add(panelLifeAttack, BorderLayout.EAST);
        panelInterface.add(panelMoveTot);
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
        this.getContentPane().setBackground(Color.GRAY);
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
     
     protected void compteurMouse (MouseEvent evt){
         if (evt.getSource() == buttonNorth){
             buttonNorth.setBackground(Color.lightGray);
             buttonEast.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
         }
         else if (evt.getSource() == buttonEast){
             buttonEast.setBackground(Color.lightGray);
             buttonNorth.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
         }
          else if (evt.getSource() == buttonSouth){
             buttonSouth.setBackground(Color.lightGray);
             buttonEast.setBackground(Color.GRAY);
             buttonNorth.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
         }
          else if (evt.getSource() == buttonWest){
             buttonWest.setBackground(Color.lightGray);
             buttonEast.setBackground(Color.GRAY);
             buttonNorth.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
         }
          else if (evt.getSource() == buttonUp){
             buttonUp.setBackground(Color.lightGray);
             buttonEast.setBackground(Color.GRAY);
             buttonNorth.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
         }
          else if (evt.getSource() == buttonDown){
             buttonDown.setBackground(Color.lightGray);
             buttonEast.setBackground(Color.GRAY);
             buttonNorth.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
         }
          else{
             buttonEast.setBackground(Color.GRAY);
             buttonWest.setBackground(Color.GRAY);
             buttonNorth.setBackground(Color.GRAY);
             buttonSouth.setBackground(Color.GRAY);
             buttonUp.setBackground(Color.GRAY);
             buttonDown.setBackground(Color.GRAY);
          }
     }
     
     protected void moveGame (ActionEvent move){
         if (move.getSource() == buttonNorth){
 
         }
         else if (move.getSource() == buttonEast){

         }
          else if (move.getSource() == buttonSouth){

         }
          else if (move.getSource() == buttonWest){

         }
          else if (move.getSource() == buttonUp){

         }
          else if (move.getSource() == buttonDown){
             
         }
     }
     
     protected void interactionItem(ActionEvent item){
         if (item.getSource() == buttonLife){
             
         }
         else if (item.getSource() == buttonAttack){
             
         }
         else if (item.getSource()== buttonCoffre){
             
         }
     }
     
      private Box buildContentPane()
      {
        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        //JScrollPane scrollPane = new JScrollPane(textArea);
        doc = textArea.getDocument();
        insert("Bienvenue à toi, " + name + " au pays du père Nöel. \n Pays féerique et coloré emplit de magie ! Enfin..euh.. à vrai dire.. là ça devient n'importe quoi. \nUn virus vegan a atteint le pôle Nord et a transformé le père noël et toute sa clique en monstres de véganisme. Veux-tu en apprendre plus ?");
        
        
        // output.setEditable(false);
        pa = new JScrollPane(textArea); //scroll
        pa.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pa.setMaximumSize(new Dimension(300, 100));
        pa.setMinimumSize(new Dimension(300,100));
        pa.setPreferredSize(new Dimension(300, 100));


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(228,30));
        textField.setMaximumSize(new Dimension(228, 30));
        textField.setMinimumSize(new Dimension(228,30));

        JButton boutonText = new JButton(new ActionText(this, "Entrer"));
 
        Box bt1 = Box.createHorizontalBox();
        bt1.add(pa);

        //Idem
        Box bt2 = Box.createHorizontalBox();
        bt2.add(textField);
        bt2.add(boutonText);
        
        Box panelText = Box.createVerticalBox();
        panelText.add(bt1);
        panelText.add(bt2);
        
       // setReponse(reponse);
      //  reponseJoueur();
        
        return panelText;
     }
    
    public void setReponse(String newReponse){
        if (newReponse == "oui" | newReponse == "yes"){
            reponseBoolean = true;
        }
        else if(newReponse == "non" | newReponse == "no"){
            reponseBoolean = false;
        }
        else{
            reponseBoolean = false;
        }
    }
    
    public boolean getReponse(){
        return reponseBoolean;
    }
    
    public void reponseJoueur(){
        
        //boucle
            while (getReponse() != true)
            {
            setReponse(stri);
            insert("C'est pas vraiment la réponse que j'attendais.");
            String b = "Son projet maléfique : rendre inaccessible la junk food, la viande et le gluten de la nation. \nVotre mission : Empêcher ce virus de se propager. Pour cela, vous devrez vaincre le père noël afin de rétablir la vrai nourriture et l'obésité, et accessoirement le guérir";
            insert(b);
            }
           
    }
    
    public JTextField getTextField(){
        return textField;
    }
 
    public JTextArea getTextArea(){
         return textArea;
    }
    
    public void insert (String s) {
        try{
         doc.insertString(0, s + "\n", null);
        }
        catch (BadLocationException exc){
           exc.printStackTrace();
       }
    }

}
