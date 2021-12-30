package progTetelek;

import java.util.Random;

public class Metszet {

	public static void main(String[] args) {
		//Metszet: azoknak az elemeknek a kiv�laszt�sa, 
		//amelyek mind a k�t halmazban megtal�lhat�ak
		//A halmazokon bel�l nincs ism�tl�d�s
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12, 20);
		System.out.println("tombA elemei: ");
		tombKiir(tombA);
		System.out.println();
		System.out.println("A tombB elemei: ");
		tombKiir(tombB);
		System.out.println();
		
		//kider�tj�k, h�ny darab egyez�s�g van, mert egy akkora m�ret� t�mb�t 
		//kell l�trehozni az eredm�nyt�mb deklar�ci�jakor
		int egyezosegekDb=0;
		for (int i = 0; i < tombA.length; i++) {
			if (eldont(tombB, tombA[i])) {
				egyezosegekDb++;
			}
		}
		
		
		//itt rakjuk bele a metszteket egy �j t�mbbe
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
		System.out.println("A k�t halmat metszete: ");
		tombKiir(eredmenyTomb);
	}
	
	
	
	//t�mbfelt�lt�s �gy, hogy nem lehet k�tszer ugyanaz
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
