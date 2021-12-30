package progTetelek;

import java.util.Random;

public class Kivalogatas {

	public static void main(String[] args) {
		//Kiv�logat�s t�tele: egy halmaz elemei k�z�l kiv�logatjuk az adott
		//tulajdons�g�akat
		
		//Feladat: 20 elem� t�mb�t felt�l�nk v�letlen sz�mokkal 1 �s 10 k�z�tt
		//majd a p�rosokat a p�ros t�mbbe, a p�ratlanokat a p�ratlan t�mbbe v�logatjuk le
	
		//Neh�zs�g: a t�mb m�ret�t meg kell adni, amikor l�thehozzuk!
		
		int[] tomb = tombFeltolt();
		System.out.println("A  20 db gener�lt sz�m: (1-10)");
		tombKiir(tomb);
		System.out.println();
		int[] parosTomb = new int[parosDbSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length - parosDbSzamol(tomb)];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				//ha p�ros, akkor a p�ros t�mbbe helyezz�k
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
				
			}
		}
		System.out.println("A p�ros t�mb elemei: ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.println("A p�ratlan t�mb elemei: ");
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
