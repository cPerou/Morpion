package classes;

import enumeration.typeJoueur;
import interfaces.regleJeu;

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
    public static int choisiCase(){
        Scanner scanner = new Scanner(System.in);
        int saCase = scanner.nextInt();
        return saCase-1;
    }
}