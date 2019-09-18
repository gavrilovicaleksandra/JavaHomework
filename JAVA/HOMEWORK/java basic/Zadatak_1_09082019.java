package domaci;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		/*Napisati program koji proverava 
		 * da li je uneti broj paran ili neparan. 
		 * Ukoliko jeste, program treba da ispise poruku: 
		 * Broj je paran! 
		 * Ukoliko nije, program treba da ispise poruku: 
		 * Broj je neparan!
		 */
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Unesi neki celi broj  ");
		a=sc.nextInt();
		if  (a%2==0) {
			System.out.println("Broj je paran");}
		else if (a%2!=0) {
			System.out.println("Broj je neparan");}
		System.out.println("kraj");
			
	}	
	}
