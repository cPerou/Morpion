package classes;

import enumeration.typeJoueur;

public class Joueur {
    private boolean peutJouer;
    private typeJoueur joueur;
    //constructeur

    public Joueur(boolean peutJouer, typeJoueur joueur) {
        this.peutJouer = peutJouer;
        this.joueur = joueur;
    }

    //getter et setter
    public boolean isPeutJouer() {return peutJouer;}
    public typeJoueur getJoueur() {return joueur;}
    public void setPeutJouer(boolean peutJouer) {this.peutJouer = peutJouer;}
    //methode
    public void joue(int nombre){

        this.peutJouer = false;
    }
}
