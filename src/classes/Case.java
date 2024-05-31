package classes;

import enumeration.typeJoueur;

public class Case {
    private int position;
    private typeJoueur quelJoueur;
    //constructeur
    public Case(int position, typeJoueur quelJoueur) {
        this.position = position;
        this.quelJoueur = quelJoueur;
    }
    //getter et setter
    public int getPosition() {return position;}
    public typeJoueur getQuelJoueur() {return quelJoueur;}
    public void setQuelJoueur(typeJoueur quelJoueur) {this.quelJoueur = quelJoueur;}
}
