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
    
    private  Fruit mocko1;
    private  Fruit mocko2;
    private  Fruit mocko3;
    
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
        mocko3 = mock(Fruit.class);
        
        when(mocko1.getPrix()).thenReturn(1.0);
        when(mocko2.getPrix()).thenReturn(0.5);
        
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
        System.out.println("AJout");
        
        Panier panier = new Panier(2);
        
        Fruit f1 = new Orange();
        Fruit f2 = new Orange();
        panier.ajout(f1);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(null);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(f2);
        assertTrue(panier.getTaillePanier() == 2);
        
    }
    
    /**
     * Test of ajout method, of class Panier with mocko.
     */
    @Test
    public void testAjoutMocko() throws Exception {
        System.out.println("AJout mock");
        
        Panier panier = new Panier(2);
        
        panier.ajout(mocko1);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(null);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(mocko2);
        assertTrue(panier.getTaillePanier() == 2);
                
        
    }
    
    /**
     * Test of ajout method, of class Panier with mocko.
     */
    @Test(expected=PanierPleinException.class)
    public void testAjoutMockoInvalide() throws Exception {
        System.out.println("AJout mock");
        
        Panier panier = new Panier(2);
        
        panier.ajout(mocko1);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(null);
        assertTrue(panier.getTaillePanier() == 1);
        
        panier.ajout(mocko2);
        assertTrue(panier.getTaillePanier() == 2);
        
        panier.ajout(mocko3);
        
        
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
    public void testGetPrix() throws PanierPleinException, PanierVideException  {
         System.out.println("testGetPrixMock");
        
        Panier panier = new Panier(3);
        Fruit f1 = new Orange(1.0,"espagne");
        Fruit f2 = new Orange(0.5,"espagne");
        panier.ajout(f1);
        panier.ajout(f2);
        double res = panier.getPrix();
        
        //test unitaires
        assertTrue(res == 1.5);
        
        panier.retrait();
        res = panier.getPrix();
        //test d'interactions
        assertTrue(res == 1.0);
       
    }
    
    /**
     * Test of getPrix method, of class Panier with Mock.
     */
    @Test
    public void testGetPrixMock() throws PanierPleinException, PanierVideException {
        
        
        System.out.println("testGetPrixMock");
        
        Panier panier = new Panier(3);
        panier.ajout(mocko1);
        panier.ajout(mocko2);
        double res = panier.getPrix();
        
        //test unitaires
        verify(mocko1, times(1)).getPrix();
        verify(mocko2, times(1)).getPrix();
        assertTrue(res == 1.5);
        
        panier.retrait();
        res = panier.getPrix();
        //test d'interactions
        verify(mocko1, times(2)).getPrix();
        verify(mocko2, times(1)).getPrix();
        assertTrue(res == 1.0);
        
       
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     * @throws PanierPleinException 
     */
    @Test
    public void testBoycotteOrigine() throws PanierPleinException {
        System.out.println("boycotteOrigine");
        Panier p1 = new Panier(3);
        Panier p2 = new Panier(3);
        Panier p3 = new Panier(3);
        Panier p4 = new Panier(3);
        
        Fruit f1 = new Orange(0.5,"Espagne");
        Fruit f2 = new Kiwi(0.5,"Espagne");
        Fruit f3 = new Orange(0.5,"France");
        Fruit f4 = new Orange(0.5,"Madrid");
        
        p1.boycotteOrigine("Espagne");
        assertTrue(p1.getTaillePanier() == 0);
        p1.boycotteOrigine("123");
        assertTrue(p1.getTaillePanier() == 0);
        
        p2.ajout(f1);
        
        p2.boycotteOrigine("");
        assertTrue(p2.getTaillePanier() == 1);
        
        p2.boycotteOrigine("Espagne");
        assertTrue(p2.getTaillePanier() == 0);
        
        
        p3.ajout(f1);
        p3.ajout(f3);
        
        p3.boycotteOrigine("123");
        assertTrue(p3.getTaillePanier() == 2);
        
        p3.boycotteOrigine("Espagne");
        assertTrue(p3.getTaillePanier() == 1);
        
        p4.ajout(f1);
        p4.ajout(f2);
        p4.ajout(f3);
        
        p4.boycotteOrigine("123");
        assertTrue(p4.getTaillePanier() == 3);
        
        p4.boycotteOrigine("Espagne");
        assertTrue(p4.getTaillePanier() == 1);
        
    }

    /**
     * Test of equals method, of class Panier.
     * @throws PanierPleinException 
     */
    @Test
    public void testEquals() throws PanierPleinException {
        System.out.println("equals");
        Panier p1 = new Panier(3);
        Panier p2 = new Panier(5);
        
        Fruit f1 = new Orange();
        Fruit f2 = new Orange(0.5,"espagne");
        Fruit f3 = new Kiwi();
        
        p1.ajout(f1);
        p1.ajout(f2);
        p1.ajout(f3);
        
        
        p2.ajout(f1);
        p2.ajout(f2);
        p2.ajout(f3);
        
        assertEquals(p2,p1);
        
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
