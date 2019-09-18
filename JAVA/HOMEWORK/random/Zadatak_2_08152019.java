package novipaketdomaceg;

import java.util.Scanner;

public class Zadatak_2_08152019 {
	public static void main(String[] args) {
		// fibronacijev niz
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi neki broj");
		int n = sc.nextInt();
		int j = 1;
		int i = 0;
		while (j < n && i < n) {
			
			System.out.print(i + " ");
			i += j;
			
			System.out.print(j + " ");
			j += i;
		}

	}
}