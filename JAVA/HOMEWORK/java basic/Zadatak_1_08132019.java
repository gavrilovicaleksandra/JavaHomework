package domaci;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		/*Napisati 8 primera za post inkrementu (i++), 
		 * pre inkrementu (++i), 
		 * post dekrementu (i--) i 
		 * pre dekrementu (--i) i 
		 * u programu u komentarima 
		 * opisati kako koji primer funkcionise. 
		 * Napisati po 2 primera o svakom
		 */
		int a=2,b=4,c=7;
		b=++b;//preinkrement prvo uvecava za 1 vrednost b pa tu vrednost dodeljuje b
		System.out.println("prvo "+a+" "+b+" "+c);
		c=++b; //preinkramnet b vise nije 4 vec je 5 zbog prethodne linije, pa se na to 5 dodaje 1 tako da ce c biti 6
		System.out.println("drugo "+a+" "+b+" "+c);
		a=c++; 
		/*postinkrement prvo dodeljuje vrednost 
		*pa onda uvecava sto znaci da ce a imati staru vrednost c dok ce c dobiti novu vrednost za 1vecu*/
		System.out.println("trece "+a+" "+b+" "+c);
		c=++c; //postinkremnet: a i b se ne menjanju, a c ce dobiti vrednost vecu za 1 u odnosu na prethodnu liniju
		System.out.println("cetvrto "+a+" "+b+" "+c);
		b=--b;//predekrement prvo smanji vrednost za 1 pa tu novu vrednost dodeli b
		System.out.println("peto "+a+" "+b+" "+c);
		a=--b + c--; // kombinacija:prvo se smanji vrednost b i pa se od toga oduzme stara vrednost c, ali se u c upisuje nova umanjena vrednost
		System.out.println("sesto "+a+" "+b+" "+c);
		c=b--;//postdekramnet umanji vrednost b ali ce c dobiti staru vrednost b (pre umanjenja)
		System.out.println("sedmo "+a+" "+b+" "+c);
		c=a--+b--; //postdekrmanet c ce biti zbir starih vrednosti a+b, dok ce i a i b dobiti nove umanjene vrednosti
		System.out.println("osmo "+a+" "+b+" "+c);
		
	}

}
