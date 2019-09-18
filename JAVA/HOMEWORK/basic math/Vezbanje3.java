package vezbanje;

import java.util.Scanner;

public class Vezbanje3 {

	public static void main(String[] args) {
		// Napisati program koji unosi dva cela broja, oduzima ih i razliku ispisuje na glavni izlaz
		Scanner sc=new Scanner (System.in);
		int a,b;
		System.out.println("Unesi dva broja ");
		a=sc.nextInt();
		b=sc.nextInt();
		int z=a-b;
		System.out.println("Razlika ta dva broja je "+z);
		
	}

}
