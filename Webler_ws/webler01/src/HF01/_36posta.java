package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A postai k�ldem�nyeket s�lyuk alapj�n �razz�k (2 kg-ig 475 Ft, 20 kg-ig 3395 Ft, 40 kg-ig 6415 Ft).
K�sz�ts alkalmaz�st, ami bek�ri a k�ldem�ny s�ly�t, majd ki�rja a fizetend� �sszeget! 40 kg felett �rja
ki, hogy nem v�llal a posta s�lyos k�ldem�ny k�zbes�t�s�t!
*/

public class _36posta {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem adja meg, h�ny kg-os k�ldem�nyt k�v�n felpost�zni: ");
		int packageWeight = Integer.parseInt(br.readLine());
		
		if (packageWeight < 1) {
			System.out.println("0 �s negat�v �rt�k nem �rtelmezhet�.");
		} else if (packageWeight < 3) {
			System.out.println("A post�z�s �ra 475 Ft.");
		} else if (packageWeight < 21) {
			System.out.println("A post�z�s �ra 3995 Ft.");
		} else if (packageWeight < 41) {
			System.out.println("A post�z�s �ra 6415 Ft.");
		} else {
			System.out.println("A posta nem v�llalja s�lyos k�zbes�t�s�t.");
		}
		
		br.close();
		
	}

}
