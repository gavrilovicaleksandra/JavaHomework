package domaci_3008_Sumadija;

public class Suma extends Parcela {

	private double prinosStabla;
	private double povrsinaStabla;
	private int sazrevanje;

	public Suma(double povrsina, double prinosStabla, double povrsinaStabla, int sazrevanje) {
		super(povrsina);
		this.prinosStabla = prinosStabla;
		this.sazrevanje = sazrevanje;
		this.povrsinaStabla = povrsinaStabla;//provera da li je veca od povrsine parcele jer bi to bilo nelogicno
	}

	@Override
	public char getOznaka() {
		return 'S';
	}

	@Override
	public String toString() {
		return super.toString()+": "+povrsinaStabla+","+prinosStabla+","+sazrevanje;
				
	}

	@Override
	public double Prinos() {
		return getPovrsina() / povrsinaStabla * prinosStabla * sazrevanje;
	}

}
