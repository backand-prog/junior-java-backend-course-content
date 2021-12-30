package progTetelek;

public class EgyszeruCseresRendezes {

	public static void main(String[] args) {
		// Egyszer� cser�s rendez�s
		//Vagy cs�kken� vagy n�vekv� sorrendbe rendezz�k a halmaz elemeit
		
		int[] tomb = {44, 78, 3, 91, 11};
		System.out.println("Az eredeti t�mb elemei: ");
		tombKiir(tomb);
		
		for (int i = 0; i < tomb.length-1; i++) {
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[i] > tomb[j]) {
					//csere
					int temp = tomb[j];
					tomb[j] = tomb[i];
					tomb[i] = temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("A rendezett t�mb elemei: ");
		tombKiir(tomb);
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}

//saj�t project - vesz�nk 3-4 algoritmust
//egymilli� elemmel pr�b�lgatni
//id�z�t�vel megn�zz�k, hogy melyik mennyi id� alatt k�sz�l el
