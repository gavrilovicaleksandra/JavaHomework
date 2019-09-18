package domaci;

import java.util.Scanner;

public class Zadatak_2_c_08132019 {

	public static void main(String[] args) {
		// c) Napisati program sabrati sve brojeve od k do n (k i n uneti preko
		// konzole). Program treba da ispise zbir.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi neki broj ");
		int k = sc.nextInt();
		System.out.println("Unesi sledeci broj ");
		int n = sc.nextInt();
		int sum = 0;
		while (k != n) {
			if (k <= n) {
				sum += k;
				k++;
			} else if (k >= n) {
				sum = sum + k;
				k--;
			}
			System.out.println("Suma brojeva je "+(sum+n));
		}

	}
}
