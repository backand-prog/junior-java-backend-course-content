package rekurzio;

public class Fibonacci {

	public static void main(String[] args) {
		//Fibonacci: az aktu�lis elem a 3. elemt�l sz�m�tva az el�z� k�t elem �sszege
		//1 1 2 3 5 8 13 21 34 55
		//param�ternek kapja meg, hogy h�ny elemet jelen�tsen meg
		
		System.out.println("Ciklussal: " + fiboCiklussalSzamol(8));
		System.out.println("Rekurz�v: " + fiboRekurzivSzamol(30));
	
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
