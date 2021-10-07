/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cb778525
 */
public class VueGAWT extends Frame implements Observer{
    private Button inc;
    private Button dec;
    private Label affiche;

    /**
     * @return the inc
     */
    public Button getInc() {
        return inc;
    }

    /**
     * @return the dec
     */
    public Button getDec() {
        return dec;
    }
    
    /**
     * @param inc the inc to set
     */
    public void setInc(Button inc) {
        this.inc = inc;
    }

    /**
     * @param dec the dec to set
     */
    public void setDec(Button dec) {
        this.dec = dec;
    }

    /**
     * @return the affiche
     */
    public Label getAffiche() {
        return affiche;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(Label affiche) {
        this.affiche = affiche;
    }
   
    public VueGAWT(){
        super("Panier AWT");
        inc = new Button("+");
        dec = new Button("-");
        affiche = new Label("0", Label.CENTER);
        add(inc, BorderLayout.NORTH);
        add(dec, BorderLayout.SOUTH);
        add(affiche, BorderLayout.CENTER);
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        this.pack();
        this.setVisible(true);
        
        /* Use setName() so AssertJ Swing can find these components easily */
        inc.setName("Plus");
        dec.setName("Moins");
        affiche.setName("Affichage");
    }
    
    public void ajoutController(Controller c){
        getInc().addActionListener(c);
        getDec().addActionListener(c);
    }
    
    @Override
    public void update(Observable m, Object panier){     //This method is called whenever the observed object is changed
        String s = ((Panier) panier).getTaillePanier()+"";
        getAffiche().setText(s);
    }
}
