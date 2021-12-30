package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�sz�ts programot, mely a h�nap sorsz�ma alapj�n megadja, melyik �vszakba tartozik! Haszn�lj
switch-case szerkezetet!
 */
public class _28evszakok {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a h�nap sorsz�m�t! ");
		int monthNum = Integer.parseInt(br.readLine());
		
		switch (monthNum) {
		case 12:
		case 1:
		case 2: System.out.println("T�l");
			break;
		case 3:
		case 4:
		case 5: System.out.println("Tavasz");
			break;
		case 6:
		case 7:
		case 8: System.out.println("Ny�r");
			break;
		case 9:
		case 10:
		case 11: System.out.println("�sz");
			break;
		default: System.out.println("Nem megfelel� sz�m, 1-12-ig vannak a h�napok sorsz�mai.");
			break;
		}
		
		br.close();

	}

}
