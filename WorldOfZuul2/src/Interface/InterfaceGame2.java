/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
    import FunctionnalCore.Door;
    import FunctionnalCore.Fight; 
import FunctionnalCore.Key;
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
    
    private JButton direction;
    
    protected static Room currentRoom; 
    private static Room outside1, houseluttin1, houseluttin2, outside2, houseluttin3, houseluttin4, outside3, houseluttin5, houseluttin6, outside4, castlePapa;
    private static Room mineCastle, roofCastle, entreCastle, roomCastle1, roomCastle2, roomCastle3, roomCastle4, roomCastle5, roomCastle6, roomMama, roomCastle8, roomCastle9, roomCastle10,  roomCastle7, floor2, floor3, floor4, roomBoos;
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
    
    private Fight fight;
 //   protected Game room;
    private static ImageIcon image;
    private static ImageIcon newImage;

    
    
     public InterfaceGame2(String playerName){
        
         // initialise instance variables
         createRooms();
         newImage = new ImageIcon(getClass().getResource("/Images/Outside1.jpg"));
         setMakeImage(newImage);
         
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
        
        
        //panel life and attakc button
       // JPanel panelLifeAttack = new JPanel();
     //   panelLifeAttack.setLayout(new GridLayout(2,2));
     //   panelLifeAttack.setMaximumSize(new Dimension(30, 30));
     //   panelLifeAttack.setPreferredSize(new Dimension(30,30));
    //    panelLifeAttack.setMinimumSize(new Dimension(30, 30));
      //  JLabel labelvide = new JLabel(" ");
    //    JLabel labelvide2= new JLabel(" ");
    //    panelLifeAttack.setBackground(Color.lightGray);
    //    panelLifeAttack.add(buttonLife);
     //   panelLifeAttack.add(buttonChest);
     //   panelLifeAttack.add(buttonInventory);
     //   panelLifeAttack.add(buttonAttack);
        
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
        panelInterface.add(box3, BorderLayout.EAST);
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
        return image;
         //ImageIcon(getClass().getResource("/Images/Outside1.jpg"));
        
     }
     
     public static void setMakeImage (ImageIcon newPicture){
         image = newPicture;
     }
     
     public static void createRooms()
    {
        // CREATION OF THE DOORS (ROOMS)
        outside1 = new Room("outside1","outside the main entrance of the Santa claus village");
        houseluttin1 = new Room("houseluttin1","in a luttin's house");
        houseluttin2 = new Room("houseluttin2","in a luttin's house");
        outside2 = new Room("outside2","outside of the Santa claus village");

        // CREATION OF THE EXITS
//        outside1.setExit(getButtonNorth(),null,outside2); //(direction,key,nextRoom)
//        houseluttin1.setExit(getButtonWest(),null,null);
//        houseluttin2.setExit(getButtonEast(),null,null);
//        outside2.setExit(getButtonNorth(),null,null);
        
        // CREATION OF KEYS
         keyLuttin1 = new Key("Key1","Key of the first luttin house");
        //keyLuttin1 = new Key("Key1","Key of the first luttin house");
        //keyLuttin2 = new Key("Key2","Key of the second luttin house");
        
        //CREATION OF CHEST
        
        
        //CREATION OF POTION
        
        
        //CREATION OF WEAPON
        

        // Exits 
        outside1.setExit("North",null,houseluttin1);
        houseluttin1.setExit("South",null,outside1);
        houseluttin1.setExit("North",keyLuttin1,houseluttin2);
        houseluttin1.setExit("East",null,outside2);
        houseluttin2.setExit("South",keyLuttin1,houseluttin1);
        outside2.setExit("West",null,houseluttin1);
        
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
        nextRoom = currentRoom.getExit().get(action).getNextRoom();
        if(action.equals("North")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!"); 
            }
            else{
                if(currentRoom.getExit().get(action).isLocked()){
                    System.out.println("La porte est fermé il vous faut la clé");
                }
                else{
                    // condition le joueur à la clé coorespondante et donc ouvre la porte (a faire)
                    System.out.println(currentRoom.getExit().get(action).isLocked());
                    currentRoom = currentRoom.getExit().get(action).getNextRoom();
                    System.out.println("You are " + currentRoom.getDescription());
                    System.out.print("Exits: ");
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
        else if (action.equals("East")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                 System.out.println("You are " + currentRoom.getDescription());
                System.out.print("Exits: ");
            
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
            
        else if (action.equals("South")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                 System.out.println("You are " + currentRoom.getDescription());
                System.out.print("Exits: ");
            
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
        else if (action.equals("West")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                System.out.println("You are " + currentRoom.getDescription());
                System.out.print("Exits: ");
            
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
        else if (action.equals("Up")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                 System.out.println("You are " + currentRoom.getDescription());
                System.out.print("Exits: ");
            
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
        else if (action.equals("Down")){
            if (currentRoom.getExit().get(action) == null) {
                System.out.println("There is no door!");
                
            }
            else{
                currentRoom = nextRoom;
                //Display the new room
                 System.out.println("You are " + currentRoom.getDescription());
                System.out.print("Exits: ");
            
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

    public static Room getHouseluttin3() {
        return houseluttin3;
    }

    public static Room getHouseluttin4() {
        return houseluttin4;
    }

    public static Room getOutside3() {
        return outside3;
    }

    public static Room getHouseluttin5() {
        return houseluttin5;
    }

    public static Room getHouseluttin6() {
        return houseluttin6;
    }

    public static Room getOutside4() {
        return outside4;
    }

    public static Room getCastlePapa() {
        return castlePapa;
    }

    public static Room getMineCastle() {
        return mineCastle;
    }

    public static Room getRoofCastle() {
        return roofCastle;
    }

    public static Room getEntreCastle() {
        return entreCastle;
    }

    public static Room getRoomCastle1() {
        return roomCastle1;
    }

    public static Room getRoomCastle2() {
        return roomCastle2;
    }

    public static Room getRoomCastle3() {
        return roomCastle3;
    }

    public static Room getRoomCastle4() {
        return roomCastle4;
    }

    public static Room getRoomCastle5() {
        return roomCastle5;
    }

    public static Room getRoomCastle6() {
        return roomCastle6;
    }

    public static Room getRoomMama() {
        return roomMama;
    }

    public static Room getRoomCastle8() {
        return roomCastle8;
    }

    public static Room getRoomCastle9() {
        return roomCastle9;
    }

    public static Room getRoomCastle10() {
        return roomCastle10;
    }

    public static Room getRoomCastle7() {
        return roomCastle7;
    }

    public static Room getFloor2() {
        return floor2;
    }

    public static Room getFloor3() {
        return floor3;
    }

    public static Room getFloor4() {
        return floor4;
    }

    public static Room getRoomBoos() {
        return roomBoos;
    }
    
}
