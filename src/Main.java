import classes.Joueur;
import classes.Plateau;
import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.Random;

public class Main {
    public static void main(String... args){
        //presentation du jeu
        System.out.println("*** Jeu du morpion ***");
        System.out.println("Pour gagner le jeu il faut aligner 3 cases");

        //creer plateau
        Plateau plateau = new Plateau();

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

            for (int i=0;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+joueur1.getJoueur()+" ("+nomJoueur1+") joue :");
                    Plateau.afficherPlateau();
                    int saLigne = joueur1.choisiCaseLigne();
                    int saColonne = joueur1.choisiCaseColonne();
                    Plateau.placerSymbole(joueur1.getJoueur(), saLigne, saColonne);
                    regleJeu.verifieJeu(plateau, joueur1.getJoueur());

                    System.out.println("Joueur "+joueur2.getJoueur()+" ("+nomJoueur2+") joue :");
                    Plateau.afficherPlateau();
                    int saLigne2 = joueur2.choisiCaseLigne();
                    int saColonne2 = joueur2.choisiCaseColonne();
                    Plateau.placerSymbole(joueur2.getJoueur(), saLigne2, saColonne2);
                    regleJeu.verifieJeu(plateau, joueur2.getJoueur());
                }
            }
            regleJeu.stopJeu(0, null);
        }else {
            System.out.println("Après tirage au sort,");
            System.out.println(nomJoueur2+" est le premier joueur à jouer ");

            for (int i=0;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+nomJoueur2+" ("+joueur2.getJoueur()+") joue :");
                    Plateau.afficherPlateau();
                    int saLigne2 = joueur2.choisiCaseLigne();
                    int saColonne2 = joueur2.choisiCaseColonne();
                    Plateau.placerSymbole(joueur2.getJoueur(), saLigne2, saColonne2);
                    regleJeu.verifieJeu(plateau, joueur2.getJoueur());

                    System.out.println("Joueur "+nomJoueur1+" ("+joueur1.getJoueur()+") joue :");
                    Plateau.afficherPlateau();
                    int saLigne = joueur1.choisiCaseLigne();
                    int saColonne = joueur1.choisiCaseColonne();
                    Plateau.placerSymbole(joueur1.getJoueur(), saLigne, saColonne);
                    regleJeu.verifieJeu(plateau, joueur1.getJoueur());
                }
            }
            regleJeu.stopJeu(0, null);
        }
    }
}
