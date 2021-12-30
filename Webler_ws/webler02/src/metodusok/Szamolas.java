package metodusok;

public class Szamolas {

	public static void main(String[] args) {
		
		//metódus hívás - method call
		System.out.println("Kerület: " + teglalapKeruletSzamol(3, 5));
		System.out.println(negyzetOsszegSzamol(4.5, 6.8));
		hatvanySzamolEsKiir(2, 8);
		System.out.println(gyokSzamol(25));
		
	}
	
	//metodus deklaráció
	public static int teglalapKeruletSzamol(int a, int b) {
		
		int ker = (a + b) * 2;
		return ker;
	}
	
	public static double negyzetOsszegSzamol(double a, double b) {
		double eredmeny = Math.pow(a, 2) + Math.pow(b, 2);
		return eredmeny;
		
	}
	
	public static void hatvanySzamolEsKiir(double alap, double kitevo) {
		System.out.println(Math.pow(alap, kitevo));
	}
	
	public static double gyokSzamol(double szam) {
		return Math.sqrt(szam);
	}
	
	
	
}
