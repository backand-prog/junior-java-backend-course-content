package progTetelek;

import java.util.Random;

public class BuborekRendezes {

	public static void main(String[] args) {
		//Buborékrendezés
		
		int tomb[] = tombGeneral(10, 30);
		System.out.println("Eredeti tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		
		
		//Buborékrendezés
		int temp;
		for (int i = 0; i < tomb.length; i++) {
			for (int j = 0; j < tomb.length-i-1; j++) {
				if (tomb[j]>tomb[j+1]) {
					temp = tomb[j];
					tomb[j] = tomb[j+1];
					tomb[j+1] = temp;
				}
			}
		}
		
		System.out.println("A tömb elemei rendezetten: ");
		tombKiir(tomb);
		

	}

	public static int[] tombGeneral (int elemSzam, int felsoHatar){
		
		int[] tomb = new int[elemSzam];
		Random r = new Random(); 
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = r.nextInt(felsoHatar) +1;
		}
		return tomb;
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
	
}
