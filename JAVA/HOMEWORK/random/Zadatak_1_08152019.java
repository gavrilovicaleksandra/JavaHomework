package novipaketdomaceg;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		// meni povrsina kocke, kvadra, valjka i lopte nula za izlaz
		Scanner sc = new Scanner(System.in);
		int q;
		do {
			System.out.println("Izaberi broj za zeljeno geometrijsko telo:");
			System.out.println("1 - lopta");
			System.out.println("2 - valjak");
			System.out.println("3 - kvadar");
			System.out.println("4 - kocka");
			System.out.println("0 - Izlaz");
			
			q = sc.nextInt();
			double a, b,r,c,h;
			switch (q) {
			case 1:
				System.out.print("Ucitaj poluprecnik ");
				r = sc.nextDouble();
				if (r>0) {
					System.out.println("Povrsina je " +(4*r * r * 3.14));
				}else{
					System.out.println("Poluprecnik ne moze biti manji ili jednak nuli");}break;
			case 2:
				System.out.print("Ucitaj poluprecnik ");
				r=sc.nextDouble();
				System.out.print("Ucitaj visinu valjka ");
				h=sc.nextDouble();
				if(r>0 && h>0) {
					System.out.println("Povrsina je "+ ((2*r*r*3.14)+(2*r*3.14*h)));
				}else{
					System.out.println("Unete vrednosti ne mogu biti manje ili jednake nuli");}break;		
								
			case 3:
				System.out.print("Ucitaj stranicu a ");
				a=sc.nextDouble();
				System.out.print("Ucitaj stranicu b ");
				b=sc.nextDouble();
				System.out.print("Ucitaj stranicu c ");
				c=sc.nextDouble();
				if(a>0 && b>0 && c>0) {
					System.out.println("Povrsina je " +(2*(a*b + a*c + b*c)));
				}else{
					System.out.println("Stranica ne moze biti manja ili jednaka nuli");}break;
			case 4:
				System.out.print("Ucitaj stranicu ");
				a=sc.nextDouble();
				if(a>0) {
					System.out.println("Povrsina je " +(6*(a*a)));
				}else{
					System.out.println("Stranica ne moze biti manja ili jednaka nuli");}break;
			case 0:
				System.out.println("EXIT");break;	}
		} while (q != 0);
	}
}

	