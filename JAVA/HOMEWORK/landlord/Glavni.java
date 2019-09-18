package domaci_3008_Sumadija;

public class Glavni {

	public static void main(String[] args) {

		//
		
		
		Suma s1 = new Suma(100, 3, 22, 1);
		Suma s2 = new Suma(100, 4, 21, 2);
		Suma s3 = new Suma(100, 5, 25, 1);

		Njiva n1 = new Njiva(24, 23);
		Njiva n2 = new Njiva(24, 20);
		Njiva n3 = new Njiva(24, 12);

		Parcela[] sume = { s1, s2, s3 };
		for (int i = 0; i < sume.length; i++) {
			System.out.println(sume[i]);
		}

		Parcela[] njive = { n1, n2, n3 };
		for (int i = 0; i < njive.length; i++) {
			System.out.println(njive[i]);

		}
	}

}