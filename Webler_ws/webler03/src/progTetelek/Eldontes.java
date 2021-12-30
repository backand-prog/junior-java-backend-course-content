package progTetelek;

public class Eldontes {

	public static void main(String[] args) {
		// Eldöntés: egy adathalmazban benne van-e egy érték vagy nincs
		//true/false - logikai típussal tér vissza
		
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println(eldont(tomb, 1));
		System.out.println(eldont2(tomb, 2));
		if (eldont2(tomb, 1)) {
			System.out.println("Benne volt az érték");
		} else {
			System.out.println("Nem volt benne");
		}
		
	}
	
	//EZ A JÓ MEGOLDÁS
	
	public static boolean eldont2(int[] tomb, int keresett) {
		boolean valasz = false;
		int x = 0;
		//addig megy a ciklus, amíg a tömb végéig nem értünk, 
		//és a tömb i-dik eleme nem adott tulajdoságú (nem a keresett)
		while (x<tomb.length && tomb[x] != keresett) {
			x++;
		}
		
		if (x<tomb.length) {
			valasz = true;
		}
		
		return valasz;
		
	}
	
	public static boolean eldont(int[] tomb, int keresett) {
		boolean valasz = false;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] == keresett) {
				valasz = true;
				
			}
			
		}
		
		return valasz;
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		
	}
	
}
