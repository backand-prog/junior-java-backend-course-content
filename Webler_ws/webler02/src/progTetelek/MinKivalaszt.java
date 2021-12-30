package progTetelek;

public class MinKivalaszt {

	public static void main(String[] args) {
		// A legkisebb értékû elemet keressük  halmazon belül
		int[] tomb = {3, 6 , 9, 23, 55, 89, 11, 1, 66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A legkisebb értékû elem: " + minKivalaszt(tomb));

	}
	
	public static int minKivalaszt (int[] tomb) {
		int min = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			//ha a tömb aktuális eleme kisebb, mint a min változó,
			//akkor a min változó vegye fel a tömb aktuális értékét
			if (tomb[i] < min ) {
				min = tomb[i];
			}
		}
		return min;
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
		System.out.print(item + " ");
		}

	}
}
