package domaci_2908_fakultet;

public class Covek {
	/*
	 * Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
	 * i postave, dok godina rodjenja moze samo da se dohvati. Coveka ispisati u
	 * formatu: Ime_Prezime[godina rodjenja].
	 */

	private String ime; // get set
	private String prezime; // get set
	private int godRodj; // get

	public Covek(String ime, String prezime, int godRodj) {

		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodRodj() {
		return godRodj;
	}

	@Override //
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Ime_Prezime[godina rodjenja].
		sb.append(ime).append("_").append(prezime).append("[").append(godRodj).append("]");
		return sb.toString();

	}

}
