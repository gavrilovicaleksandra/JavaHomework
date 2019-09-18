package domaciZaNizove;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// ucitava: duzinu niza, niz. proverava da li je niz rastuci

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi n za duzinu niza ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Unesi elemente u niz ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("element " + i + ": ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[++i]) {
				System.out.println("jeste");
			} else {
				System.out.println("nije");
			
		}

	}

}}