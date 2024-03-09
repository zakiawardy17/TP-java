package tp1;

import java.util.Scanner;
public class exercice6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" donner les valeurs a et b de votre equation SVP:");
	       float a =scanner.nextFloat();
	       float b =scanner.nextFloat();
	        if(a==0){
	            System.out.println("il n'y a pas de solutions");
	        }
	       System.out.println("la solution est:"+(-b)/a);
}
}
