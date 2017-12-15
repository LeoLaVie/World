/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import FunctionnalCore.Chest;
import FunctionnalCore.Door;
import FunctionnalCore.Items;
import FunctionnalCore.Key;
import FunctionnalCore.Player;
import FunctionnalCore.Usable;
import FunctionnalCore.Weapon;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class InventoryInterfaceListener extends MouseAdapter {

    private InterfaceInventory inventory;
    private ArrayList<Items> items;
    private Items myItem;
    private int i;
    private HashMap<String, Door> doors;
    private InterfaceGame2 interfaceGame;
    private Player myPlayer;
    JOptionPane dial;

    /**
     * The Constructor for the listener
     */
    public InventoryInterfaceListener(InterfaceInventory c, Player player) {
        inventory = c;
        myPlayer = player;
    }

    /**
     * action to do when the mouse flies on buttons This method displays the
     * name of the item in the inventory
     */
    public void mouseEntered(MouseEvent evt) {
        items = inventory.getInventory().getItems();
        Items anItem = inventory.searchItemDisplayed();
        int i = 0;
        if (evt.getSource() != inventory.getBack()) {
            //if the equip button is disabled, a message is displayed to explain
            if (evt.getSource() == inventory.getEquip()) {
                if (inventory.getEquip().isEnabled() == false) {
                    for (Items item : items) {
                        if (item instanceof Weapon) {
                            if (((Weapon) item).getEquiped() == true) {
                                myItem = item;
                                inventory.getEquip().setToolTipText("You can not equip this weapon. You have to unequip your current weapon (" + myItem.getName() + ").");
                            }
                        }
                    }
                }
            } //if the use button is disabled, a message is displayed to explain
            else if (evt.getSource() == inventory.getUse()) {
                if (inventory.getUse().isEnabled() == false) {
                    if (anItem instanceof Usable) {
                        inventory.getUse().setToolTipText("You have to equip a weapon before using this item.");

                    } else if (anItem instanceof Key) {
                        inventory.getUse().setToolTipText("You can not use a key at the moment.");
                    }
                }
            } else {
                //when the mouse flies on items, a message with the name of object is displayed
                for (Items item : items) {
                    if (evt.getSource() == inventory.getItemToDisplay(i)) {
                        inventory.getItemToDisplay(i).setToolTipText(item.getName());
                    }
                    i += 1;
                }
            }
        }
    }

    /**
     * action to do when the mouse clicks on buttons
     *
     */
    public void mousePressed(MouseEvent evt) {
        items = inventory.getInventory().getItems();
        i = 0;
        //back button closes the inventory
        if (evt.getSource() == inventory.getBack()) {
            inventory.manageInventory();
        } //back2 button closes the item view
        else if (evt.getSource() == inventory.getBack2()) {
            inventory.manageInventory();
        } //use button does lots of things depending on type of object
        else if (evt.getSource() == inventory.getUse()) {
            myItem = inventory.searchItemDisplayed();
            //if (inventory.getUse().isEnabled() == true) {  // bug ici !!!
                System.out.println("coucou");
                //if consumable, this function applies effect of the object
                if (myItem instanceof Usable) {
                    if (((Usable) myItem).getCare() > 0) {
                        inventory.getPlayer().manageHealth(((Usable) myItem).getCare());
                        //inventory.getGame().getHealthBar().setValue(inventory.getPlayer().getHealth());
                        inventory.getGame().getLabelPv().setText(Integer.toString(myPlayer.getHealth()));
                    }
                }
                
                inventory.getInventory().deleteItem(myItem);
                inventory.manageInventory();
               
            //} //if key, this function tries to open the door or chest
             if (myItem instanceof Key) {
                //doors=inventory.getPlayer().getLocation().getDoors();
                //for (Map.Entry<String, Door> door : doors.entrySet()) {
                    //if (door.getValue().isLocked() == true) {
//                             if (door.getValue().getLock().unlock((Key) myItem)==true)
//                             {
//                                  inventory.getGame().setText("You have unlocked the door.");
//                                  inventory.getInventory().deleteItem(myItem);
//                                 break; 
//                             }
//                             else
//                             {
//                                 inventory.getGame().setText("This key does not work, please try another key.");
//                             }
                    //}
                //}
                System.out.println("avant test coffre");
                if (inventory.getPlayer().getLocation().hasChest() == true) {
                    System.out.println("test coffre");
                    Chest aChest = inventory.getPlayer().getLocation().getChest();
                    if (aChest.getLock().unlock((Key) myItem) == true) {

                        //inventory.getGame().setText
                        System.out.println("You have unlocked the chest.");
                        inventory.getInventory().deleteItem(myItem);
                        inventory.manageInventory();
                    } else 
                    {
                        //inventory.getGame().setText
                        System.out.println("This key does not work, please try another key.");
                        dial = new JOptionPane();
                        dial.showMessageDialog(null, "This key does not work, please try another key.", null,
                        JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            }
        } //equip button equips the weapon to the player
        else if (evt.getSource() == inventory.getEquip()) {
            myItem = inventory.searchItemDisplayed();
            if (inventory.getEquip().isEnabled() == true) {
                if (myItem instanceof Weapon) {
                    ((Weapon) myItem).equip();
                    inventory.manageInventory();
                }
            }
        } //unequip button unequips the weapon from the player
        else if (evt.getSource() == inventory.getUnequip()) {
            myItem = inventory.searchItemDisplayed();
            if (myItem instanceof Weapon) {
                ((Weapon) myItem).equip();
            }
            inventory.manageInventory();
        } else {
            //item button displays item view
            for (Items item : items) {
                if (evt.getSource() == inventory.getItemToDisplay(i)) {
                    inventory.displayItem(inventory.searchItem(item.getName()));
                }
                i += 1;
            }
        }
    }
}
