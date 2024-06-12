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
    //quel est la position de cette case ?
    public int getPosition() {return position;}
    //qui a joué cette case ?
    public typeJoueur getQuelJoueur() {return quelJoueur;}
    //un joueur a pris cette case, il ajoute sa marque
    public void setQuelJoueur(typeJoueur quelJoueur) {this.quelJoueur = quelJoueur;}
}
