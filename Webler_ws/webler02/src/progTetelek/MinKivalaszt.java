package progTetelek;

public class MinKivalaszt {

	public static void main(String[] args) {
		// A legkisebb �rt�k� elemet keress�k  halmazon bel�l
		int[] tomb = {3, 6 , 9, 23, 55, 89, 11, 1, 66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A legkisebb �rt�k� elem: " + minKivalaszt(tomb));

	}
	
	public static int minKivalaszt (int[] tomb) {
		int min = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			//ha a t�mb aktu�lis eleme kisebb, mint a min v�ltoz�,
			//akkor a min v�ltoz� vegye fel a t�mb aktu�lis �rt�k�t
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
