package alapok;

public class CiklusWhile {

	public static void main(String[] args) {
		/*
		 * while ciklus
		 * nem tudjuk, hogy hányszor fut le
		 * elöltesztelõs ciklus
		 * elõször átnézi a feltételt, ha igaz, akkor lefut
		 * lehet, hogy egyszer sem fut le
		 * a feladatoknál kulcsszó, amíg
		 * feladat: fájlkezelés (eof)
		 */
			
		//addig veygünk számokat, amíg a 7-el osztható számok összege át nem lépi a százat
		
		int counter = 0;
		int sum = 0;
		while (sum < 100) {
			counter++;
			if (counter % 7 == 0) {
				sum += counter; //ugyanaz, mint sum = sum + counter;
				System.out.println(counter);
			}

		}
		
		System.out.println("Számláló értéke: " + counter);
		System.out.println("Összeg értéke: " + sum);
		
	}

}
