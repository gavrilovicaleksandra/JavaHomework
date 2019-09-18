package domaci_2808_Ucionica;

public class GlavniZaUcionicu {

	public static void main(String[] args) {
		Polaznik polaznik1 = new Polaznik("Kuki", "Nizz");
		Laptop laptop1 = new Laptop("dell", polaznik1 );
		laptop1.setPolaznik(polaznik1);
		System.out.println(polaznik1.ispisi());
		System.out.println(laptop1.ispisi());
		laptop1.resetPolaznik();
		System.out.println(laptop1.ispisi());
		Laptop laptop2 = new Laptop("lenovo", polaznik1 );
		laptop2.setPolaznik(polaznik1);
		System.out.println(laptop2.ispisi());

	}

}
