package vezbanje;

import java.util.Scanner;

public class Vezbanje5 {

	public static void main(String[] args) {
		// broj deljiv sa 3
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi ceo broj ");
		int a=sc.nextInt();
		if (a%3==0) {
			System.out.println("Broj je deljiv sa 3");
		}else System.out.println("Broj nije deljiv sa 3");

	}

}
