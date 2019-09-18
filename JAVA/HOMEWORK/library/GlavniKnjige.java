package domaci_2708_Biblioteka;

public class GlavniKnjige {

	public static void main(String[] args) {
		// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke

		Knjige k = new Knjige("21 lekcija za 21 vek", "Juval Noa Harari", 430);
		k.setGodina(2019);
		System.out.println("Naziv: " + k.getNaziv() + " Autor: " + k.getAutor());
		System.out.println("Strana: " + k.getStrane() + " Godina: " + k.getGodina());
		System.out.println();

		Knjige k1 = new Knjige("Americki psiho", "Bret Iston Elis", 479);
		k.setGodina(2018);
		System.out.println("Naziv: " + k.getNaziv() + " Autor: " + k.getAutor());
		System.out.println("Strana: " + k.getStrane() + " Godina: " + k.getGodina());
		System.out.println();

		Knjige k2 = new Knjige("Bas kako treba", "Justejn Gorder", 230);
		k.setGodina(2019);
		System.out.println("Naziv: " + k.getNaziv() + " Autor: " + k.getAutor());
		System.out.println("Strana: " + k.getStrane() + " Godina: " + k.getGodina());

	}

}
