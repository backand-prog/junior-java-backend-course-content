package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�rd be a felhaszn�l� napi kal�ria-bevitel�t, majd d�ntsd el, hogy megfelel�en t�pl�lkozott �e
(megfelel� bevitel 2500 kcal-3500 kcal k�z�tt van)!
 */

public class _09kaloria_bevitel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("K�rem, adja meg a napi kal�riabevitel�t kcal-ban!");
		int kcalBevitel = Integer.parseInt(sc.nextLine());
		
		if (kcalBevitel > 3500) {
			System.out.println("T�lzott kal�riabevitel. A megfelel� bevitel 2500 kcal-3500 kcal k�z�tt van.");
		} else if (kcalBevitel < 2500) {
			System.out.println("Nem elegend� kal�rabevitel. A megfelel� bevitel 2500 kcal-3500 kcal k�z�tt van.");
		} else {
			System.out.println("Megfelel� kal�riabevitel.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nFeladat megold�sa BufferedReaderrel");
		System.out.print("K�rem, adja meg a napi kal�riabevitel�t kcal-ban!");
		int kcalBevitel2 = Integer.parseInt(br.readLine());
		
		if (kcalBevitel2 > 3500) {
			System.out.println("T�lzott kal�riabevitel. A megfelel� bevitel 2500 kcal-3500 kcal k�z�tt van.");
		} else if (kcalBevitel2 < 2500) {
			System.out.println("Nem elegend� kal�rabevitel. A megfelel� bevitel 2500 kcal-3500 kcal k�z�tt van.");
		} else {
			System.out.println("Megfelel� kal�riabevitel.");
		}
		
		sc.close();
		br.close();
	}

}
