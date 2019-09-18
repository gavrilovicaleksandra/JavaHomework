package domaci_3008_Sumadija;

public abstract class Parcela {
	/*
	 * Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu
	 * povrsinu(u kvadratnim metrima) prilikom kreiranja. Mogu da joj se dohvate
	 * sadrzani podaci, kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
	 * u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u obliku
	 * VRSTA-ID[POVRSINA].
	 */
	private static int jidentifikator = 0;
	private double povrsina; // get
	private int id; // get

	public Parcela(double povrsina) {
		super();
		this.povrsina = povrsina;
		id = ++jidentifikator;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public int getId() {
		return id;
	}

	public abstract char getOznaka();

	public abstract double Prinos(); //

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getOznaka()).append(getId()).append(" Povrsina=[")
				.append(getPovrsina()).append("]");
		return builder.toString();
	}

	

}