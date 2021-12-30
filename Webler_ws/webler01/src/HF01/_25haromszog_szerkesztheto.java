package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rd be a h�romsz�g h�rom oldal�t �s d�ntsd el, hogy szerkeszthet� �e a h�romsz�g!
(haromszog_szerkesztheto)
 */

public class _25haromszog_szerkesztheto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem az els� oldalt: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("K�rem a m�sodik oldalt: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("K�rem a harmadik oldalt: ");
		int c = Integer.parseInt(br.readLine());
		
		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("Szerkeszthet� a h�romsz�g");
		} else {
			System.out.println("Nem szerkeszthet� a h�romsz�g");
		}
		
	}

}
