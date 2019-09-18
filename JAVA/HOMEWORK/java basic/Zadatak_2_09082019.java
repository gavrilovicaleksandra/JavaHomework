package domaci;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		/*Napisati program koji u zavisnosti od unesenog stringa 
		 * racuna povrsine 	kvadrata, kruga ili pravougaonika. 
		 * Ukoliko se unese “pravougaonik” 	nek pita korisnika za 2 stranice 
		 * i ispise povrsinu. 
		 * Ukoliko se 	unese “krug” nek pita korisnika za poluprecnik kruga 
		 * i izracuna povrsinu. U
		 * koliko se unese “kvadrat” nek pita korisnika za unos 	
		 * stranice i izracuna povrsinu kvadrata.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Odaberite: pravougaonik, krug ili kvadrat (upisati malim slovima)");
		String m;
		m=sc.nextLine();
		switch(m) {
		case "pravougaonik":
			System.out.print("Ucitaj stranicu a u cm ");
			double a=sc.nextDouble();
			System.out.print("Ucitaj stranicu b u cm ");
			double b=sc.nextDouble();
			if(a>0 && b>0) {
				System.out.println("Povrsina je "+(a*b)+" kvadratnih cm");}
				else {
					System.out.println("los unos");}break;
		case "krug":
			double r,p;
			System.out.print("ucitaj poluprecnik ");
			r = sc.nextDouble();
			if (r>0) {
			System.out.println("povrsina je " +(r * r * 3.14));} 
			else {
				System.out.println("los unos");}break;
		case "kvadrat":
			System.out.print("Ucitaj stranicu kvadrata u cm ");
			double k=sc.nextDouble();
			if(k>0) {
				System.out.println("Povrsina je "+(k*k)+" kvadratnih cm");} 
			else {
				System.out.println("los unos");}break;
		default: System.out.println("Pogresan unos.");break;
	}
	}
}
