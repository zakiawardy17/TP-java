package tp1_2;

import java.util.Scanner;

public class exercice8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Entrez l'âge de l'habitant SVP: ");
        int age = scanner.nextInt();

       
        System.out.print("Entrez le sexe de l'habitant (M pour masculin, F pour féminin) : ");
        char sexe = scanner.next().charAt(0);

       
        boolean imposable = estImposable(age, sexe);
        
      
        if (imposable) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }

        scanner.close();
    }

    public static boolean estImposable(int age, char sexe) {
        if (sexe == 'M') {
            return age > 20;
        } else if (sexe == 'F') {
            return age >= 18 && age <= 35;
        } else {
           
            return false;
        }
    }
}