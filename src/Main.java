import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String... args){
        //presentation du jeu
        System.out.println("*** Jeu du morpion ***");
        System.out.println("Pour gagner le jeu il faut aligner 3 cases");

        //creer les cases
        ArrayList<Case> listeCase = new ArrayList<>();
        for (int i=1;i<10;i++)
            listeCase.add(new Case(i, null));

        //Creer les joueurs
        String nomJoueur1 = Joueur.entreNom(typeJoueur.CROIX);
        Joueur joueur1 = new Joueur(nomJoueur1, typeJoueur.CROIX);
        String nomJoueur2 = Joueur.entreNom(typeJoueur.ROND);
        Joueur joueur2 = new Joueur(nomJoueur2, typeJoueur.ROND);

        //lance la pièce au hasard pour savoir qui commence
        Random random = new Random();
        int quiCommence = random.nextInt(0,2);

        if (quiCommence == 0){
            System.out.println("Après tirage au sort,");
            System.out.println(nomJoueur1+" est le premier joueur à jouer");

            for (int i=1;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+joueur1.getJoueur()+" ("+nomJoueur1+") joue :");
                    int saCase = joueur1.choisiCase(listeCase);
                    joueur1.joue(listeCase.get(saCase-1), listeCase);
                    regleJeu.verifieJeu(listeCase, joueur1.getJoueur());

                    System.out.println("Joueur "+joueur2.getJoueur()+" ("+nomJoueur2+") joue :");
                    int saCase2 = joueur2.choisiCase(listeCase);
                    joueur2.joue(listeCase.get(saCase2-1), listeCase);
                    regleJeu.verifieJeu(listeCase, joueur2.getJoueur());
                }
            }

            System.out.println("La partie est nulle");
            regleJeu.stopJeu(false, null);
        }else {
            System.out.println("Après tirage au sort,");
            System.out.println(nomJoueur2+" est le premier joueur à jouer ");

            for (int i=1;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+nomJoueur2+" ("+joueur2.getJoueur()+") joue :");
                    int saCase2 = joueur2.choisiCase(listeCase);
                    joueur2.joue(listeCase.get(saCase2-1), listeCase);
                    regleJeu.verifieJeu(listeCase, joueur2.getJoueur());

                    System.out.println("Joueur "+nomJoueur1+" ("+joueur1.getJoueur()+") joue :");
                    int saCase = joueur1.choisiCase(listeCase);
                    joueur1.joue(listeCase.get(saCase-1), listeCase);
                    regleJeu.verifieJeu(listeCase, joueur1.getJoueur());
                }
            }

            System.out.println("La partie est nulle");
            regleJeu.stopJeu(false, null);
        }
    }
}
