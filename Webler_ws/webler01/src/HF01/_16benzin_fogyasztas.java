package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rj�k be k�t aut� rendsz�m�t �s fogyaszt�s�t, majd �rjuk ki melyik rendsz�m� aut�nak t�bb a
fogyaszt�sa, esetleg egyenl� -e!
 */
public class _16benzin_fogyasztas {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem, adja meg az els� aut� rendsz�m�t: ");
		String carPlate1 = br.readLine();
		System.out.print("K�rem, adja meg az els� aut� fogyaszt�s�t: ");
		int carConsuption1 = Integer.parseInt(br.readLine());
		
		System.out.print("K�rem, adja meg a m�sodik aut� rendsz�m�t: ");
		String carPlate2 = br.readLine();
		System.out.print("K�rem, adja meg a m�sodik aut� fogyaszt�s�t: ");
		int carConsuption2 = Integer.parseInt(br.readLine());
		
		if (carConsuption1 > carConsuption2) {
			System.out.println("A " + carPlate1 + " forgalmi rendsz�m� aut�nak t�bb a fogyaszt�sa.");	
		} else if (carConsuption1 < carConsuption2) {
			System.out.println("A " + carPlate2 + " forgalmi rendsz�m� aut�nak t�bb a fogyaszt�sa.");
		} else {
			System.out.println("Megegyez� a fogyaszt�suk.");
		}
		
		br.close();

	}

}
