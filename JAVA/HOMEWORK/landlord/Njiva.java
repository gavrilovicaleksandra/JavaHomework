package domaci_3008_Sumadija;

public class Njiva extends Parcela {
	private double prinos;

	public Njiva(double povrsina, double prinos) {
		super(povrsina);
		this.prinos = prinos;

	}

	@Override
	public char getOznaka() {
		return 'N';
	}

	@Override
	public double Prinos() {
		return getPovrsina() * prinos;
	}

	@Override
	public String toString() {//sluzi za ispis objekta
		return super.toString() + ":" + prinos;//drugi naci za resasvanje
	}

}
