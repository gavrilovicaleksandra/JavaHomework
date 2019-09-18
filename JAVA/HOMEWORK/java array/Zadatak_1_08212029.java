package domaciZaNizove;

import java.util.Scanner;

public class Zadatak_1_08212029 {

	public static void main(String[] args) {
		// niz od n elem. unosi BR. elem koji su deljivi sa BR
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi n za duzinu niza ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Unesi broj kojim zelis da delis brojeve niza ");
		int br = sc.nextInt();

		System.out.println("Unesi elemente u niz ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("element " + i + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Brojevi koji su deljivi su: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % br == 0) {
				System.out.print(a[i] + " ");
			}

		}

	}

}
