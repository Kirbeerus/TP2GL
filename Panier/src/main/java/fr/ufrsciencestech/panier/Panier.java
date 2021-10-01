package fr.ufrsciencestech.panier;

import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.fruits = new ArrayList<Fruit>();
        this.contenanceMax = contenanceMax;

    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
    	String listeDesFruits = "";
    		int i = 0;
        for (Fruit fruit : fruits) {
            listeDesFruits += "Fruit "+i+" : "+fruit.toString()+"\n";
            i++;
        }
        return listeDesFruits;
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      this.fruits = fruits;
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }

    public int getContenanceMax(){  //accesseur du second attribut
	return contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
    if (this.fruits.get(i) != null){return this.fruits.get(i);}
	return null;
    }

    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
    if (this.fruits.get(i) != null){this.fruits.set(i, f);}
    }

    public boolean estVide(){  //predicat indiquant que le panier est vide
    return this.fruits.isEmpty();
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein
    return !(this.fruits.size() < this.contenanceMax);
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        if(this.fruits.size() < this.contenanceMax){
            if(o != null){
                this.fruits.add(o);
            }
        }else{
            throw new PanierPleinException();
        }
        
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
        if(this.fruits.size() != 0){
            this.fruits.remove(this.fruits.size()-1);
        }
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	double prix = 0;
        for(Fruit f : fruits){
            prix = prix+f.getPrix();
        }
        return prix;
    }

    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
    	int i = 0;					//A
    	while(i < getFruits().size()){			//B
            if(getFruits().get(i).getOrigine().equals(origine)) {
            	getFruits().remove(i);			//D
            }          	
            else {
            	i++ ;
            }								 
    		
       }
    }

    //groupe 8
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
    	if(o == null)
            return false;

        boolean result = false;
        if(o instanceof Panier){
            Panier p = (Panier) o;
            if(p.getTaillePanier() == this.getTaillePanier())
            {
                int i=0;
                while(i < p.getTaillePanier())
                {					 
                    if( p.getFruits().get(i).getPrix() != this.getFruits().get(i).getPrix() ||
                        !p.fruits.get(i).getOrigine().equals(this.fruits.get(i).getOrigine()) )
                            break;				
                    i++ ;	
                }
                if(i == p.getTaillePanier()) //toutes les oranges parcourues sont les mêmes
                    result = true;
            }
            else //les 2 paniers n'ont pas le même nb d'oranges
                result = false;
        }
        return result;
    }

    //tests
    public static void main (String[] args){
    	//Ecrire ici vos tests
		System.out.println("premier test Panier");
		Panier panier = new Panier(3);
		ArrayList<Fruit> ListeFruits = new ArrayList<>();
		ListeFruits.add(new Orange());
		ListeFruits.add(new Orange(2,"US"));
		ListeFruits.add(new Kiwi(2,"Japon"));
		ListeFruits.add(new Orange(87,"Qatar"));
		panier.setFruits(ListeFruits);
		System.out.println(panier.toString());

    }
}
