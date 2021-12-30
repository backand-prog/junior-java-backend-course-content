package progTetelek;

public class Kivalasztas {

	public static void main(String[] args) {
		//Kiv�laszt�s t�tele: egy sorozatban keres�nk egy elemet, de 
		//biztosan tudjuk, hogy benne van
		/*
		 * Pszeud� k�d
		 * Elj�r�s: Kiv�laszt�s
		 * i:=1
		 * Ciklis am�g A[i] nem T tulajdons�g�
		 * i:=i+1
		 * Ciklus v�ge
		 * Sorsz�m
		 */
		
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ezen az indexen tal�lhat� meg az �rt�k : " + kivalaszt(tomb, 55));
		
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
