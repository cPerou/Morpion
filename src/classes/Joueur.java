package classes;

import enumeration.typeJoueur;
import interfaces.regleJeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur implements regleJeu {
    private String nom;
    private typeJoueur joueur;
    //constructeur
    public Joueur(String nom, typeJoueur joueur) {
        this.nom = nom;
        this.joueur = joueur;
    }

    //getter et setter
    public typeJoueur getJoueur() {return joueur;}
    public String getNom() {return nom;}

    //methode

    //les 2 joueurs entrent leurs noms
    public static String entreNom(typeJoueur typeJoueur){
        System.out.println("Entre le nom du joueur "+typeJoueur+" :");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        return nom;
    }

    //le joueur choisi sa case
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
        System.out.println("Le tour est joué"+"\n");
    }
}