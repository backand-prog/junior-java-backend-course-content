package alapok;

public class CiklusWhile {

	public static void main(String[] args) {
		/*
		 * while ciklus
		 * nem tudjuk, hogy h�nyszor fut le
		 * el�ltesztel�s ciklus
		 * el�sz�r �tn�zi a felt�telt, ha igaz, akkor lefut
		 * lehet, hogy egyszer sem fut le
		 * a feladatokn�l kulcssz�, am�g
		 * feladat: f�jlkezel�s (eof)
		 */
			
		//addig veyg�nk sz�mokat, am�g a 7-el oszthat� sz�mok �sszege �t nem l�pi a sz�zat
		
		int counter = 0;
		int sum = 0;
		while (sum < 100) {
			counter++;
			if (counter % 7 == 0) {
				sum += counter; //ugyanaz, mint sum = sum + counter;
				System.out.println(counter);
			}

		}
		
		System.out.println("Sz�ml�l� �rt�ke: " + counter);
		System.out.println("�sszeg �rt�ke: " + sum);
		
	}

}
