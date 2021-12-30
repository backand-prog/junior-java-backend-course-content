package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Adott �vr�l d�nts�k el, hogy sz�k��v-e! (Sz�k��vek a k�vetkez�k: minden n�ggyel oszthat� �v,
kiv�ve a sz�zzal is oszthat�kat. Sz�k��vek viszont a 400-zal oszthat� �vek. Vagyis a sz�zasra v�gz�d�
�vek k�z�l csak azok sz�k��vek, amelyek 400-zal is oszthat�k.)
Ez alapj�n teh�t sz�k��v: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 �s 2024. Nem
sz�k��v 1700, 1800, 1900, 2100, 2200 �s 2300. Viszont sz�k��vek a k�vetkez� esztend�k: 1600,
2000 �s 2400
 */

public class _37szokoEv {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg az �vet: ");
		int year = Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("A megadott �v sz�k��v.");
		} else {
			System.out.println("A megadott �v NEM sz�k��v.");
		}
		
		br.close();

	}

}
