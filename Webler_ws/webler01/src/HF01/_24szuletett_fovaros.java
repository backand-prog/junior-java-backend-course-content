package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rj�k be a felhaszn�l� sz�let�si hely�t, majd d�nts�k el, hogy vid�ken vagy a f�v�rosban
sz�letett!
 */

	
public class _24szuletett_fovaros {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg a f�v�ros nev�t: ");
		String Capital = br.readLine();		
		System.out.print("Adja meg a sz�let�si hely�t: ");
		String UserCapital = br.readLine();
		
		if (Capital.equals(UserCapital)) {
			System.out.println("�n a f�v�rosban sz�letett.");
		} else {
			System.out.println("�n vid�ken sz�letett.");
		}
		
		br.close();

	}

}
