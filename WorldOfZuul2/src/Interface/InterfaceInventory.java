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
import FunctionnalCore.Key;
import FunctionnalCore.Player;
import FunctionnalCore.Usable;
import FunctionnalCore.Weapon;
import Interface.InterfaceGame2;



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
public class InterfaceInventory extends JFrame {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //button building
    private JButton back, back2, use, sell, equip, unequip, aButton;
    //store button for all items in the inventory;
    private JButton[] buttonItems;
    //label building
    private JLabel title, goldLabel, goldIconLabel, iconLabel, nom, description, care, damages, effects;
    //panel building
    private JPanel myPanel, top, inventory, gold, view, actions, completeDescription;
    //frame building
    private JFrame inventoryFrame, itemFrame;
    //inventory of the player
    private Inventory inventoryPlayer;
    //the player
    private Player player;
    //the game
    private InterfaceGame2 game;
    //doors of the room where the player is
    //private HashMap<String,Door> doors;
    //some icons
    private Icon anIcon, backIcon, goldIcon;
    private Items myItem;
    private String name;
    private InventoryInterfaceListener evt;
    private Font police = new Font ("Kristen ITC", Font.BOLD, 14);
    private Font police2 = new Font ("Kristen ITC", Font.BOLD, 12);

    public InterfaceInventory(Inventory anInventory, Player aPlayer, InterfaceGame2 aGame){
    
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
        backIcon = new ImageIcon(getClass().getResource("/Images/back.png"));
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
        
        //panel that contains information about gold
        goldLabel = new JLabel("GOLD :" + inventoryPlayer.getGold());
        goldLabel.setBackground(Color.black);
        goldLabel.setOpaque(true);
        goldLabel.setForeground(Color.yellow);
        goldLabel.setFont(police);
        goldIcon = new ImageIcon(this.getClass().getResource("/Images/gold.png"));
        goldIconLabel = new JLabel(goldIcon);
        goldIconLabel.setBackground(Color.black);
        goldIconLabel.setOpaque(true);
            gold = new JPanel ();
            gold.add(goldIconLabel);
            gold.add(goldLabel);
            gold.setBackground(Color.black);
        gold.setOpaque(true);
        
        //top bar inventory building with the back button, the title and information about gold
        top.add(back);
        top.add(title);
        top.add(gold);
        
        //body inventory creation
        inventory = new JPanel (new GridLayout (0,5,10,10));
        inventory.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE));
        inventory.setBackground(Color.black);
        
        //Listeners for buttons action
        evt = new InventoryInterfaceListener(this);
        back.addMouseListener(evt);
        
        //fill the body inventory
        fillInventory(); 
        
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
        back2.addMouseListener(evt);
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
        completeDescription.add(damages);
        completeDescription.add(effects);
        completeDescription.add(care);
        
        //actions panel creation. it contains some buttons
        actions= new JPanel(new GridLayout(1,2));
        
        //use button building
        use= new JButton("USE");
        use.setBackground(Color.black);
        use.setOpaque(true);
        use.setForeground(Color.yellow);
        use.setFont(police);
        use.addMouseListener(evt);
        use.setBorderPainted(false);
        
        //equip button building
        equip= new JButton("EQUIP");
        equip.setBackground(Color.black);
        equip.setOpaque(true);
        equip.setForeground(Color.yellow);
        equip.setFont(police);
        equip.addMouseListener(evt);
        equip.setBorderPainted(false);
    
        //unequip button building
        unequip= new JButton("UNEQUIP");
        unequip.setBackground(Color.black);
        unequip.setOpaque(true);
        unequip.setForeground(Color.yellow);
        unequip.setFont(police);
        unequip.addMouseListener(evt);
        unequip.setBorderPainted(false);
        
        //Panel view building
        view=new JPanel(new BorderLayout());
        view.add(top,BorderLayout.NORTH);
        view.add(iconLabel,BorderLayout.CENTER);
        view.add(completeDescription,BorderLayout.EAST);
    }
    
    /**
     * 
     * @param anItem
     */
    public void displayItem(Items anItem)
    {
        anItem.setManaged();
        manageInventory();
        if (itemFrame==null)
        {
            designItem();
        }
        title.setText("INVENTORY : "+anItem.getName());
        iconLabel.setIcon(getIcon(anItem));
        nom.setText("Name : "+anItem.getName());
        description.setText("Description : "+anItem.getDescription());
        damages.setText("");
        effects.setText("");
        actions.removeAll();
        use.setEnabled(true);
        equip.setEnabled(true);
        unequip.setEnabled(true);
        
        //creation of actions according to type of item
        //if the item is a weapon, add damages to the complete description
        if (anItem instanceof Weapon)
        {
            damages.setText("Damages : "+((Weapon) anItem).getDamages());
            //if this item is not equiped by the player, a button equip is created
            if (((Weapon) anItem).getEquiped()==false)
            {
                actions.add(equip);
                //if another weapon is already equiped by the player, the equip button is disabled
                if (searchEquiped()==true)
                {
                    equip.setEnabled(false);
                }
            }
            //if the item is equiped by the player, a button unequip is created
            else
            {
                actions.add(unequip);
                
            }         
        }
        //if the item is a consumable or a key, a button use is created
        else
        {
            actions.add(use);
            //if the item is a key,  the button use is disabled is there are no locked door and no chest in the room where the player is
//            if (anItem instanceof Key)
//            {
//                if (searchLock()==false)
//                {
//                    use.setEnabled(false);
//                }
//            }
            //if the item is a consumable
            if(anItem instanceof Usable)
            {
                use.setEnabled(true);
                effects.setText("Effect : "+((Usable) anItem).getEffect());
                if (((Usable) anItem).getCare()!=0)
                {
                    care.setText("Care : "+((Usable) anItem).getCare()+" HP");
                }
//                else
//                {
//                    if (((Usable) anItem).getWeapon()==true)
//                    {
//                        damages.setText("Damages added to your weapon : "+((Usable) anItem).getDamage()+" HP");
//                    }
//                    else
//                    {
//                        damages.setText("Damages added : "+((Usable) anItem).getDamage()+" HP");
//
//                    }
//                }
            }
//            //if the item is a consumable and it needs to act with a weapon
//            if (searchEquiped()==false)
//            {
//                if (anItem instanceof Usable)
//                {
//                    if (((Usable) anItem).getWeapon()==true)
//                    {
//                        use.setEnabled(false);
//                    }
//                }
//            }
        }
        //actions.add(sell);
        //if the item is not sellable, the sell button is disabled
//        if (anItem.getSellAble()==false)
//        {
//            sell.setEnabled(false);
//        }
            view.add(actions,BorderLayout.SOUTH);
        itemFrame.add(view);
        itemFrame.pack();
        itemFrame.setVisible(true);
    }
    
    public Items searchItem(String name)
    {
        for (Items item : inventoryPlayer.getItems())
        {
            if (item.getName() == name)
            {
                myItem=item;
            }
        }
        return myItem;
    }
    
    public Items searchItemDisplayed()
    {
        for (Items item : inventoryPlayer.getItems())
        {
            if ((item.getDisplay() == true))
            {
                myItem=item;
                item.setManaged();
            }
        }
        return myItem;
    }
        
    /**
    * This method changes the view of the inventory : general view or focus on an item.
    */
    public void manageInventory()
    {
        if (inventoryFrame.isVisible() == true)
        {
            inventoryFrame.setVisible(false);
        }
        else
        {
            if (itemFrame!=null)
                {
                    itemFrame.setVisible(false);
                }
            fillInventory();
            inventoryFrame.setVisible(true);
        }       
    }
    
    
     /**
     * This method returns the icon according to the given item.
     * @param item
     * @return JButton
     */
    private Icon getIcon(Items anItem)
    {
        for (Items item : inventoryPlayer.getItems())
        {
            name=item.getName();
            if (anItem instanceof Key)
            {
                if (anItem.getDescription().contains("door"))
                {
                    anIcon = new ImageIcon(this.getClass().getResource("/Images/key1.png"));
                }
                else if (anItem.getDescription().contains("chest") || anItem.getDescription().contains("treasure"))
                {
                    anIcon = new ImageIcon(this.getClass().getResource("/Images/keytest.png"));
                }
            }
            //else 
            if (anItem.getName()==name)
            {
                name=name.toLowerCase();
                anIcon = new ImageIcon(this.getClass().getResource("/Images/"+name+".png"));
            }
        }
        return anIcon;
    }   
    
    
    /**
     * This method returns the JButton according to the given item.
     * @param item
     * @return JButton
     */
    private JButton getJButton(Items anItem)
    {
        anIcon=getIcon(anItem);
        aButton= new JButton(anIcon);
        aButton.setBackground(new Color(70, 63, 55));
        aButton.setBorderPainted(false);
        return aButton;
    }
    
     /**
     * This method updates contents of the inventory
     */
    private void fillInventory()
    {
        inventory.removeAll();
        //item buttons building
        buttonItems = new JButton[inventoryPlayer.getNbItems()];
        int counter=0;
        for (Items item : inventoryPlayer.getItems())
        {
            aButton=getJButton(item);
            buttonItems[counter] = aButton;
            buttonItems[counter].addMouseListener(evt);
            inventory.add(buttonItems[counter]);
            counter+=1;
        }
        //empty location building
        while (counter!=inventoryPlayer.getMaxItems())
        {
            JPanel empty = new JPanel();
            empty.setBackground(new Color(70, 63, 55));
            inventory.add(empty);
            counter+=1;
        }  
    }
    
        /**
     * This method searches if the player is equiped of a weapon.
     * @return equiped (true if the player is equiped, false if he is not.)
     */
    private boolean searchEquiped()
    {
        boolean equiped=false;
        for (Items item : inventoryPlayer.getItems())
         {
             if (item instanceof Weapon)
             {
                 if (((Weapon) item).getEquiped()==true)
                 {
                     equiped=true;
                 }
             }
         }
        return equiped;
    }
    
        /**
     * This method returns the game according to the inventory.
     * @return game
     */
    public InterfaceGame2 getGame()
    {
        return game;
    }
    
        /**
     * This method returns the player according to the inventory.
     * @return Player
     */
    public Player getPlayer()
    {
        return player;
    }
    
        /**
     * This method returns the inventory of the player.
     * @return Inventory
     */
    public Inventory getInventory()
    {
        return inventoryPlayer;
    }
    
        /**
     * This method returns an item button
     * @param i : index of button Items
     * @return JButton
     */
    public JButton getItemToDisplay(int i)
    {
        return buttonItems[i];
    }
    
    /**
     * This method returns the unequip button
     * @return JButton unequip
     */
    public JButton getUnequip()
    {
        return unequip;
    }
    
    /**
     * This method returns the equip button
     * @return JButton equip
     */
    public JButton getEquip()
    {
        return equip;
    }
    
        
    /**
     * This method returns the use button
     * @return JButton use
     */
    public JButton getUse()
    {
        return use;
    }
    
        /**
     * This method returns the back2 button
     * @return JButton back2 from the item displayed
     */
    public JButton getBack()
    {
        return back;
    }
    
    /**
     * This method returns the back2 button
     * @return JButton back2 from the item displayed
     */
    public JButton getBack2()
    {
        return back2;
    }   
}
