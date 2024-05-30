import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String... args){
        //liste des cases
        List<Case> lst = new ArrayList<>();
        for (int i=1;i<10;i++)
            lst.add(new Case(i, false));
        //creation 2 joueurs
        Joueur marc = new Joueur(true, typeJoueur.CROIX);
        Joueur lucas = new Joueur(false, typeJoueur.ROND);

        //choisi la case au hasard
        Random random = new Random();
        int nombre = random.nextInt();
        //joue sur la case
        marc.joue();

    }
}
