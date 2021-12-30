package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérd be a háromszög három oldalát és döntsd el, hogy szerkeszthetõ –e a háromszög!
(haromszog_szerkesztheto)
 */

public class _25haromszog_szerkesztheto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem az elsõ oldalt: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Kérem a második oldalt: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("Kérem a harmadik oldalt: ");
		int c = Integer.parseInt(br.readLine());
		
		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("Szerkeszthetõ a háromszög");
		} else {
			System.out.println("Nem szerkeszthetõ a háromszög");
		}
		
	}

}
