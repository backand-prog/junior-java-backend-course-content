package progTetelek;


public class MaxKivalasztas {

	public static void main(String[] args) {
		// Max kiválasztás tétele: egy halmazon belüle keressük
		// a legnagyobb értékû elemeg
		//kiegészítés: legnagyobb értékû elem indexét is határozzuk meg

		int[] tomb = {3, 6 , 9, 23, 55, 89, 11, 1, 66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A legnagyobb érték: " + maxErtekMeghataroz(tomb));
		System.out.println("A legnagyobb érték indexe: " + maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb érték máshogy: " + tomb[maxIndexMeghataroz(tomb)]);
	}
	
	
	public static int maxErtekMeghataroz (int[] tomb) {
		int max = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			//ha a tömb aktuális eleme kisebb, mint a min változó,
			//akkor a min változó vegye fel a tömb aktuális értékét
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
