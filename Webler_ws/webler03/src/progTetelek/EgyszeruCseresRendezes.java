package progTetelek;

public class EgyszeruCseresRendezes {

	public static void main(String[] args) {
		// Egyszerû cserés rendezés
		//Vagy csökkenõ vagy növekvõ sorrendbe rendezzük a halmaz elemeit
		
		int[] tomb = {44, 78, 3, 91, 11};
		System.out.println("Az eredeti tömb elemei: ");
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
		System.out.println("A rendezett tömb elemei: ");
		tombKiir(tomb);
		
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}

//saját project - veszünk 3-4 algoritmust
//egymillió elemmel próbálgatni
//idõzítõvel megnézzük, hogy melyik mennyi idõ alatt készül el
