import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;

import java.util.ArrayList;
import java.util.Random;

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

        //choisi la case au hasard entre 1 et 9
        Random random = new Random();
        int nombreAJouer = random.nextInt(1,10);

        //Marc joue sur la case - 1 (pour l'itération)
        //marc.joue(listeCase.get(nombreAJouer-1), "Marc");

        //test si case 0, 1, 2 prise par rond termine bien le jeu
        marc.joue(listeCase.get(0), typeJoueur.ROND, listeCase);
        marc.joue(listeCase.get(1), typeJoueur.ROND, listeCase);
        marc.joue(listeCase.get(2), typeJoueur.ROND, listeCase);
    }
}
