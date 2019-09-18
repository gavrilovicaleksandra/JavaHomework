package vezbanje;

import java.util.Scanner;

public class Vezbanje4 {
	public static void main(String[] args) {
		// izmenjen zadatak bez char
			
		Scanner sc = new Scanner(System.in);
		System.out.println("odaberi sabiranje oduzimanje deljenje ili mnozenje");
		String m;
		m = sc.nextLine();
		switch (m) {
		case "s":
			System.out.println("unesi");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
			break;

		case "o":
			System.out.println("unesi");
			int x = sc.nextInt();
			int z = sc.nextInt();
			System.out.println(x - z);
			break;

		case "m":
			System.out.println("unesi");
			int c = sc.nextInt();
			int d = sc.nextInt();
			System.out.println(c * d);
			break;
			
		case "d":
			System.out.println("unesi");
			int f = sc.nextInt();
			int g = sc.nextInt();
			System.out.println(f / g);
			break;
		}

	}

}
