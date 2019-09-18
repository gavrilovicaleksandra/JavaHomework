package novipaketdomaceg;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Izracunati proizvod parnih brojeva u intervalu od k do n
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi dva broja ");
		int k = sc.nextInt();
		int n = sc.nextInt();
		int p = 1;
		for (int i = k; i <= n; i++) {
			if (i % 2 == 0)
				p = p * i;
		}
		System.out.println("Proizvod svih unetih parnih brojeva od k do n je:" + p);
	}
}
