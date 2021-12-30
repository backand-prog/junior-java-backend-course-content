package progTetelek;

public class Osszegzes {

	public static void main(String[] args) {
		//Összegzés tétele
		//Kiszámolja egy számsorozat elemeinek összegét
		int[] tomb = {3, 6, 9, 23};
		
		
		//kiirjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("A tömb elemeinek összege: " + tombOsszegSzamol(tomb));
		System.out.println("A tömb elemeinek összege: " + (double)tombOsszegSzamol(tomb)/tomb.length);
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		
	}
	
	public static int tombOsszegSzamol(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg += tomb[i];
		
		}
		
		return osszeg;
		
	}


}
