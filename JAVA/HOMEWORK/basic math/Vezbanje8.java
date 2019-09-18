package vezbanje;

import java.util.Scanner;

public class Vezbanje8 {

	public static void main(String[] args) {
		// Napisati program koji ce za navedene pojmove napisati
		// da li je u pitanju voce ili povrce (sami zadajete primere).
		// Program napisati koristeci switch

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi voce ili povrce ");
		String a = sc.nextLine();
		switch (a) {
		case "jabuka":
		case "kruska":
		case "breskva":
		case "kajsija":
		case "grozdje":
		case "jagoda":
		case "borovnica":
			System.out.println("voce");
			break;
		case "paprika":
		case "krompir":
		case "kupus":
		case "sargarepa":
		case "luk":
		case "krastavac":
			System.out.println("povrce");
			break;
		default:
			System.out.println("nije na spisku");
			break;

		}

	}

}
