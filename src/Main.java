import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        //creer les cases
        ArrayList<Case> listeCase = new ArrayList<>();
        for (int i=1;i<10;i++)
            listeCase.add(new Case(i, null));
        System.out.println(listeCase);

        //Creer les joueurs
        Joueur marc = new Joueur(typeJoueur.CROIX);
        Joueur lucas = new Joueur(typeJoueur.ROND);

        //lance la pièce au hasard pour savoir qui commence
        Random random = new Random();
        int quiCommence = random.nextInt(0,1);

        Scanner scanner = new Scanner(System.in);

        if (quiCommence == 0){
            System.out.println("Le joueur CROIX commence"+"\n");

            for (int i=1;i<10;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur marc joue");
                    int saCase = marc.choisiCase(listeCase);
                    marc.joue(listeCase.get(saCase), listeCase);
                    regleJeu.verifieJeu(listeCase, marc.getJoueur());

                    System.out.println("Joueur lucas joue");
                    int saCase2 = lucas.choisiCase(listeCase);
                    lucas.joue(listeCase.get(saCase2), listeCase);
                    regleJeu.verifieJeu(listeCase, lucas.getJoueur());
                }
            }

            System.out.println("La partie est nulle");
            regleJeu.stopJeu();
        }else {
            System.out.println("Le joueur ROND commence"+"\n");

            for (int i=1;i<10;i++){
                for (int j=1;j<2;j++){
                    System.out.println("Joueur lucas joue");
                    int saCase2 = lucas.choisiCase(listeCase);
                    lucas.joue(listeCase.get(saCase2+1), listeCase);
                    regleJeu.verifieJeu(listeCase, lucas.getJoueur());

                    System.out.println("Joueur marc joue");
                    int saCase = marc.choisiCase(listeCase);
                    marc.joue(listeCase.get(saCase+1), listeCase);
                    regleJeu.verifieJeu(listeCase, marc.getJoueur());
                }
            }

            System.out.println("La partie est nulle");
            regleJeu.stopJeu();
        }
    }
}
