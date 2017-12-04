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
import FunctionnalCore.Weapon;

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;
    import java.util.Scanner;
    import java.awt.*;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import java.util.HashMap;
    import javax.swing.*;

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
 * @author Nicolas
 */
public class InterfaceInventory extends JFrame implements ActionListener {
    private Items items;
    private Weapon w1;
    private Player player1;
    //private Inventory inventory;
    
    private static final long serialVersionUID = 1L;
    //button building
    private JButton back, back2, use, equip, unequip, aButton;
    //store button for all items in the inventory;
    private JButton[] buttonItems;
    //label building
    private JLabel title, goldLabel, goldIconLabel, iconLabel, nom, description, price, care, damages, effects;
    //panel building
    private JPanel myPanel, top, inventory, gold, view, actions, completeDescription;
    //frame building
    private JFrame inventoryFrame, itemFrame;
    //inventory of the player
    private Inventory inventoryPlayer;
    //the player
    private Player player;
    //the game
    private Game game;
    //doors of the room where the player is
    private HashMap<String,Door> doors;
    //some icons
    private Icon anIcon, backIcon, goldIcon;
    private Items myItem;
    private String name;
    //private InventoryInterfaceListener evt;
    private Font police = new Font ("Kristen ITC", Font.BOLD, 14);
    private Font police2 = new Font ("Kristen ITC", Font.BOLD, 12);

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InterfaceInventory (Inventory anInventory, Player aPlayer, Game aGame){
    
//information from game
    	inventoryPlayer = anInventory;
    	player = aPlayer;
    	game = aGame;

        //inventory building
        myPanel = new JPanel(new BorderLayout ());
        myPanel.setBackground(Color.black);
        
        //top bar of the inventory creation
        top = new JPanel (new GridLayout (1,3));
        //back contains a Button including an icon
        backIcon = new ImageIcon(getClass().getResource("/Images/testBack.jpg"));
        back = new JButton ("BACK", backIcon);
        back.setBackground(Color.black);
        back.setOpaque(true);
        back.setForeground(Color.yellow);
        back.setFont(police);
        back.setBorderPainted(false);
        //title of the inventory
        title = new JLabel ("INVENTORY", JLabel.CENTER);
        title.setBackground(Color.black);
        title.setOpaque(true);
        title.setForeground(Color.yellow);
        title.setFont(police);
        
        //top bar inventory building with the back button, the title and information about gold
        top.add(back);
        top.add(title);
        
        //body inventory creation
        inventory = new JPanel (new GridLayout (0,5,10,10));
        inventory.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE));
        inventory.setBackground(Color.black);
        
        //fill the body inventory
        //fillInventory(); 
        
        //myPanel building with the top bar and the body
        myPanel.add(top,BorderLayout.NORTH);
        myPanel.add(inventory,BorderLayout.CENTER);
        
        //myPanel building with the top bar and the body
        myPanel.add(top,BorderLayout.NORTH);
        myPanel.add(inventory,BorderLayout.CENTER);
        
        //frame building including the top bar and the body of the inventory
        inventoryFrame= new JFrame("My inventory");  
        inventoryFrame.add(myPanel);
        inventoryFrame.setSize(700, 400);
        inventoryFrame.setResizable(false);
        //inventoryFrame.pack();
        inventoryFrame.setVisible(true);
    }

    private void designItem()
    {
            //item view building
            itemFrame = new JFrame("My item");
        itemFrame.setSize(500, 500);
        top = new JPanel (new GridLayout (1,2));
        
        //back button building
        back2 = new JButton ("BACK", backIcon);
        back2.setBackground(Color.black);
        back2.setOpaque(true);
        back2.setForeground(Color.yellow);
        back2.setFont(police);        
        //back2.addMouseListener(evt);
        back2.setBorderPainted(false);
        //title building
        title = new JLabel ("",JLabel.CENTER);
        title.setBackground(Color.black);
        title.setOpaque(true);
        title.setForeground(Color.yellow);
        title.setFont(police);

        
        //top bar of the item view building
        top.add(back2);
        top.add(title);
        
        //item picture building
        iconLabel=new JLabel();
        iconLabel.setBackground(new Color(70, 63, 55));
        iconLabel.setOpaque(true);
        
        //description of the item building with the name,the description and the price of the object
        completeDescription=new JPanel(new GridLayout(0,1));
        completeDescription.setBackground(new Color(70, 63, 55));
        completeDescription.setOpaque(true);
        nom=new JLabel("");
        nom.setForeground(Color.white);
        nom.setFont(police2);
        description=new JLabel("");
        description.setForeground(Color.white);
        description.setFont(police2);
        price=new JLabel("");
        price.setForeground(Color.white);
        price.setFont(police2);
        damages=new JLabel("");
        damages.setForeground(Color.white);
        damages.setFont(police2);
        effects=new JLabel("");
        effects.setForeground(Color.white);
        effects.setFont(police2);
        care=new JLabel("");
        care.setForeground(Color.white);
        care.setFont(police2);
        completeDescription.add(nom);
        completeDescription.add(description);
        completeDescription.add(price);
        completeDescription.add(damages);
        completeDescription.add(effects);
        completeDescription.add(care);
        
        //actions panel creation. it contains some buttons
        actions= new JPanel(new GridLayout(1,2));
    }
}


