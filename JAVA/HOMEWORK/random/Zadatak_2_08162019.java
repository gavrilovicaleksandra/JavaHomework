package novipaketdomaceg;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// koji broj je najmanji od tri uneta
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi neka 3 cela broja");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a<b && a<c) {
		    System.out.println("Najmanji broj je "+a);
		}else if (b<a && b<c) {
			System.out.println("Najmanji broj je "+b);
		}else System.out.println("Najmanji broj je "+c);
		
		}}
		