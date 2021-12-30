package progTetelek;

public class Kivalasztas {

	public static void main(String[] args) {
		//Kiválasztás tétele: egy sorozatban keresünk egy elemet, de 
		//biztosan tudjuk, hogy benne van
		/*
		 * Pszeudó kód
		 * Eljárás: Kiválasztás
		 * i:=1
		 * Ciklis amíg A[i] nem T tulajdonságú
		 * i:=i+1
		 * Ciklus vége
		 * Sorszám
		 */
		
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ezen az indexen található meg az érték : " + kivalaszt(tomb, 55));
		
	}
	
	public static int kivalaszt(int[] tomb, int keresett) {
		int i = 0;
		while(tomb[i] != keresett) {
			i++;
		}
		
		return i;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		
	}

}
