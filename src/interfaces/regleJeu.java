package interfaces;

import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;

import java.util.ArrayList;

public interface regleJeu {

    public static void stopJeu(Boolean gagne, typeJoueur leJoueur) {
        if (gagne = true) {
            System.out.println(leJoueur+" a gagné !");
        }else {System.out.println("Match nul");}
        System.exit(0);}

    public static void verifieJeu(ArrayList<Case> listeCase,  typeJoueur leJoueur){
        //vertical
        if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(1).getQuelJoueur() == leJoueur&&
                listeCase.get(2).getQuelJoueur() == leJoueur) {
                stopJeu(true, leJoueur);
            } else if (listeCase.get(3).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(5).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        } else if (listeCase.get(6).getQuelJoueur() == leJoueur &&
                listeCase.get(7).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        // les diagonales
        }else if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        } else if (listeCase.get(2).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(5).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        //horizontale
        } else if (listeCase.get(0).getQuelJoueur() == leJoueur &&
                listeCase.get(3).getQuelJoueur() == leJoueur&&
                listeCase.get(6).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        } else if (listeCase.get(1).getQuelJoueur() == leJoueur &&
                listeCase.get(4).getQuelJoueur() == leJoueur&&
                listeCase.get(7).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
        } else if (listeCase.get(2).getQuelJoueur() == leJoueur &&
                listeCase.get(5).getQuelJoueur() == leJoueur&&
                listeCase.get(8).getQuelJoueur() == leJoueur) {
            stopJeu(true, leJoueur);
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