package classes;

import enumeration.typeJoueur;

public class Plateau {
    private static typeJoueur[][] grille; // Matrice pour stocker les symboles du jeu

    public Plateau() {
        grille = new typeJoueur[3][3]; // Initialisation de la matrice 3*3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grille[i][j] = null; // Rempli la matrice avec des espaces vides
            }
        }
    }

    public static typeJoueur[][] getGrille() {
        return grille;
    }

    public static void afficherPlateau() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void placerSymbole(typeJoueur leJoueur, int ligne, int colonne) {
        if (ligne >= 0 && ligne < 3 && colonne >= 0 && colonne < 3 && grille[ligne][colonne] == null) {
            grille[ligne][colonne] = leJoueur;
        } else {
            System.out.println("Case déjà jouée ou hors plateau, rejouer !");
        }
    }
}
