package tp1;

import java.util.Scanner;

public class exercice2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrer le rayon du cercle SVP:");
        double r =scanner.nextFloat();
        double s =Math.PI*r*r;
        double p =Math.PI*2*r;
      System.out.println("la surface est:"+s);
      System.out.println("le perimetre est:"+p);
}
    
}
