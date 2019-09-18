package vezbanje;

import java.util.Scanner;

public class Vezbanje2 {

	public static void main(String[] args) {
		/* Napisati program koji sabira dva broja 
		 * i zbir ispisuje na glavni izlaz. 
		 * Potrebno je da program sadrzi i bar 
		 * jedan viselinijski komentar.
		 */
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Unesi dva broja");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Zbir ta dva broja je "+(a+b));
	}

}
