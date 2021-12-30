package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérd be a felhasználó napi kalória-bevitelét, majd döntsd el, hogy megfelelõen táplálkozott –e
(megfelelõ bevitel 2500 kcal-3500 kcal között van)!
 */

public class _09kaloria_bevitel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kérem, adja meg a napi kalóriabevitelét kcal-ban!");
		int kcalBevitel = Integer.parseInt(sc.nextLine());
		
		if (kcalBevitel > 3500) {
			System.out.println("Túlzott kalóriabevitel. A megfelelõ bevitel 2500 kcal-3500 kcal között van.");
		} else if (kcalBevitel < 2500) {
			System.out.println("Nem elegendõ kalórabevitel. A megfelelõ bevitel 2500 kcal-3500 kcal között van.");
		} else {
			System.out.println("Megfelelõ kalóriabevitel.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nFeladat megoldása BufferedReaderrel");
		System.out.print("Kérem, adja meg a napi kalóriabevitelét kcal-ban!");
		int kcalBevitel2 = Integer.parseInt(br.readLine());
		
		if (kcalBevitel2 > 3500) {
			System.out.println("Túlzott kalóriabevitel. A megfelelõ bevitel 2500 kcal-3500 kcal között van.");
		} else if (kcalBevitel2 < 2500) {
			System.out.println("Nem elegendõ kalórabevitel. A megfelelõ bevitel 2500 kcal-3500 kcal között van.");
		} else {
			System.out.println("Megfelelõ kalóriabevitel.");
		}
		
		sc.close();
		br.close();
	}

}
