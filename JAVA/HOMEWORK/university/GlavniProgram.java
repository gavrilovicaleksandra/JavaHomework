package domaci_2908_fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		// Napisati glavni program koji ce imati bar tri studenta i dva profesora.
		Student s = new Student("Aleksandra", "Gavrilovic", 1989, "446/08", 4, 8);
		System.out.println(s);
		Student s1= new Student ("Jovana", "Miljus", 1989, "447/08", 4, 9);
		System.out.println(s1);
		Student s2= new Student ("Daca", "Maca", 1989, "444/08", 3, 7);
		System.out.println(s2);
		
		Profesor p= new Profesor ("Dragan", "Simic", 1968, "docent");
		p.addPredmet("diplomatija");
		p.addPredmet("istorija diplomatskih odnosa SAD Srbija");
		System.out.println(p);
		p.izbaciPredmet("diplomatija");
		System.out.println(p);
		
		
		Profesor p1= new Profesor ("Slavisa", "Orlovic", 1974, "docent");
		p1.addPredmet("politicka sociologija");
		p1.addPredmet("savremena pol soc");
		System.out.println(p1);

	}

}
