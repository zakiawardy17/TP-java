package tp1;

import java.util.Scanner;
public class exercice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("donnet un entier SVP:");
	       int n =scanner.nextInt();
	       int fact=1;
	       for (int i=1;i<=n;i++){
	           fact=fact*i;
	       }
	       System.out.println("le factorielle est:"+fact);
	 
	        }
}