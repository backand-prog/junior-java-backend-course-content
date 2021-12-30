package HF01;

/*
 * Olvasd be, hogy a felhaszn�l� �tlagosan h�ny �r�t alszik naponta (eg�sz sz�mk�nt), �s jellemezd
az alv�sidej�t a k�vetkez� m�don: 0-6 �r�ig kev�s, 7-9 �r�ig �tlagos, 10-12 �r�ig sok, 13-24 �r�ig
nagyon sok!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29alvasido {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg, h�ny �r�t alszik naponta: ");
		int sleepHours = Integer.parseInt(br.readLine());
		
		if (sleepHours > 0 && sleepHours < 7 ) {
			System.out.println("Kev�s");
		} else if (sleepHours >= 7 && sleepHours < 9) {
			System.out.println("�tlagos");
		} else if (sleepHours >= 10 && sleepHours < 12) {
			System.out.println("Sok");
		} else if (sleepHours >= 12 && sleepHours < 25) {
			System.out.println("Nagyon sok");
		} else {
			System.out.println("Nem megfelel� adat. 0 �s 24 k�z�tt eg�sz sz�mokat kell megadni");
		}
		
	}

}
