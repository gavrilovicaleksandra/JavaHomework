package vezbanje;

import java.util.Scanner;

public class Vezbanje6 {

	public static void main(String[] args) {
		// Napisati program koji trazi od korisnika da unese nadimak selektora
		// kosarkaske reprezentacije
		// Aleksandra Djordjevica.
		// Ako se odgovori Sale ili SALE, ispisati TACNO, ako se pogresi, ispisati
		// “Ispravan odgovor je Sale”

		Scanner sc = new Scanner(System.in);
		System.out.println("unesi nadimak Aleksandra Djordjevica");

		String q = sc.nextLine();

		switch (q) {
		case "SALE":
			System.out.println("TACNO");
			break;
		case "Sale":
			System.out.println("TACNO");
			break;
		default:
			System.out.println("odgovor je Sale ");break;
		}

	}

}
