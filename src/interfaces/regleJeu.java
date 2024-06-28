package interfaces;

import classes.Plateau;
import enumeration.typeJoueur;

public interface regleJeu {

    public static void stopJeu(int gagne, typeJoueur leJoueur) {
        if (gagne == 1) {
            System.out.println(leJoueur+" a gagné !");
            System.exit(0);
        }else{
            System.out.println("Match nul");}
            System.exit(0);}

    public static void verifieJeu(Plateau lePlateau, typeJoueur leJoueur){
        //horizontal
        if ((lePlateau.getGrille()[0][0] == leJoueur) &&
                (lePlateau.getGrille()[0][1] == leJoueur) &&
                (lePlateau.getGrille()[0][2] == leJoueur)) {
                stopJeu(1, leJoueur);
            } else if ((lePlateau.getGrille()[1][0] == leJoueur) &&
                (lePlateau.getGrille()[1][1] == leJoueur) &&
                (lePlateau.getGrille()[1][2] == leJoueur)) {
            stopJeu(1, leJoueur);
        } else if ((lePlateau.getGrille()[2][0] == leJoueur) &&
                (lePlateau.getGrille()[2][1] == leJoueur) &&
                (lePlateau.getGrille()[2][2] == leJoueur)){
            stopJeu(1, leJoueur);
        // les diagonales
        }else if ((lePlateau.getGrille()[0][0] == leJoueur) &&
                (lePlateau.getGrille()[1][1] == leJoueur) &&
                (lePlateau.getGrille()[2][2] == leJoueur)) {
            stopJeu(1, leJoueur);
        } else if ((lePlateau.getGrille()[0][2] == leJoueur) &&
                (lePlateau.getGrille()[1][1] == leJoueur) &&
                (lePlateau.getGrille()[2][0] == leJoueur)) {
            stopJeu(1, leJoueur);
        //vertical
        } else if ((lePlateau.getGrille()[0][0] == leJoueur) &&
                (lePlateau.getGrille()[1][0] == leJoueur) &&
                (lePlateau.getGrille()[2][0] == leJoueur)) {
            stopJeu(1, leJoueur);
        } else if ((lePlateau.getGrille()[0][1] == leJoueur) &&
                (lePlateau.getGrille()[1][1] == leJoueur) &&
                (lePlateau.getGrille()[2][1] == leJoueur)) {
            stopJeu(1, leJoueur);
        } else if ((lePlateau.getGrille()[0][2] == leJoueur) &&
                (lePlateau.getGrille()[1][2] == leJoueur) &&
                (lePlateau.getGrille()[2][2] == leJoueur)) {
            stopJeu(1, leJoueur);
        }
    }
    }