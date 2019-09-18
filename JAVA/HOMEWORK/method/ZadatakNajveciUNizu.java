package funkcije;

import java.util.Scanner;

public class ZadatakNajveciUNizu {

	public static void main(String[] args) {
		// metoda koja vraca poziciju najveceg elementa u nizu i ispise taj el

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi koliko elemenata zelis u nizu ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitavanje(niz);
		int max = vratiMax(niz);
		System.out.println("Najveci element je " + niz[max] + " na poziciji " + max);
	}

	public static void ucitavanje(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("unesi element niza " + i + " "); //
			niz[i] = sc.nextInt();

		}
	}

	public static int vratiMax(int[] niz) {
		int max = 0;
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > niz[max]) {
				max = i;
			}
		}
		return max;
	}

}
