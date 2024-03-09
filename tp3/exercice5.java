package tp3;

import java.util.Scanner;

public class exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau SVP : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Entrez les valeurs du tableau SVP:");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println("Tableau initial :");
        afficherTableau(tableau);
        for (int i = 0; i < taille / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[taille - 1 - i];
            tableau[taille - 1 - i] = temp;
        }

        System.out.println("Tableau inversé :");
        afficherTableau(tableau);

    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + " : " + tableau[i]);
        }
    }
}