package domaciZaNizove;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// ucitava: duzina niza, niz; ispisuje niz INVERZNIM REDOSLEDOM!

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi n za duzinu niza ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Unesi elemente u niz ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("element " + i + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Inverzno bi to izgledalo ovako: ");
		for (int i = n - 1; i >= 0; i--) //ovo je bilo u piramidi od brojeva :) samo je dodato n-1 :D

			System.out.print(a[i] + " ");

		}
	}

