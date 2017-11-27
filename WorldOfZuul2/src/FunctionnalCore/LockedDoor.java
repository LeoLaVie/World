package FunctionnalCore;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Permet de faire la différence entre les portes vérouillées qui nécessitent une clé pour être ouvertede celles toujours ouvertes 
 * et donc qui ne nécessitent pas de clés.
 *
 * @author (CHAMFEUIL Victor-gabriel)
 * @version (20 novembre 2017)
 */
public class LockedDoor extends Door
{
    private int key;
    // Attribut clé qui correspond au numéro de la clé
    private boolean locked;
    // Attribut de type boolean qui prend la valeur vrai si la porte est fermée et faux si elle est ouverte

    /**
     * Constructeur d'objets de classe LockedDoor, en plus des pièces suivantes et précédentes, possède un identificateur de
     * type int qui correspond à la clé.
     */
    public LockedDoor(Room nextRoom, Room previousRoom, int key)
    {
        super(nextRoom,previousRoom);
        // initialisation des variables d'instance

    }

    /**
     * La méthode isOk permet de vérifier que la clé fournie en argument correspond à la clé de la porte
     *
     * @param  int provideKey correspond au numéro de la clé fournie
     * @return    un boolean vrai si la clé est bonne et faux si la clé n'est pas bonne.
     */
    public boolean isOk(int providedKey)
    {
        return false;    
    }

    /**
     * La méthode isLocked permet de vérifier que la porte est vérouillée ou non
     *
     * @param //
     * @return   un boolean vrai si la porte est ouverte ou faux est fermée en fonction de l'état de la porte
     */
    public boolean isLocked()
    {
        return false;
    }

    /**
     * La méthode unlock permet de dévérouiller la porte si la clé fournie est la bonne
     *
     * @param  int provideKey correspond au numéro de la clé fournie
     * @return  //
     */
    public void unlock(int providedKey)
    {
    }

    /**
     * La méthode nextRoom permet d'obtenir la référence de lapièce suivante à condition que la porte soit dévérouillée.
     *
     * @param //
     * @return  renvoi la pièce suivante si la pièce est dévérouillée et la pièce précédente est verouillée
     */
    
    public Room nextRoom()
    {

        return super.getNextRoom();
    }

}
