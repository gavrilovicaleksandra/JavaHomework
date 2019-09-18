package domaci_2808_Ucionica;

public class Polaznik {
	/*
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	 * u obliku: IME_PREZIME{ID}.
	 */

	private static int UID = 0;

	private int id;
	private String ime;
	private String prezime;

	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		id = ++UID;
	}

	public String setIme() {
		return ime;
	}

	public String setPrezime() {
		return prezime;
	}

	public int getID() {
		return id;
	}

	public String ispisi() {
		return ime + "_" + prezime + " {" + id + "}";
	}

}
