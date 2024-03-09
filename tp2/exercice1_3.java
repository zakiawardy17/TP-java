package tp2;
import java.util.Scanner;
public class exercice1_3 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Entrez le nombre N SVP : ");
		        int N = scanner.nextInt();

		        int somme = 0;
		        int produit = 1;

		        System.out.println("Entrez " + N + " nombres entiers SVP : ");
		        for (int i = 0; i < N; i++) {
		            int nombre = scanner.nextInt();
		            somme += nombre;
		            produit *= nombre;
		        }

		        double moyenne = (double) somme / N;

		        System.out.println("Somme : " + somme);
		        System.out.println("Produit : " + produit);
		        System.out.println("Moyenne : " + moyenne);
}
}