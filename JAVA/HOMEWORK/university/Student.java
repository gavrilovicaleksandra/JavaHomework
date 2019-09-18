package domaci_2908_fakultet;

/*
 * Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
 * studija i trenutni prosek. Sva polja mogu samo da se dohvate. Studenta
 * ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god studija)
 * godine studija sa prosekom____ (trenutni prosek).
 */

public class Student extends Covek {

	private String brIndexa; // get
	private int godStudija; // get
	private double prosek; // get

	public Student(String ime, String prezime, int godRodj, String brIndexa, int godStudija, double prosek) {
		super(ime, prezime, godRodj);
		this.brIndexa = brIndexa;
		this.godStudija = godStudija;
		this.prosek = prosek;

	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getProsek() {
		return prosek;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		// Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa
		// prosekom____ (trenutni prosek).
		builder.append(getIme()).append("_").append(getPrezime()).append(" [").append(getGodRodj()).append("]")
				.append(" je student ").append(getGodStudija()).append(" god studija sa prosekom ").append(getProsek());
		return builder.toString();
	}

}
