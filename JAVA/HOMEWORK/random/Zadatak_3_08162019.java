package novipaketdomaceg;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// koliko brojeva od k do n deljivi sa x ima
		Scanner sc = new Scanner (System.in);
		int k, n, x, i, brojac=0;
        System.out.print("Od broja ");
        k=sc.nextInt();
        System.out.print("Do broja ");
        n=sc.nextInt();
        System.out.print("Deljivih sa  ");
        x=sc.nextInt();
        i=k;
        while (i <= n ){
            if (i % x == 0 ){
                brojac = brojac + 1;
            }
            i++;
        }
        System.out.println("Brojeva koji su deljivi bez ostatka ima: "+brojac);
		
		
		
	}	
	}


