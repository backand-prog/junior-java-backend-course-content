package progTetelek;

public class Osszegzes {

	public static void main(String[] args) {
		//�sszegz�s t�tele
		//Kisz�molja egy sz�msorozat elemeinek �sszeg�t
		int[] tomb = {3, 6, 9, 23};
		
		
		//kiirjuk a t�mb elemeit
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("A t�mb elemeinek �sszege: " + tombOsszegSzamol(tomb));
		System.out.println("A t�mb elemeinek �sszege: " + (double)tombOsszegSzamol(tomb)/tomb.length);
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
