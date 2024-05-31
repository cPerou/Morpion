package classes;

public class Case {
    private int position;
    private boolean utilise;
    private String quelJoueur;
    //constructeur
    public Case(int position, boolean utilise, String quelJoueur) {
        this.position = position;
        this.utilise = utilise;
        this.quelJoueur = quelJoueur;
    }
    //getter et setter
    public int getPosition() {return position;}
    public boolean isUtilise() {return utilise;}
    public String getQuelJoueur() {return quelJoueur;}
    public void setUtilise(boolean utilise) {this.utilise = utilise;}
    public void setQuelJoueur(String quelJoueur) {this.quelJoueur = quelJoueur;}
    //methodes
    public void utiliser(){
        this.utilise = false;
        System.out.println("La case a ete jouee");
    }
}
