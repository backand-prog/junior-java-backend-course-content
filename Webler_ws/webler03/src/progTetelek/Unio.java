package progTetelek;

import java.util.Random;

public class Unio {

	public static void main(String[] args) {
		//Unio: a k�t halmaz k�z�l legal�bb az egyikben szerepelnie kell az egyik elemnek
		//A halmazokon bel�l nincsen ism�tl�d�s!!!
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12, 20);
		System.out.println("tombA elemei: ");
		tombKiir(tombA);
		System.out.println();
		System.out.println("A tombB elemei: ");
		tombKiir(tombB);
		System.out.println();
		
		int eredmenyTombMeret = (tombA.length + tombB.length) - 
				egyezosegekSzamaMeghataroz(tombA, tombB);
		
		int[] eredmenyTomb = new int[eredmenyTombMeret];
		
		//eredm�nyt�mb felt�lt�se
		//1. l�p�s: tombA minden elem�t belepakoljuk
		for (int i = 0; i < tombA.length; i++) {
			eredmenyTomb[i] = tombA[i];
			
		}
		
		//2. l�p�s: tombB-b�l m�r csak azokat rakjuk bele, amik m�g nincsenek a t�mbben
		int eredmenyTombIndex = tombA.length;
		for (int i = 0; i < tombB.length; i++) {
			if (!eldont(eredmenyTomb, tombB[i])) {
				eredmenyTomb[eredmenyTombIndex] = tombB[i];
				eredmenyTombIndex++;
			}
		}
		
		System.out.println();
		System.out.println("Az unio elemei: ");
		tombKiir(eredmenyTomb);
		
		
	}
	
	public static int egyezosegekSzamaMeghataroz (int[] tombA, int[] tombB) {
		int db = 0;
		for (int i = 0; i < tombA.length; i++) {
			if (eldont(tombB, tombA[i])) {
				db++;
			}
		}
		return db;
		
	}
	
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



