package progTetelek;

import java.util.Random;

public class Metszet {

	public static void main(String[] args) {
		//Metszet: azoknak az elemeknek a kiválasztása, 
		//amelyek mind a két halmazban megtalálhatóak
		//A halmazokon belül nincs ismétlõdés
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12, 20);
		System.out.println("tombA elemei: ");
		tombKiir(tombA);
		System.out.println();
		System.out.println("A tombB elemei: ");
		tombKiir(tombB);
		System.out.println();
		
		//kiderítjük, hány darab egyezõség van, mert egy akkora méretû tömböt 
		//kell létrehozni az eredménytömb deklarációjakor
		int egyezosegekDb=0;
		for (int i = 0; i < tombA.length; i++) {
			if (eldont(tombB, tombA[i])) {
				egyezosegekDb++;
			}
		}
		
		
		//itt rakjuk bele a metszteket egy új tömbbe
		int[] eredmenyTomb = new int[egyezosegekDb];
		int eredmenyTombIndex = 0;
		for (int i = 0; i < tombA.length; i++) {
			if(eldont(tombB, tombA[i])) {
				if (eldont(tombB, tombA[i])) {
					eredmenyTomb[eredmenyTombIndex] = tombA[i];
					eredmenyTombIndex++;
				}
			}
		}
		
		System.out.println();
		System.out.println("A két halmat metszete: ");
		tombKiir(eredmenyTomb);
	}
	
	
	
	//tömbfeltöltés úgy, hogy nem lehet kétszer ugyanaz
	public static int[] tombFeltolt (int meret, int velFelsoHatar) {
		int[] tomb = new int[meret];
		Random r = new Random();
		int veletlenSzam;
		for (int i = 0; i < tomb.length; i++) {
			do {
				veletlenSzam = r.nextInt(velFelsoHatar) + 1;
			} while (eldont(tomb, veletlenSzam));
			tomb[i] = veletlenSzam;
		}
		
		return tomb;
		
	}

	public static boolean eldont(int[] tomb, int keresett) {
		boolean benneVan = false;
		int i = 0;
		do {
			if (tomb[i] == keresett) {
				benneVan = true;
			}
			i++;
		} while (!benneVan && i<tomb.length);
		return benneVan;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		
	}

}
