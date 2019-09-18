package domaci;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		/*program koji racuna sumu parnih brojeva i 
		 * proizvod neparnih brojeva od 0 do n. 
		 * Koristiti jednu petlju
		 */
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesi neki broj ");
		int n=sc.nextInt();
		int br=0;
		int sum=0;
		int pro=1;
			while (br<=n) {
				if (br%2==0) {
				sum+=br;
				br+=1;
				System.out.println("suma parnih brojeva je " +sum);
				}else  {
					pro*=br;
					br+=1;
					System.out.println("proizvod neparnih brojeva je " +pro);
					
					
					
					
				}
			}
	}
}	
