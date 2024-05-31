package classes;

import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.ArrayList;

public class Joueur implements regleJeu {
    private typeJoueur joueur;
    //constructeur
    public Joueur(typeJoueur joueur) {
        this.joueur = joueur;
    }
    //getter et setter
    public typeJoueur getJoueur() {return joueur;}
    //methode
    public void joue(Case caseAJouer, typeJoueur joueur, ArrayList listeCase){
        caseAJouer.setQuelJoueur(joueur);
        regleJeu.visualiseJeu(listeCase);
        regleJeu.verifieJeu(listeCase);
        System.out.println("Tour terminé");
    }
}