package classes;

import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur implements regleJeu {
    private typeJoueur joueur;
    //constructeur
    public Joueur(typeJoueur joueur) {
        this.joueur = joueur;
    }
    //getter et setter
    public typeJoueur getJoueur() {return joueur;}
    //methode

    ////////gerer le choix de case par joueur dans une methode car revient tout le temps dans le script
    public int choisiCase(ArrayList listeCase){
        regleJeu.visualiseJeu(listeCase);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez votre numéro de case entre 1 et 9 : ");
        int saCase = scanner.nextInt();
        return saCase;
    }
    // le joueur joue sa case
    public void joue(Case caseAJouer, ArrayList listeCase){
        caseAJouer.setQuelJoueur(joueur);
        System.out.println("Le tour est joué");
    }
}