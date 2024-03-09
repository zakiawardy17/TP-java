package tp1_2;

import java.util.Scanner;
public class exercice3 {
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Entrez un entier positif supérieur à 1 SVP: ");
	        int n = sc.nextInt();
	        if (estParfait(n)) {
	            System.out.println(n + " est un nombre parfait.");
	        } else {
	            System.out.println(n + " n'est pas un nombre parfait.");
	        }
	        sc.close();
	    }
	    public static boolean estParfait(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        int sommeDiviseurs = 0;
	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) {
	                sommeDiviseurs += i;
	            }
	        }
	        return sommeDiviseurs == n;
}
	 }