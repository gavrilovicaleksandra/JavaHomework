package domaci;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
//b) Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko konzole). Program treba da ispise zbir.
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesi neki broj ");
		int n=sc.nextInt();
		int br=1;
		int sum=0;
			while (br<=n) {
				sum=sum+br;
				br++;
			}
			System.out.println("suma brojeva od 1 do unetog je " +sum);

	}
}
