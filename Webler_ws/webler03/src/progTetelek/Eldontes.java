package progTetelek;

public class Eldontes {

	public static void main(String[] args) {
		// Eld�nt�s: egy adathalmazban benne van-e egy �rt�k vagy nincs
		//true/false - logikai t�pussal t�r vissza
		
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println(eldont(tomb, 1));
		System.out.println(eldont2(tomb, 2));
		if (eldont2(tomb, 1)) {
			System.out.println("Benne volt az �rt�k");
		} else {
			System.out.println("Nem volt benne");
		}
		
	}
	
	//EZ A J� MEGOLD�S
	
	public static boolean eldont2(int[] tomb, int keresett) {
		boolean valasz = false;
		int x = 0;
		//addig megy a ciklus, am�g a t�mb v�g�ig nem �rt�nk, 
		//�s a t�mb i-dik eleme nem adott tulajdos�g� (nem a keresett)
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
