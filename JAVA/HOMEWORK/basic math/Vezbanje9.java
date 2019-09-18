package vezbanje;

import java.util.Scanner;

public class Vezbanje9 {

	public static void main(String[] args) {
		// 9. Napisati program koji unosi mesec u godini.
		// Program ispisuje kom godisnjem dobu mesec pripada.
		// Program napisati koristeci switch

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi mesec:");

		String s = sc.nextLine();
		switch (s) {
		case "decembar":
		case "januar":
		case "februar":
		case "mart ":
			System.out.println("Zima");
			break;
		
		case "mart":
		case "april":
		case "maj":
			System.out.println("Prolece");
			break;
		case "jun":
		case "jul":
		case "avgust":
			System.out.println("Leto");
			break;
		case "septembar":
		case "oktobar":
		case "Novembar":
			System.out.println("Jesen");
			break;
		default:
			System.out.println("To nije mesec");
		}

	}

}
