package progTetelek;


public class MaxKivalasztas {

	public static void main(String[] args) {
		// Max kiv�laszt�s t�tele: egy halmazon bel�le keress�k
		// a legnagyobb �rt�k� elemeg
		//kieg�sz�t�s: legnagyobb �rt�k� elem index�t is hat�rozzuk meg

		int[] tomb = {3, 6 , 9, 23, 55, 89, 11, 1, 66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A legnagyobb �rt�k: " + maxErtekMeghataroz(tomb));
		System.out.println("A legnagyobb �rt�k indexe: " + maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb �rt�k m�shogy: " + tomb[maxIndexMeghataroz(tomb)]);
	}
	
	
	public static int maxErtekMeghataroz (int[] tomb) {
		int max = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			//ha a t�mb aktu�lis eleme kisebb, mint a min v�ltoz�,
			//akkor a min v�ltoz� vegye fel a t�mb aktu�lis �rt�k�t
			if (tomb[i] > max ) {
				max = tomb[i];
			}
		}
		return max;
		
	}
	
	public static int maxIndexMeghataroz(int[] tomb) {
		int max = tomb[0];
		int maxIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] > max) {
				max = tomb[i];
				maxIndex = i;
			}
		}
		
		return maxIndex;	

	}
	
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
		System.out.print(item + " ");
		}

	}

}
