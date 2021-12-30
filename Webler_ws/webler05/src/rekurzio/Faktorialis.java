package rekurzio;

public class Faktorialis {

	public static void main(String[] args) {
		/*
		 * Rekurzió: Önmagát meghívó metódus
		 * Tömörebb lesz a kód és jobban átlátható
		 * Néhány sorban meg lehet oldani a problémát, elegáns megoldás
		 * Minden rekurzív algoritmus megoldható ciklussal
		 * 
		 */
		
		System.out.println("Faktoriális ciklussal: " + faktorialisCikussalSzamol(5));
		System.out.println("Faktoriális rekurzív módon: " + faktRekurzivSzamol(5));
		
		
	}
	
	static long faktorialisCikussalSzamol(int n) {
		long f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}
	
	static long faktRekurzivSzamol(int n) {
		if (n==0) return 1;
		else return(faktorialisCikussalSzamol(n-1)*n);
	}
	
	

}
