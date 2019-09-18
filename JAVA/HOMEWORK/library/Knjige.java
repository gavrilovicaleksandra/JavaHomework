package domaci_2708_Biblioteka;

public class Knjige {

	// Napisati klasu Knjige koja ima sledeca polja:
	// naziv knjige, autora, broj strana, godinu izdanja.
	// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke

	private String naziv;
	private String autor;
	private int strane;
	private int godina;

	public Knjige(String naziv, String autor, int strane) {
		this.naziv = naziv;
		this.autor = autor;
		this.strane=strane;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getAutor() {
		return autor;
	}

	public int getStrane() {
		return strane;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina=godina;
	}
}
