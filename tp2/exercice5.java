package tp2;
import java.util.Scanner;

public class exercice5 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez un entier SVP: ");
	        int n = scanner.nextInt();

	       
	        int factorielWhile = calculerFactorielWhile(n);

	        
	        System.out.println("n! avec une boucle while : " + factorielWhile);

	      
	        int factorielFor = calculerFactorielFor(n);

	       
	        System.out.println("n! avec une boucle for : " + factorielFor);

	        scanner.close();
	    }

	  
	    public static int calculerFactorielWhile(int n) {
	        int resultat = 1;
	        int i = 1;
	        while (i <= n) {
	            resultat *= i;
	            i++;
	        }
	        return resultat;
	    }

	   
	    public static int calculerFactorielFor(int n) {
	        int resultat = 1;
	        for (int i = 1; i <= n; i++) {
	            resultat *= i;
	        }
	        return resultat;
	    }
	}
	