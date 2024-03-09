package tp2;
import java.util.Scanner;

public class exercice3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de N SVP : ");
        int N = scanner.nextInt();

        
        if (N <= 0) {
            System.out.println("N doit être un entier positif.");
        } else {
           
            double somme = calculerSerieHarmonique(N);

           
            System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);
        }

        scanner.close();
    }

    public static double calculerSerieHarmonique(int N) {
        double somme = 0.0;
        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }
        return somme;

}	
	}
