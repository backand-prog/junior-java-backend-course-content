package progTetelek;

public class MinKivalasztRendezes {

	public static void main(String[] args) {
		//Minimum kiválasztásos rendezés
		//meghatározzuk a legkisebb értékû elemek és kicseréljük
		//az elsõ elemmel, a maradék tömbön uganezt az elvet követjük
		//Addig ismételjük, amííg csak 1 elem marad a tömbben.

		int[] tomb = {44, 78, 3, 91, 11};
		
		tombKiir(tomb);
		
		System.out.println();
		
		int csere;
		int minIndex ;
		for (int i = 0; i < tomb.length; i++) {
			minIndex = i;
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[j]<tomb[minIndex]) {
					minIndex = j;
					
				}

				
				if (i!=minIndex) {
					csere = tomb[i];
					tomb[i] = tomb[minIndex];
					tomb[minIndex] = csere;
				}
			
				
			}
			
			//ez csak kiegészítés, hogy lássuk hol tart a rendezés
			
			System.out.println((i+1) + ". futás");
			tombKiir(tomb);
			System.out.println();
			
		}
		
		
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
