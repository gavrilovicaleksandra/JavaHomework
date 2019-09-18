package domaci_2808_Ucionica;

public class Laptop {
	/*
	 * Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka
	 * moze samo da se dohvati. Laptop takodje moze da menja polaznika ili da ostane
	 * bez polaznika. Moze da se ispise u obliku: MARKA{POLAZNIK}
	 */

	private String marka;
	private Polaznik polaznik;

	public Laptop(String marka, Polaznik polaznik) {
		this.marka = marka;
		polaznik = null;
	}

	public String setMarka() {
		return marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}

	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}

	public void resetPolaznik() {
		polaznik = null;
	}

	public String ispisi() {
		String s;
		if (polaznik == null) {
			s = "NEMA POLAZNIKA";
		} else {
			s = polaznik.ispisi();
		}
		return marka + "{" + s + "}";
	}

}
