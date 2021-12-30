package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Adott évrõl döntsük el, hogy szökõév-e! (Szökõévek a következõk: minden néggyel osztható év,
kivéve a százzal is oszthatókat. Szökõévek viszont a 400-zal osztható évek. Vagyis a százasra végzõdõ
évek közül csak azok szökõévek, amelyek 400-zal is oszthatók.)
Ez alapján tehát szökõév: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024. Nem
szökõév 1700, 1800, 1900, 2100, 2200 és 2300. Viszont szökõévek a következõ esztendõk: 1600,
2000 és 2400
 */

public class _37szokoEv {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg az évet: ");
		int year = Integer.parseInt(br.readLine());
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("A megadott év szökõév.");
		} else {
			System.out.println("A megadott év NEM szökõév.");
		}
		
		br.close();

	}

}
