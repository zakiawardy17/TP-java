package tp3;

import java.util.Scanner;

public class exercice8 {

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

        
        int plusGrandEcart = calculerPlusGrandEcart(tableau);

      
        System.out.println("Plus grand écart dans le tableau : " + plusGrandEcart);

        scanner.close();
    }

    
    public static int calculerPlusGrandEcart(int[] tableau) {
        int plusGrandEcart = 0;

        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int ecart = Math.abs(tableau[i] - tableau[j]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
        }

        return plusGrandEcart;
    }
}