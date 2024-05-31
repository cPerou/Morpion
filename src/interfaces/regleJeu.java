package interfaces;

import classes.Case;
import enumeration.typeJoueur;

import java.util.ArrayList;

public interface regleJeu {

    public static void stopJeu() {
        System.out.println("Vous avez gagne");
    }
    public static void verifieJeu(ArrayList<Case> listeCase){
        if (listeCase.get(0).getQuelJoueur() == typeJoueur.ROND &&
                listeCase.get(1).getQuelJoueur() == typeJoueur.ROND&&
                listeCase.get(2).getQuelJoueur() == typeJoueur.ROND) {
                stopJeu();
            }
        }
    public static void visualiseJeu(ArrayList<Case> listeCase){
        for (Case uneCase : listeCase) {
            // Afficher si la case est jouée + quel joueur + numero case
            if (uneCase.getQuelJoueur()!=null) {
                System.out.println("La case "+ uneCase.getPosition() +" est jouée par "+ uneCase.getQuelJoueur());
            } else {
                System.out.println("La case n'est pas encore jouée");
            }
        }
    }
    }