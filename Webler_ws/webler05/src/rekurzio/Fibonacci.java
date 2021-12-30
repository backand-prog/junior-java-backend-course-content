package rekurzio;

public class Fibonacci {

	public static void main(String[] args) {
		//Fibonacci: az aktuális elem a 3. elemtõl számítva az elõzõ két elem összege
		//1 1 2 3 5 8 13 21 34 55
		//paraméternek kapja meg, hogy hány elemet jelenítsen meg
		
		System.out.println("Ciklussal: " + fiboCiklussalSzamol(8));
		System.out.println("Rekurzív: " + fiboRekurzivSzamol(30));
	
	}
	
	static int fiboCiklussalSzamol(int n) {
		if (n==1) return 1;
		if (n==2) return 1;
		
		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		
		for (int i = 3; i <= n; i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			
		}
		
		return f3;
		
	}
	
	static int fiboRekurzivSzamol(int n) {
		if (n <= 2) return 1;
		else return fiboRekurzivSzamol(n-1)+fiboRekurzivSzamol(n-2);
		
	}

}
