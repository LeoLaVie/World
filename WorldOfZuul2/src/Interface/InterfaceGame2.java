/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
    import FunctionnalCore.Door;
    import FunctionnalCore.Fight; 
import FunctionnalCore.Game;
import FunctionnalCore.Inventory;
    import FunctionnalCore.Key;
import FunctionnalCore.Player;
   // import FunctionnalCore.Game;
    import FunctionnalCore.Room;
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
    import static java.lang.System.exit;
    import javax.swing.*;
    import javax.swing.BorderFactory;
    import javax.swing.Box;
    import javax.swing.BoxLayout;
    import javax.swing.Icon;
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;
    import javax.swing.JTextField;
    import javax.swing.ScrollPaneConstants;
    import javax.swing.SwingConstants;
    import javax.swing.text.BadLocationException;
    import javax.swing.text.Document;
    import javax.swing.JOptionPane;
/**
 *
 * @author leov
 */
public class InterfaceGame2 extends JFrame {
    
    private JButton direction;
    

    
    protected static Room currentRoom; 
    private static Room outside1, houseluttin1, houseluttin2, outside2, ecurie, rdch1, caveh1, toith1, outside3, potager, fastfood, outside4, supermarket, toith2, rdch2;
    private static Room manoir, entreemanoir, bibliotheque, cuisine, cachot, couloir2, chambre1, salledebain, couloir3, terrasse, chambre2, portefermee, portefermee2, lastroom;
    private static Key keyLuttin1;
    
    private JPanel myPanel;
    
        /**
     * Attributes button
     * @param buttonNorth
     * @param buttonEast
     * @param buttonSouth
     * @param buttonWest
     * @param buttonUp
     * @param buttonDown
     * @param buttonLife
     * @param buttonAttack
     * @param buttonChest
     * @param buttonInventory
    */
    private static JButton buttonNorth;
    private static JButton buttonEast;
    private static JButton buttonSouth;
    private static JButton buttonWest;
    private static JButton button;
    private static JButton buttonUp;
    private static JButton buttonDown;
    private static JButton buttonLife;
    private static JButton buttonAttack;
    private static JButton buttonChest;
    private static JButton buttonInventory;
    
    JOptionPane jop1, jop2, jop3;
    
    private JLabel labelPv;
    private JLabel labelImage;
    private JLabel labelText;
    
     //champ textuel
    private JTextField textField;
    private JTextArea textArea;
    protected final static String newline = "\n";
    private JPanel panelText;

    
    private String name;
    private Document doc; 
    private JScrollPane pa;
    
    private Boolean reponseBoolean;
    private String stri;
    private String reponse;
    
    private Fight fight;
    private ImageIcon image;
    
    private Inventory anInventory;
    private Player aPlayer;
    private Game aGame;
    
    
     public InterfaceGame2(String playerName){
         
        
        // initialise instance variables
        createRooms();
        image = new ImageIcon(getClass().getResource("/Images/Outside1.jpg"));
        labelImage = new JLabel();
        labelImage.setIcon(image);
        this.labelImage.setHorizontalAlignment(JLabel.CENTER);
        this.labelImage.setVerticalAlignment(JLabel.CENTER);
     //   labelImage.setMaximumSize(new Dimension(300, 100));
     //   labelImage.setMinimumSize(new Dimension(300,100));
      //  labelImage.setPreferredSize(new Dimension(300, 100));
       
        //setMakeImage(newImage);
        //setMaImage(getMakeImage());
        name = playerName; 
        new Player(name);
        
        //buttonInventory.addActionListener((ActionListener) this);

        
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
        buttonLife.setIcon(new ImageIcon(getClass().getResource("/Images/buttonPotion.gif")));
        buttonLife.setPreferredSize(new Dimension(25,25));
        buttonLife.setOpaque(true); //
        buttonLife.setContentAreaFilled(true);
        buttonLife.setBorderPainted(false);
        buttonLife.setBackground(Color.lightGray);
        buttonLife.setEnabled(false);
       // buttonLife.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        buttonAttack = new JButton();
        buttonAttack.setIcon(new ImageIcon(getClass().getResource("/Images/buttonSword_1.gif")));
        buttonAttack.setPreferredSize(new Dimension(25,25));
        buttonAttack.setOpaque(true);
        buttonAttack.setContentAreaFilled(true);
        buttonAttack.setBorderPainted(false);
        buttonAttack.setBackground(Color.lightGray);
        buttonAttack.setEnabled(false);
      //  buttonAttack.setBorder(BorderFactory.createLineBorder(Color.WHITE));
      
        buttonChest = new JButton();
        buttonChest.setIcon(new ImageIcon(getClass().getResource("/Images/buttonChest2.gif")));
        buttonChest.setPreferredSize(new Dimension(25,25));
        buttonChest.setOpaque(true); //
        buttonChest.setContentAreaFilled(true);
        buttonChest.setBorderPainted(false);
        buttonChest.setBackground(Color.lightGray);
        buttonChest.setEnabled(false);
       // buttonLife.setBorder(BorderFactory.createLineBorder(Color.WHITE));
      
        buttonInventory = new JButton();
        buttonInventory.setIcon(new ImageIcon(getClass().getResource("/Images/buttonInventaire.gif")));
        buttonInventory.setPreferredSize(new Dimension(25,25));
        buttonInventory.setOpaque(true); //
        buttonInventory.setContentAreaFilled(true);
        buttonInventory.setBorderPainted(false);
        buttonInventory.setBackground(Color.lightGray);
       // buttonLife.setBorder(BorderFactory.createLineBorder(Color.WHITE));
       
       
        //Creation of listener
        ListenerMouse m = new ListenerMouse(this);
        
        //listener mouse for directiv button 
        buttonNorth.addMouseListener(m);
        buttonNorth.setActionCommand("North");
        buttonEast.addMouseListener(m);
        buttonEast.setActionCommand("East");
        buttonSouth.addMouseListener(m);
        buttonSouth.setActionCommand("South");
        buttonWest.addMouseListener(m);
        buttonWest.setActionCommand("West");
        buttonUp.addMouseListener(m);
        buttonUp.setActionCommand("Up");
        buttonDown.addMouseListener(m);
        buttonDown.setActionCommand("Down");
        
        ListenerMove x = new ListenerMove(this);
        
        //listener move in the game
        buttonNorth.addActionListener(x);
        buttonEast.addActionListener(x);
        buttonSouth.addActionListener(x);
        buttonWest.addActionListener(x);
        buttonUp.addActionListener(x);
        buttonDown.addActionListener(x);
        
        ListenerFight a = new ListenerFight(fight);
        //listener for action during the fight
        buttonAttack.addActionListener(a);
        buttonLife.addActionListener(a);
        
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
        
        
        Box box1 = Box.createHorizontalBox();
        box1.add(buttonLife);
        box1.add(buttonChest);
        add(box1);
      
        //Idem
        Box box2 = Box.createHorizontalBox();
        box2.add(buttonInventory);
        box2.add(buttonAttack);
        add(box2);
        
        //Creation of a container with a vertical gestion
        Box box3 = Box.createVerticalBox();
        box3.add(box1);
        box3.add(box2);
        
        
        
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
        panelPv.add(labelLife, BorderLayout.NORTH);
        panelPv.add(labelPv, BorderLayout.NORTH);
        
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
        panelInterface.add(box3, BorderLayout.EAST);
        panelInterface.add(panelMoveTot);
        panelInterface.setBackground(new Color(192,192,192));
        
        JPanel globalPanel = new JPanel();
        globalPanel.setLayout(new BorderLayout());
        globalPanel.add(labelImage, BorderLayout.CENTER);
        globalPanel.add(panelInterface, BorderLayout.SOUTH);
        globalPanel.setBackground(Color.GRAY);
        
         
     //   JLabel labelback = new JLabel(makeImage());
      //  labelback.setPreferredSize(new Dimension(1000, 550));
        
        Container c = labelImage;
        c.setLayout(new BorderLayout());
       // c.add(panelInterface,BorderLayout.SOUTH);
        c.setPreferredSize(new Dimension(900,500));
        c.setMaximumSize(new Dimension(900,500));
        c.setMinimumSize(new Dimension(900,500));
        this.add(c, BorderLayout.NORTH);
        this.add(panelInterface, BorderLayout.CENTER);
       // this.add(panelInterface,BorderLayout.SOUTH);
        this.setTitle("World Of Zuul");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.getContentPane().setBackground(Color.GRAY);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(1300,650));
        this.setMaximumSize(new Dimension(1300,650));
        this.setMinimumSize(new Dimension(1300,650));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        jop1 = new JOptionPane();
        jop1.showMessageDialog(null, "Bienvenue à toi, " + Player.getName() + " au pays du père Nöel. \n Pays féerique et coloré emplit de magie ! Enfin..euh.. à vrai dire.. là ça devient n'importe quoi. \nUn virus vegan a atteint le pôle Nord et a transformé le père noël et toute sa clique en monstres de véganisme. Veux-tu en apprendre plus ?", "Warning",
        JOptionPane.INFORMATION_MESSAGE);
        
     }
     
    
     
     private ImageIcon makeImage()
     {
        return image;       
     }
     
     private void changePicture(){
        image = new ImageIcon(getClass().getResource("/Images/" + currentRoom.getNameRoom() + ".jpg"));
        labelImage.setIcon(image);
     }   
    
     
     public static void createRooms()
    {
        // CREATION OF THE DOORS (ROOMS)
        outside1 = new Room("outside1","outside the main entrance of the Santa claus village");
        houseluttin1 = new Room("houseluttin1","in a luttin's house");
        houseluttin2 = new Room("houseluttin2","in a luttin's house");
        outside2 = new Room("outside2","outside of the Santa claus village");
        ecurie = new Room("ecurie", " blab");
        rdch1= new Room("rdch1", " blab");
        caveh1= new Room("caveh1", " blab");
        toith1= new Room("toith1", " blab");
        outside3 = new Room("outside3", " blab");
        potager = new Room("potager", " blab");
        fastfood = new Room("fastfood", " blab");
        outside4 = new Room("outside4", " blab");
        rdch2 = new Room("rdch2", " blab");
        toith2 = new Room("toith2", " blab");
        manoir = new Room("manoir", " blab");
        entreemanoir = new Room("entreemanoir", " blab");
        bibliotheque = new Room("bibliotheque", " blab");;
        cachot= new Room("cachot", " blab");
        cuisine= new Room("cuisine", " blab");
        couloir2 = new Room("couloir2", " blab");
        portefermee = new Room("portefermee", " blab");
        salledebain = new Room("salledebain", " blab");
        chambre1= new Room("chambre1", " blab");
        couloir3 = new Room("couloir3", " blab");
        portefermee2 = new Room("portefermee2", " blab");
        chambre2 = new Room("chambre2", " blab");
        terrasse = new Room("terrasse", " blab");
        lastroom = new Room("lastroom", " blab");
        

        // CREATION OF THE EXITS

        
        // CREATION OF KEYS
         keyLuttin1 = new Key("Key1","Key of the first luttin house");
        //keyLuttin1 = new Key("Key1","Key of the first luttin house");
        //keyLuttin2 = new Key("Key2","Key of the second luttin house");
        
        //CREATION OF CHEST
        
        
        //CREATION OF POTION
        
        
        //CREATION OF WEAPON
        
        
        //CREATION OF NPC
        

        // Exits 
        outside1.setExit("North",null,outside2);
        
        outside2.setExit("West",null,ecurie);
        outside2.setExit("North",null,outside3);
        outside2.setExit("South",null,outside1);
        outside2.setExit("East",null,houseluttin1);
        
        
        houseluttin1.setExit("West",null,outside2);
        houseluttin1.setExit("East",null,rdch1);
        
        rdch1.setExit("Up", null, toith1);
        rdch1.setExit("Down", null, caveh1);
        rdch1.setExit("West", null, houseluttin1);
        
        toith1.setExit("Down", null, rdch1);
        caveh1.setExit("Up", null, rdch1);
        
        ecurie.setExit("East", null, outside2);
        
        outside3.setExit("West",null,potager);
        outside3.setExit("North",null,outside4);
        outside3.setExit("South",null,outside2);
        outside3.setExit("East",null,fastfood);
        
        potager.setExit("East",null,outside3);
        fastfood.setExit("West",null,outside3);
        
        outside4.setExit("West",null,supermarket);
        outside4.setExit("North",null,manoir);
        outside4.setExit("South",null,outside3);
        outside4.setExit("East",null,houseluttin2);

        houseluttin2.setExit("East",null,rdch2);
        houseluttin2.setExit("West",null,outside4);
        rdch2.setExit("Up",null,toith2);
        rdch2.setExit("West",null,houseluttin2);
        toith2.setExit("Down",null,rdch2);
        
        manoir.setExit("North",null,entreemanoir);
        manoir.setExit("South",null,outside4);
        
        entreemanoir.setExit("West",null,bibliotheque);
        entreemanoir.setExit("Up",null,couloir2);
        entreemanoir.setExit("South",null,manoir);
        entreemanoir.setExit("East",null,cuisine);
        
        bibliotheque.setExit("East", null, entreemanoir);
        bibliotheque.setExit("Down", null, cachot);
        cachot.setExit("Up", null, bibliotheque);
        
        cuisine.setExit("West",null,entreemanoir);
        
        couloir2.setExit("Up",null,couloir3);
        couloir2.setExit("Down",null,entreemanoir);
        couloir2.setExit("East",null,salledebain);
        couloir2.setExit("West",null,portefermee);
        
        portefermee.setExit("West", null, chambre1);
        portefermee.setExit("East",null,couloir2);
        salledebain.setExit("West",null,couloir2);
        chambre1.setExit("East",null,couloir2);
        
        couloir3.setExit("Up",null,portefermee2);
        couloir3.setExit("Down",null,couloir2);
        couloir3.setExit("East",null,chambre2);
        couloir3.setExit("West",null,terrasse);
        
        portefermee2.setExit("North", null, lastroom);
        portefermee2.setExit("South",null,couloir3);
        chambre2.setExit("West",null,couloir3);
        terrasse.setExit("East",null,couloir3);
        lastroom.setExit("South", null, couloir3);
        

        

        
        // WHERE THE GAME START
        currentRoom = outside1;
        
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
     
     
     protected void interactionItem(ActionEvent item){
         if (item.getSource() == buttonLife){
             
         }
         else if (item.getSource() == buttonAttack){
             //Fight.runFight();
         }
         else if (item.getSource()== buttonChest){
             
         }
         else if (item.getSource() == buttonInventory){
             
         }
     }
     
     
     
     protected void actionItem(ActionEvent activation){
         
     }
     
      private Box buildContentPane()
      {
        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        //JScrollPane scrollPane = new JScrollPane(textArea);
        doc = textArea.getDocument();
        insert("Bienvenue à toi, " + Player.getName() + " au pays du père Nöel.");
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

    public static JButton getButtonNorth() {
        return buttonNorth;
    }

    public static JButton getButtonEast() {
        return buttonEast;
    }

    public static JButton getButtonSouth() {
        return buttonSouth;
    }

    public static JButton getButtonWest() {
        return buttonWest;
    }

    public static JButton getButtonUp() {
        return buttonUp;
    }

    public static JButton getButtonDown() {
        return buttonDown;
    }

    public static JButton getButtonLife() {
        return buttonLife;
    }

    public static JButton getButtonAttack() {
        return buttonAttack;
    }

    public static JButton getButtonChest() {
        return buttonChest;
    }

    public static JButton getButtonInventory() {
        return buttonInventory;
    }

        /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom(ActionEvent move)
    {
        String action = move.getActionCommand();
        //this.direction = (JButton)move.getSource(); PAS A UTILISEEEEEE !!!!!
        Room nextRoom = null;
       // nextRoom = currentRoom.getExit().get(action).getNextRoom();
      //  if(action.equals("North")){
            if (currentRoom.getExit().get(action) == null) {
                jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "There is no door", "Warning",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("There is no door!"); 
            }
            else{
                if(currentRoom.getExit().get(action).isLocked()){
                jop2 = new JOptionPane();
                jop2.showMessageDialog(null, "It is a closed door", "Warning",
                        JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("La porte est fermée il vous faut la clé");
                }
                else{
                    // condition le joueur à la clé coorespondante et donc ouvre la porte (a faire)
                    System.out.println(currentRoom.getExit().get(action).isLocked());
                    currentRoom = currentRoom.getExit().get(action).getNextRoom();
                    
                    System.out.println("You are " + currentRoom.getDescription());
                    System.out.print("Exits: ");
                    changePicture();
                }
//                currentRoom = nextRoom;
//                //Display the new room
//                System.out.println("You are " + currentRoom.getDescription());
//                System.out.print("Exits: ");
            
                for (String key : currentRoom.getExit().keySet())
                {
                    if (currentRoom.getExit().get(key)!=null)
                    {
                        System.out.println(key);
                    }
                    System.out.println();
                }
            }
    }
    
    public static Room getCurrentRoom() {
        return currentRoom;
    }

    public static Room getOutside1() {
        return outside1;
    }

    public static Room getHouseluttin1() {
        return houseluttin1;
    }

    public static Room getHouseluttin2() {
        return houseluttin2;
    }

    public static Room getOutside2() {
        return outside2;
    }

    public static Room getOutside3() {
        return outside3;
    }

    public static Room getOutside4() {
        return outside4;
    }

    
//    //@Override
//    public void actionPerformed(ActionEvent e)
//    {
//      // When the user click on Marion's picture, the button Start and Change 
//      //become accessible but all the other hero button become unaccessible 
//      
//      if (e.getSource() == buttonInventory)
//        {
//         new InterfaceInventory(anInventory, aPlayer, aGame);
//        }
//      
//    }
    
}
