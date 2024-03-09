package tp3;

import java.util.Scanner;

public class exercice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int taille;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();
        } while (taille < 10 || taille > 50);

      
        int[] tableau = new int[taille];

        
        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

       
        System.out.println("Tableau initial :");
        afficherTableau(tableau);

    
        int indexDestination = 0;
        for (int indexSource = 0; indexSource < taille; indexSource++) {
            if (tableau[indexSource] != 5) {
                tableau[indexDestination] = tableau[indexSource];
                indexDestination++;
            }
        }

       
        taille = indexDestination;

        
        System.out.println("Tableau après suppression des occurrences de 5 :");
        afficherTableau(tableau, taille);

        scanner.close();
    }

    
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + " : " + tableau[i]);
        }
    }

   
    public static void afficherTableau(int[] tableau, int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.println("Index " + i + " : " + tableau[i]);
        }
    }
}