package progTetelek;

public class MinKivalasztRendezes {

	public static void main(String[] args) {
		//Minimum kiv�laszt�sos rendez�s
		//meghat�rozzuk a legkisebb �rt�k� elemek �s kicser�lj�k
		//az els� elemmel, a marad�k t�mb�n uganezt az elvet k�vetj�k
		//Addig ism�telj�k, am��g csak 1 elem marad a t�mbben.

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
			
			//ez csak kieg�sz�t�s, hogy l�ssuk hol tart a rendez�s
			
			System.out.println((i+1) + ". fut�s");
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
