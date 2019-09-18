package vezbanje2;

import java.util.Scanner;

public class Vezbanje02 {

	public static void main(String[] args) {
		// ispisuje k-ti stepen broja n
		System.out.println("***Stepenovanje broja n brojem k***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi neki broj n ");
		int n = sc.nextInt();
		System.out.print("Unesi stepen k ");
		int k = sc.nextInt();
		int p = 1;
		if (k > 0) {
			while (k != 0) {
				p = p * n;
				k--;
			}
			System.out.println("Rezultat je "+p);
		} else if (k < 0) {
			while (k != 0) {
				p = p * n;
				k++;
			}
			System.out.println("Rezultat je 1/"+p);
		}else System.out.println("Rezultat je "+p);

	
	}
}
