package FunctionnalCore;

import Interface.InterfaceGame2;
import javax.swing.JOptionPane;

/**
 * This class is the event for the fighting between the player and a npc.
 *
 * @author (Grp 10)
 * @version (23/11/2017)
 */
public class Fight extends Events {

    // instance variables - replace the example below with your own
    private boolean isWin;
    private int health;
    private MeanNPC meanNPC;
    private Player myPlayer;
    private boolean fighting = true;
    JOptionPane jop1, dial;
    private InterfaceGame2 interfaceGame;
    private Items item;

    /**
     * Constructor for objects of class Fight
     */
    public Fight(Player player, MeanNPC myNPC) {
        // initialise instance variables
        myPlayer = player;
        meanNPC = myNPC;
    }

    public Player getMyPlayer() {
        return myPlayer;
    }

    /**
     * Method to run the round of fight
     *
     */
    public void fight1() {
        int playerDamages = 1;
        for (Items test : this.getMyPlayer().getInventory().getItems()) {
            if (test instanceof Weapon) {
                if (((Weapon) test).getEquiped()) {
                    playerDamages += ((Weapon) test).getDamages();
                    myPlayer.setAttPower(playerDamages);
                } else {
                    playerDamages = 1;
                    myPlayer.setAttPower(playerDamages);
                }
            }
        }
        System.out.print("\nYour attack does " + myPlayer.getAttPower() + " damage to the enemy!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\n*** Your attack does " + myPlayer.getAttPower() + " damage to the enemy!*** ", null,
                JOptionPane.INFORMATION_MESSAGE);

        meanNPC.setHealth(meanNPC.getHealth(), myPlayer.getAttPower());

        enemyAttack();
        statusUpdate();
    }

    /**
     * method to take a potion during a fighting
     *
     */
    public void takePotion() {
        System.out.print("\nYou have decide to take a potion.");
        System.out.print("\nYou have regained" + myPlayer.calculSoin());
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nYou have decide to take a potion.\n You have regained" + myPlayer.calculSoin(), null,
                JOptionPane.INFORMATION_MESSAGE);
        myPlayer.addHealth();
        enemyAttack();
        statusUpdate();
    }

    /**
     * method when the enemy attack
     *
     */
    public void enemyAttack() {
        System.out.print("\nThe enemy's attack does" + meanNPC.getAttack() + "damage to you!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nThe enemy's attack does" + meanNPC.getAttack() + "damage to you!", null,
                JOptionPane.INFORMATION_MESSAGE);
        myPlayer.setHealth(myPlayer.getHealth(), meanNPC.getAttack());
    }

    /**
     * methode to update the statut of player and enemy
     *
     */
    public void statusUpdate() {
        System.out.print("\n------------------------------------------");
        System.out.print("\n(HP = " + myPlayer.getHealth() + "|| (ENEMY HP = " + meanNPC.getHealth() + ")");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\n(HP = " + myPlayer.getHealth() + "|| (ENEMY HP = " + meanNPC.getHealth() + ")", null,
                JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * Method to get the win when the player has win
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public boolean getWin() {
        return isWin;
    }

    /**
     * Method to describe that the player has win
     *
     */
    public void youWin() {
        // put your code here
        System.out.print("\nCongratulations!\nYou have defeated the enemy!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nCongratulations!\nYou have defeated the enemy!", null,
                JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * Method to describe that the player is death
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public void youLose() {
        System.out.print("\nSorry but you have lose!");
        dial = new JOptionPane();
        dial.showMessageDialog(null, "\nSorry but you have lose!", null,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean isIsWin() {
        return isWin;
    }

    public void setIsWin(boolean isWin) {
        this.isWin = isWin;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
