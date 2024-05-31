package classes;

public class Case {
    private int position;
    private String quelJoueur;
    //constructeur
    public Case(int position, String quelJoueur) {
        this.position = position;
        this.quelJoueur = quelJoueur;
    }
    //getter et setter
    public int getPosition() {return position;}
    public String getQuelJoueur() {return quelJoueur;}
    public void setQuelJoueur(String quelJoueur) {this.quelJoueur = quelJoueur;}
}
