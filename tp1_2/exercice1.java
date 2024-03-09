package tp1_2;

import java.util.Scanner;
public class exercice1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrez un entier positif SVP: ");
	        int nombre = sc.nextInt();
	        if (nombre <= 0) {
	            System.out.println("Veuillez entrer un entier positif SVP:");
	            return;
	        }
	        afficherDiviseurs(nombre);
	    }
	    public static void afficherDiviseurs(int nombre) {
	        int nombreDiviseurs = 0;
	        int sommeDiviseurs = 0;
	        System.out.print("Les diviseurs de " + nombre + " sont :");
	        for (int i = 1; i <= nombre; i++) {
	            if (nombre % i == 0) {
	                System.out.print(i + " ");
	                nombreDiviseurs++;
	                sommeDiviseurs += i;
	            }
	        }
	        System.out.println("\nLe nombre de diviseurs est: " + nombreDiviseurs);
	        System.out.println("La somme des diviseurs est: " + sommeDiviseurs);

}
}