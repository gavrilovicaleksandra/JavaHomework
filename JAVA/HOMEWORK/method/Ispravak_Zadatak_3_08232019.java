package funkcije;

import java.util.Scanner;

public class Ispravak_Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama,
		// a druga vraca zbir parnih elemenata niza.

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi koliko elemenata zelis u nizu ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitavanje(niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama je " + proizvod(niz));
		System.out.println("Zbir parnih elemenata je " + zbir(niz));
	}

	public static void ucitavanje(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi element niza " + i + " ");
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvod(int[] niz) {
		int p = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 1) {
				p = p * niz[i];
			}
		}
		return p;
	}

	public static int zbir(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				sum = sum + niz[i];
			}
		}
		return sum;

	}

}
