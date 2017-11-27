package FunctionnalCore;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class test MeanNPCTest.
 *
 * @author G10
 * @version nov 2017
 *
 */
public class MeanNPCTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private MeanNPC kindNPC;
    private MeanNPC ennemyNPC;
    private MeanNPC goodNPC;
    private MeanNPC badNPC;

    /**
     * Constructeur de la classe-test NPCTest
     */
    public MeanNPCTest()
    {  
        
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        goodNPC = new MeanNPC("Vic", 100, 0, true);
        badNPC = new MeanNPC("Ka", 50, 10, false);
        kindNPC = new MeanNPC("Tom", 100, 0, true);
        ennemyNPC = new MeanNPC("Jim", 100, 15, true);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    @Test
    public void testGettersOk()
    {
        assertEquals("Vic", goodNPC.getNameMNPC());      
        assertEquals(100, goodNPC.getHealth());
        assertEquals(0, goodNPC.getAttack());
        assertEquals(true, goodNPC.getAlive());
    }
    
    @Test
	public void testlostHP0() 
	{	//ennemyNPC.Health = (ennemyNPC.Health)-300;
	    ennemyNPC.losePointNPC(300);
	    assertEquals(0, ennemyNPC.getHealth());
    }
    
      @Test
	public void testlostHP50() 
	{	//ennemyNPC.Health = (ennemyNPC.Health)-300;
	    ennemyNPC.losePointNPC(50);
	    assertEquals(50, ennemyNPC.getHealth());
    }
}


