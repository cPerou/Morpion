package interfaces;

import classes.Case;
import enumeration.typeJoueur;

import java.util.ArrayList;

public interface regleJeu {

    public static void stopJeu() {
        System.out.println("Vous avez gagne");
        System.exit(0);}

    public static void verifieJeu(ArrayList<Case> listeCase,  typeJoueur leJoueur){
        //vertical
        if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(1).getQuelJoueur() == leJoueur&&
                listeCase.get(2).getQuelJoueur() == leJoueur) {
                stopJeu();
            } else if (listeCase.get(3).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(5).getQuelJoueur() == leJoueur) {
            stopJeu();
        } else if (listeCase.get(6).getQuelJoueur() == leJoueur &&
                listeCase.get(7).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu();
        // les diagonales
        }else if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu();
        } else if (listeCase.get(2).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(5).getQuelJoueur() == leJoueur) {
            stopJeu();
        //horizontale
        } else if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(3).getQuelJoueur() == leJoueur&&
                listeCase.get(6).getQuelJoueur() == leJoueur) {
            stopJeu();
        } else if (listeCase.get(1).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(7).getQuelJoueur() == leJoueur) {
            stopJeu();
        } else if (listeCase.get(2).getQuelJoueur() == leJoueur &&
                listeCase.get(5).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu();
        }
    }
    public static void visualiseJeu(ArrayList<Case> listeCase){
        for (Case uneCase : listeCase) {
            // Afficher si la case est jouée + quel joueur + numero case
            if (uneCase.getQuelJoueur()!=null) {
                System.out.println("La case "+uneCase.getPosition()+" est jouée par "+ uneCase.getQuelJoueur());
            } else {
                System.out.println("La case "+uneCase.getPosition()+" n'est pas encore jouée");
            }
        }
    }
    }