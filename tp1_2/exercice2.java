package tp1_2;

import java.util.Scanner;
public class exercice2 {
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Entrez l'heure SVP: ");
	        int heure = sc.nextInt();
	        System.out.print("Entrez les minutes SVP: ");
	        int minutes = sc.nextInt();
	        int nouvelleHeure = (heure + (minutes + 1) / 60) % 24;
	        int nouvellesMinutes = (minutes + 1) % 60;
	        System.out.println("Dans une minute, il sera " + nouvelleHeure + " heure(s) et " + nouvellesMinutes + " minute(s).");
	 }
		 
	 }