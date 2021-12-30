package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rj�k be a felhaszn�l� t�meg�t kg-ban �s magass�g�t cm-ben, majd sz�m�tsuk ki �s �rjuk a
k�perny�re a felhaszn�l� testt�meg-index�t a k�vetkez� k�plet alapj�n:
TTI = t�meg / magassag2

Figyelj r�, hogy a k�pletben a magass�g m�terben megadott �rt�k�vel kell sz�molni! A testt�meg-
index �s t�bl�zat alapj�n �rd ki, a tests�ly-oszt�lyz�st! (testtomeg_index)
 */

public class _15testtomeg_index {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("K�rem a magass�got! (cm)");
		int heightCm = Integer.parseInt(br.readLine());
		System.out.println("K�rem a s�lyt! (kg)");
		float weightKg = Float.parseFloat(br.readLine());
		float heightM = (float)heightCm / 100;
		
		float TTI = weightKg / (float) Math.pow(heightM, 2);
		
		System.out.printf("A TTI �rt�ke: " + "%.2f", TTI);
		System.out.println();
		
		if (TTI < 16 ) { 
			System.out.println("S�lyos sov�nys�g");
		} else if (TTI > 16 && TTI < 16.99) {
			System.out.println("M�rs�kelt sov�nys�g");
		} else if (TTI > 16.99 && TTI < 18.49) {
			System.out.println("Enyhe sov�nys�g");
		} else if (TTI > 18.49 && TTI < 24.99) {
			System.out.println("Norm�lis tests�ly");
		} else if (TTI > 24.99 && TTI < 29.99) {
			System.out.println("T�ls�lyos");
		} else if (TTI > 29.99 && TTI < 34.99) {
			System.out.println("I. fok� elh�z�s");
		} else if (TTI > 34.99 && TTI < 39.99) {
			System.out.println("II. fok� elh�z�s");
		} else {
			System.out.println("III. fok� elh�z�s");
		}
		
		br.close();

	}

}
