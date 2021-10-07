/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author cb778525
 */
public class Controller implements ActionListener {
    
    private VueGSwing vue;
    private Panier panier;

    public VueGSwing getVue() {
        return vue;
    }

    public void setVue(VueGSwing vue) {
        this.vue = vue;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }  

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try{
            if(((Component)arg0.getSource()).getName().equals("Plus")){
                panier.ajout(new Orange());             
            }else{
                panier.retrait();
            }
        }catch(Exception e){
            System.err.println("Erreur lie a l'ajout ou retrait : "+e); 
        }
    }
    
}
