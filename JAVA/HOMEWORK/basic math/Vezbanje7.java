package vezbanje;

import java.util.Scanner;

public class Vezbanje7 {

	public static void main(String[] args) {
		// da li je broj + - ili 0
		Scanner sc=new Scanner (System.in);
		System.out.print("Unesi neki ceo broj ");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("Broj je pozitivan");
		}else if(a<0) {System.out.println("Broj je negativan");
			}else System.out.println("Broj je nula");
	}

}
