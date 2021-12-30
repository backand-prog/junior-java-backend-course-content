package progTetelek;

public class Megszamlalas {

	public static void main(String[] args) {
		//Megszamlalas t�tele
		//Adott tulajdons�g� elemeket megsz�moljuk a halmazon bel�l
		int[] tomb = {3, 6, 9, 23, 55, 89, 11, 22, 66};
		System.out.println("A t�mb elemei:");
		tombKiir(tomb);
		System.out.println();
		System.out.println("P�rosak sz�ma: " + parosMegszamol(tomb));
		
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
