package tp2;
import java.util.Scanner;

public class exercice6 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez un nombre SVP : ");
	        int nombre = scanner.nextInt();
	        
	        boolean estPremier = estNombrePremier(nombre);

	       
	        if (estPremier) {
	            System.out.println(nombre + " est un nombre premier.");
	        } else {
	            System.out.println(nombre + " n'est pas un nombre premier.");
	        }

	        scanner.close();
	    }

	    
	    public static boolean estNombrePremier(int nombre) {
	        if (nombre <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(nombre); i++) {
	            if (nombre % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}