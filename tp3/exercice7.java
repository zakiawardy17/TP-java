package tp3;

import java.util.Scanner;
import java.util.Arrays;
public class exercice7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez la taille du tableau SVP : ");
        int taille = scanner.nextInt();

      
        int[] tableau = new int[taille];

       
        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }

       
        double moyenne = (double) somme / taille;

        
        System.out.println("Somme des éléments : " + somme);
        System.out.println("Moyenne des éléments : " + moyenne);

       
        int[] tableau2 = Arrays.copyOf(tableau, taille);

       
        System.out.println("Tableau copié (T2) :");
        afficherTableau(tableau2);

      
        Arrays.sort(tableau);

      
        System.out.println("Tableau trié dans l'ordre croissant :");
        afficherTableau(tableau);

        scanner.close();
    }

    
    public static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + "\t");
        }
        System.out.println();
    }
}