package rekurzio;

public class Faktorialis {

	public static void main(String[] args) {
		/*
		 * Rekurzi�: �nmag�t megh�v� met�dus
		 * T�m�rebb lesz a k�d �s jobban �tl�that�
		 * N�h�ny sorban meg lehet oldani a probl�m�t, eleg�ns megold�s
		 * Minden rekurz�v algoritmus megoldhat� ciklussal
		 * 
		 */
		
		System.out.println("Faktori�lis ciklussal: " + faktorialisCikussalSzamol(5));
		System.out.println("Faktori�lis rekurz�v m�don: " + faktRekurzivSzamol(5));
		
		
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
