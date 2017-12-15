/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

//import FunctionnalCore.Fight;
import FunctionnalCore.Fight;
import FunctionnalCore.MeanNPC;
import Interface.InterfaceGame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author leov
 */
public class ListenerFight implements ActionListener{
    private InterfaceGame2 game;
    JOptionPane jop1;
    private boolean fighting = true;
    private static Fight fight;
    private MeanNPC meanNpc;
    
    public ListenerFight (InterfaceGame2 a)
    {
        game = a;
    }
    
        @Override
    public void actionPerformed(ActionEvent fightRun)
    {
//        jop1 = new JOptionPane();
//        jop1.showMessageDialog(null, "\n*** bite ***", null,
//        JOptionPane.INFORMATION_MESSAGE);
        game.runFight(fightRun);
        
//        String action = fightRun.getActionCommand();
//       
//       //fight system
//        while(fighting) {
//            if (game.getaPlayer().getHealth() <= 0 || currentRoom.getmNPC().getHealth() <= 0){
//                fighting = false;
//                break;
//            }
//           // ((JButton)fightRun.getSource()).getActionCommand().equals("attack")
//            else if (((JButton)fightRun.getSource()).getActionCommand().equals("attack")) {
//                //start the fight
//                fight.fight1();
//                fight.enemyAttack();
//                fight.statusUpdate();
//                game.getLabelPv().setText(Integer.toString(game.getaPlayer().getHealth()));
//            }
//            else if (action.equals("life")){
//                //take a potion
//                fight.takePotion();
//                fight.enemyAttack();
//                fight.statusUpdate();
//                game.getLabelPv().setText(Integer.toString(game.getaPlayer().getHealth()));
//            }
////            else{
////                fight.enemyAttack();
////                fight.statusUpdate();
////                labelPv.setText(Integer.toString(aPlayer.getHealth()));
////                
////            }
//        }
//      if (!fighting){
//        if (game.getaPlayer().getHealth() <= 0){
//            fight.youLose();
//        }
//        else if (meanNpc.getHealth() <= 0){
//            fight.youWin();
//        }
//       }
        
    }
    
}
