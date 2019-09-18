package domaci_2908_fakultet;

import java.util.ArrayList;
import java.util.List;

/*Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. 
 * Predmeti mogu da se dodaju i oduzimaju iz liste. 
 * Profesora ispisati u formatu: 
 * Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.
*/

public class Profesor extends Covek {
	private String titula;
	List<String> predmeti;


	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula = titula;
		predmeti = new ArrayList<>();
	}

	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean izbaciPredmet(String predmet) {
		return predmeti.remove(predmet);
	}

	public String getPredmet(int i) {
		return predmeti.get(i);
	}

	public String getPredmet(String predmet) {
		return predmeti.get(predmeti.indexOf(predmet));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getIme()).append("_").append(getPrezime()).append(" [")
				.append(getGodRodj()).append("] je ").append(titula).append(" koji drzi nastavu na: ")
				.append(predmeti);
				
		return builder.toString();
	}

	
	
	
	
}
