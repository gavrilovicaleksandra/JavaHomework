package domaci;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		//Unosi se neka vrednost u a
		a=sc.nextInt();
		switch(a){
	      case 1://neke komande
	      System.out.println(a+5);
	      break;
	      case 2:System.out.println(a+6);
	      break;
	      case 3:
	      System.out.println(a+7);
	      break; 
	}
		
 }   
		

	}


