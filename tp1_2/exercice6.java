package tp1_2;

import java.util.Scanner;

public class exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez le poids en kg SVP: ");
        double poids = scanner.nextDouble();

       
        System.out.print("Entrez la taille en mètres SVP: ");
        double taille = scanner.nextDouble();

       
        System.out.print("Entrez le sexe (F pour femme, H pour homme) SVP : ");
        char sexe = scanner.next().charAt(0);

       
        double imc = poids / (taille * taille);

       
        System.out.println("L'IMC est : " + imc);

      
        String etatPoids = determinerEtatPoids(imc, sexe);
        System.out.println("État de poids : " + etatPoids);

        scanner.close();
    }

    public static String determinerEtatPoids(double imc, char sexe) {
        if (sexe == 'F') {
            if (imc < 19) {
                return "Maigreur";
            } else if (imc >= 19 && imc <= 24) {
                return "Poids normal";
            } else if (imc >= 24 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        } else if (sexe == 'H') {
            if (imc < 20) {
                return "Maigreur";
            } else if (imc >= 20 && imc <= 25) {
                return "Poids normal";
            } else if (imc >= 25 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        } else {
            return "Sexe non valide";
        }
    }
}