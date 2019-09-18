package domaci;

import java.util.Scanner;

public class Zadatak_1_08122019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//program koji ce ispisati poruku “Hello World!” 10 puta. Koristiti while petlju
		System.out.print("unesi 1 za pocetak ");
		int n;
		n=sc.nextInt();	
		while (n<=10) {
			System.out.println("Hello World");
			n+=1;
	}
	}
}
