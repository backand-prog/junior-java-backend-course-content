package progTetelek;

import java.util.Random;

public class Kivalogatas {

	public static void main(String[] args) {
		//Kiválogatás tétele: egy halmaz elemei közül kiválogatjuk az adott
		//tulajdonságúakat
		
		//Feladat: 20 elemû tömböt feltölünk véletlen számokkal 1 és 10 között
		//majd a párosokat a páros tömbbe, a páratlanokat a páratlan tömbbe válogatjuk le
	
		//Nehézség: a tömb méretét meg kell adni, amikor léthehozzuk!
		
		int[] tomb = tombFeltolt();
		System.out.println("A  20 db generált szám: (1-10)");
		tombKiir(tomb);
		System.out.println();
		int[] parosTomb = new int[parosDbSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length - parosDbSzamol(tomb)];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				//ha páros, akkor a páros tömbbe helyezzük
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
				
			}
		}
		System.out.println("A páros tömb elemei: ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.println("A páratlan tömb elemei: ");
		tombKiir(paratlanTomb);
		
	}
	
	public static int parosDbSzamol(int[] tomb) {
		int db = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				db ++;
				
			}
			
		}
		
		return db;
		
	}
	
	public static int[] tombFeltolt() {
		Random r = new Random();
		int[] tomb = new int[20];
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = r.nextInt(10)+1;
		}
		
		return tomb;
		
	}
	
	public static void tombKiir (int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		
	}

}
