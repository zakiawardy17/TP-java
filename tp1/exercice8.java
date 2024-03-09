package tp1;

import java.util.Scanner;
public class exercice8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez le premier entier SVP: ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier SVP: ");
        int b = scanner.nextInt();

        while (b != 0) {
            int temp = b;
            b = a%b;
            a =temp;
        }
        
        System.out.println("Le pgcd est: "+a);


	}

}
