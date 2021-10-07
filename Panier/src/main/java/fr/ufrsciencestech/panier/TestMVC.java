package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class TestMVC 
{
    
    private VueGSwing vue;
    private Controller controleur;  //pour pouvoir changer de controleur si on le souhaite

    public VueGSwing getVue() {
        return vue;
    }

    public void setVue(VueGSwing vue) {
        this.vue = vue;
    }

    public Controller getControleur() {
        return controleur;
    }

    public void setControleur(Controller controleur) {
        this.controleur = controleur;
    }
    
    
    
     public TestMVC(){
        //sans utiliser SpringIoC :
        vue = new VueGSwing();
        controleur = new Controller();
        Panier panier = new Panier(5);
        VueConsole vuec = new VueConsole();

        controleur.setPanier(panier);                 
        panier.addObserver(vue);        
        panier.addObserver(vuec);         
        vue.ajoutController(controleur);
    }
    
    public static void main( String[] args )
    {
         TestMVC test = new TestMVC();
    }
}
