import classes.Joueur;
import classes.Plateau;
import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.Random;

public class Main {
    public static void main(String... args){
        //presentation du jeu
        System.out.println("*** Jeu du morpion ***");
        System.out.println("Pour gagner le jeu il faut qu'un des joueurs (X / O) aligne 3 cases");

        //creer plateau
        Plateau plateau = new Plateau();

        //Creer les 2 joueurs
        String nomJoueur1 = Joueur.entreNom(typeJoueur.X);
        Joueur joueur1 = new Joueur(nomJoueur1, typeJoueur.X);
        String nomJoueur2 = Joueur.entreNom(typeJoueur.O);
        Joueur joueur2 = new Joueur(nomJoueur2, typeJoueur.O);

        //lance la pièce au hasard pour savoir qui commence
        Random random = new Random();
        int quiCommence = random.nextInt(0,2);

        System.out.println("Après tirage au sort,");
        if (quiCommence == 0){
            System.out.println(nomJoueur1+" joue en premier");

            for (int i=0;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+joueur1.getJoueur()+" ("+nomJoueur1+") joue :");
                    Plateau.afficherPlateau();
                    System.out.println("Choisissez le numéro de ligne entre 1 et 3 :");
                    int saLigne = Joueur.choisiCase();
                    System.out.println("Choisissez le numéro de colonne entre 1 et 3 :");
                    int saColonne = Joueur.choisiCase();
                    Plateau.placerSymbole(joueur1.getJoueur(), saLigne, saColonne);
                    regleJeu.verifieJeu(plateau, joueur1.getJoueur());

                    System.out.println("Joueur "+joueur2.getJoueur()+" ("+nomJoueur2+") joue :");
                    Plateau.afficherPlateau();
                    System.out.println("Choisissez le numéro de ligne entre 1 et 3 :");
                    int saLigne2 = Joueur.choisiCase();
                    System.out.println("Choisissez le numéro de colonne entre 1 et 3 :");
                    int saColonne2 = Joueur.choisiCase();
                    Plateau.placerSymbole(joueur2.getJoueur(), saLigne2, saColonne2);
                    regleJeu.verifieJeu(plateau, joueur2.getJoueur());
                }
            }
        }else {
            System.out.println(nomJoueur2+" joue en premier ");

            for (int i=0;i<5;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur "+nomJoueur2+" ("+joueur2.getJoueur()+") joue :");
                    Plateau.afficherPlateau();
                    System.out.println("Choisissez le numéro de ligne entre 1 et 3 :");
                    int saLigne2 = Joueur.choisiCase();
                    System.out.println("Choisissez le numéro de colonne entre 1 et 3 :");
                    int saColonne2 = Joueur.choisiCase();
                    Plateau.placerSymbole(joueur2.getJoueur(), saLigne2, saColonne2);
                    regleJeu.verifieJeu(plateau, joueur2.getJoueur());

                    System.out.println("Joueur "+nomJoueur1+" ("+joueur1.getJoueur()+") joue :");
                    Plateau.afficherPlateau();
                    System.out.println("Choisissez le numéro de ligne entre 1 et 3 :");
                    int saLigne = Joueur.choisiCase();
                    System.out.println("Choisissez le numéro de colonne entre 1 et 3 :");
                    int saColonne = Joueur.choisiCase();
                    Plateau.placerSymbole(joueur1.getJoueur(), saLigne, saColonne);
                    regleJeu.verifieJeu(plateau, joueur1.getJoueur());
                }
            }
        }
        regleJeu.stopJeu(0, null);
    }
}
