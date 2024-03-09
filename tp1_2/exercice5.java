package tp1_2;

import java.util.Scanner;

public class exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] butsParJoueur = new int[22]; 

       
        for (int i = 0; i < butsParJoueur.length; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " SVP: ");
            butsParJoueur[i] = scanner.nextInt();
        }

        
        afficherButeur(butsParJoueur);

        
        int totalButs = calculerTotalButs(butsParJoueur);
        System.out.println("Le nombre total de buts inscrits par cette équipe est : " + totalButs);

       
        int joueursSansBut = compterJoueursSansBut(butsParJoueur);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansBut);

       
        butsParJoueur[8] += 2;
        System.out.println("Les buts du joueur n°9 ont été mis à jour.");

        scanner.close();
    }

    public static void afficherButeur(int[] butsParJoueur) {
        int maxButs = 0;
        int numeroButeur = 0;
        for (int i = 0; i < butsParJoueur.length; i++) {
            if (butsParJoueur[i] > maxButs) {
                maxButs = butsParJoueur[i];
                numeroButeur = i + 1;
            }
        }
        System.out.println("Le buteur de l'équipe est le joueur n°" + numeroButeur + " avec " + maxButs + " buts.");
    }

    public static int calculerTotalButs(int[] butsParJoueur) {
        int total = 0;
        for (int buts : butsParJoueur) {
            total += buts;
        }
        return total;
    }

    public static int compterJoueursSansBut(int[] butsParJoueur) {
        int joueursSansBut = 0;
        for (int buts : butsParJoueur) {
            if (buts == 0) {
                joueursSansBut++;
            }
        }
        return joueursSansBut;
    }
}