import classes.Case;
import classes.Joueur;
import enumeration.typeJoueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String... args){
        //liste des cases
        ArrayList<Case> listeCaseTot = new ArrayList<>();
        for (int i=1;i<10;i++)
            listeCaseTot.add(new Case(i, null));

        //creation 2 joueurs
        Joueur marc = new Joueur(true, typeJoueur.CROIX);
        Joueur lucas = new Joueur(false, typeJoueur.ROND);

        //choisi la case au hasard entre 1 et 9
        Random random = new Random();
        int nombreAJouer = random.nextInt(1,10);

        //Marc joue sur la case - 1 (pour l'itération)
        marc.joue(listeCaseTot.get(nombreAJouer-1), "Marc");

        // Parcourir la liste des cases
        for (Case uneCase : listeCaseTot) {
            // Afficher si la case est jouée + quel joueur + numero case
            if (uneCase.getQuelJoueur()!=null) {
                System.out.println("La case "+ uneCase.getPosition() +" est jouée par "+ uneCase.getQuelJoueur());
            } else {
                System.out.println("La case n'est pas encore jouée");
            }
        }
    }
}
