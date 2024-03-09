package tp1_2;

import java.util.Scanner;
public class exercice4 {
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Entrez le premier entier  SVP: ");
	        int n = sc.nextInt();
	        System.out.print("Entrez le deuxième entier SVP: ");
	        int m = sc.nextInt();
	        if (sontNombresAmis(n, m)) {
	            System.out.println(n + " et " + m + " sont des nombres amis.");
	        } else {
	            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
	        }

	    }

	    public static boolean sontNombresAmis(int n, int m) {
	      
	        int sommeDiviseursN = sommeDiviseurs(n);
	        int sommeDiviseursM = sommeDiviseurs(m);

	        
	        return sommeDiviseursN == m && sommeDiviseursM == n;
	    }

	    public static int sommeDiviseurs(int nombre) {
	        int somme = 0;
	      
	        for (int i = 2; i <= nombre / 2; i++) {
	            if (nombre % i == 0) {
	                somme += i; 
	            }
	        }
	        return somme;
}
}