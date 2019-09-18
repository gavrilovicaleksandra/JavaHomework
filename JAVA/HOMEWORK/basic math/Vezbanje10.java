package vezbanje;

import java.util.Scanner;

public class Vezbanje10 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava iznos podignutog kredita i procenat kamatne stope. 
		 * Program treba da ispise kolicinu novca koju je potrebno vratiti banci. 
		 * Kolicina novca potrebna za vracanje se racuna po formuli 
		 * kNovca=iznos*(1+0.01*kamata).
		 */
		Scanner sc=new Scanner (System.in);
		System.out.print("Unesi iznos kredita ");
		double iznos=sc.nextDouble();
		System.out.print("Unesi %kamatne stope ");
		double kamata=sc.nextDouble();
		System.out.println("Kolicina novca koju treba vratiti ");
		System.out.println(iznos*(1+0.1*kamata));
	}

}
