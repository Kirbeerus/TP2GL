/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author cb778525
 */
public class PanierTest {
    
    private Fruit mocko1;
    private Fruit mocko2;
    
    public PanierTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mocko1 = mock(Fruit.class);
        mocko2 = mock(Fruit.class);
        
        when(mocko1.getPrix())thenReturn(1.0);
        when(mocko2.getPrix())thenReturn(1.5);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruits method, of class Panier.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        Panier instance = null;
        ArrayList<Fruit> expResult = null;
        ArrayList<Fruit> result = instance.getFruits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFruits method, of class Panier.
     */
    @Test
    public void testSetFruits() {
        System.out.println("setFruits");
        ArrayList<Fruit> fruits = null;
        Panier instance = null;
        instance.setFruits(fruits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaillePanier method, of class Panier.
     */
    @Test
    public void testGetTaillePanier() {
        System.out.println("getTaillePanier");
        Panier instance = null;
        int expResult = 0;
        int result = instance.getTaillePanier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContenanceMax method, of class Panier.
     */
    @Test
    public void testGetContenanceMax() {
        System.out.println("getContenanceMax");
        Panier instance = null;
        int expResult = 0;
        int result = instance.getContenanceMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruit method, of class Panier.
     */
    @Test
    public void testGetFruit() {
        System.out.println("getFruit");
        int i = 0;
        Panier instance = null;
        Fruit expResult = null;
        Fruit result = instance.getFruit(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFruit method, of class Panier.
     */
    @Test
    public void testSetFruit() {
        System.out.println("setFruit");
        int i = 0;
        Fruit f = null;
        Panier instance = null;
        instance.setFruit(i, f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajout method, of class Panier.
     */
    @Test
    public void testAjout() throws Exception {
        System.out.println("ajout");
        Fruit o = null;
        Panier instance = null;
        instance.ajout(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrait method, of class Panier.
     */
    @Test
    public void testRetrait() throws Exception {
        System.out.println("retrait");
        Panier instance = null;
        instance.retrait();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        
       
    }
    
    /**
     * Test of getPrix method, of class Panier with Mock.
     */
    @Test
    public void testGetPrixMock() {
        
        
        System.out.println("testGetPrixMock");
        
        Panier panier = new Panier(3);
        panier.ajoute()
       
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String origine = "";
        Panier instance = null;
        instance.boycotteOrigine(origine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Panier.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Panier.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
