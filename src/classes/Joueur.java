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

    //choisi numero ligne
    public int choisiCaseLigne(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez votre ligne entre 1 et 3 : ");
        int saLigne = scanner.nextInt();
        return saLigne-1;
    }
    //choisi numero colonne
    public int choisiCaseColonne(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez votre colonne entre 1 et 3 : ");
        int saColonne = scanner.nextInt();
        return saColonne-1;
    }
}