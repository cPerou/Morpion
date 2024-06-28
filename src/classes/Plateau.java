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

    public static int[] convertirCaseEnCoordonnees(int numeroCase) {
        // Vérifier la validité du numéro de case
        if (numeroCase < 1 || numeroCase > 9) {
            throw new IllegalArgumentException("Numéro de case invalide : " + numeroCase);
        }

        // Calculer la ligne et la colonne
        int ligne = (numeroCase - 1) / 3;
        int colonne = (numeroCase - 1) % 3;

        return new int[]{ligne, colonne};
    }

    public static void placerSymbole(typeJoueur leJoueur, int ligne, int colonne) {
        if (ligne >= 0 && ligne < 3 && colonne >= 0 && colonne < 3 && grille[ligne][colonne] == null) {
            grille[ligne][colonne] = leJoueur;
        } else {
            System.out.println("Case déjà jouée ou hors plateau, rejouer !");
        }
    }
}
