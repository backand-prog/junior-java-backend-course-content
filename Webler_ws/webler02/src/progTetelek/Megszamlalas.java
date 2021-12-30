package progTetelek;

public class Megszamlalas {

	public static void main(String[] args) {
		//Megszamlalas tétele
		//Adott tulajdonságú elemeket megszámoljuk a halmazon belül
		int[] tomb = {3, 6, 9, 23, 55, 89, 11, 22, 66};
		System.out.println("A tömb elemei:");
		tombKiir(tomb);
		System.out.println();
		System.out.println("Párosak száma: " + parosMegszamol(tomb));
		
	}
	
	public static int parosMegszamol(int[] tomb) {
		int darab = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				darab++;			
			}
		}
		return darab;
	}

	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
		System.out.print(item + " ");
		}
		
	}
	
}
