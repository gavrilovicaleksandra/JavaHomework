package vezbanje2;

import java.util.Scanner;

public class Vezbanje01 {

	public static void main(String[] args) {
		// Program koji ispisuje koliko ocfara ima uneti broj
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi neki broj");
		int n = sc.nextInt();
		int br = 0;
		while (n != 0) {
			int c = n % 10;
			n = n / 10;
			br++;
		}
		System.out.println("Uneti broj ima "+br+ " cifara");
	}

}
