package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérjük be a felhasználó tömegét kg-ban és magasságát cm-ben, majd számítsuk ki és írjuk a
képernyõre a felhasználó testtömeg-indexét a következõ képlet alapján:
TTI = tömeg / magassag2

Figyelj rá, hogy a képletben a magasság méterben megadott értékével kell számolni! A testtömeg-
index és táblázat alapján írd ki, a testsúly-osztályzást! (testtomeg_index)
 */

public class _15testtomeg_index {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Kérem a magasságot! (cm)");
		int heightCm = Integer.parseInt(br.readLine());
		System.out.println("Kérem a súlyt! (kg)");
		float weightKg = Float.parseFloat(br.readLine());
		float heightM = (float)heightCm / 100;
		
		float TTI = weightKg / (float) Math.pow(heightM, 2);
		
		System.out.printf("A TTI értéke: " + "%.2f", TTI);
		System.out.println();
		
		if (TTI < 16 ) { 
			System.out.println("Súlyos soványság");
		} else if (TTI > 16 && TTI < 16.99) {
			System.out.println("Mérsékelt soványság");
		} else if (TTI > 16.99 && TTI < 18.49) {
			System.out.println("Enyhe soványság");
		} else if (TTI > 18.49 && TTI < 24.99) {
			System.out.println("Normális testsúly");
		} else if (TTI > 24.99 && TTI < 29.99) {
			System.out.println("Túlsúlyos");
		} else if (TTI > 29.99 && TTI < 34.99) {
			System.out.println("I. fokú elhízás");
		} else if (TTI > 34.99 && TTI < 39.99) {
			System.out.println("II. fokú elhízás");
		} else {
			System.out.println("III. fokú elhízás");
		}
		
		br.close();

	}

}
