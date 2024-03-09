package tp2;
import java.util.Scanner;
public class exercice2 {
	public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Entrez l'entier SVP: ");
		            int X = scanner.nextInt();

		           
		            System.out.print("Entrez la puissance SVP : ");
		            int N = scanner.nextInt();

		           
		            if (N < 0) {
		                System.out.println("La puissance ne peut pas être négative.");
		            } else {
		               
		                long resultat = calculerPuissance(X, N);

		              
		                System.out.println(X + "^" + N + " = " + resultat);
		            }

		            scanner.close();
		        }

		        public static long calculerPuissance(int X, int N) {
		            long resultat = 1;
		            for (int i = 0; i < N; i++) {
		                resultat *= X;
		            }
		            return resultat;
		        }
		    }

