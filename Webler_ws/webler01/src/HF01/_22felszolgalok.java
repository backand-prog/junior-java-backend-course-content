package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 22. A gyors�tterem felszolg�l�i hetente kapnak fizet�st. Mindenki az alapj�n h�ny napot dolgozott a
h�ten. B�r�k 8.000 Ft / nap. K�rj�k be a felszolg�l� nev�t �s h�ny napon dolgozott a h�ten, majd
�rjuk ki a heti fizet�s�t.
 */

public class _22felszolgalok {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem, adja meg a felszolg�l� nev�t: ");
		String waiterName = br.readLine();
		System.out.print("K�rem adja meg, hogy h�ny napot dolgozott a felszolg�l� a h�ten (1-7): ");
		int weekWorkDays = Integer.parseInt(br.readLine());
		int dailySaraly = 8000;
		
		switch (weekWorkDays) {
		case 1:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 2:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 3:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 4:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 5:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 6:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 7:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, �gy a heti fizet�se: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		default:
			System.out.println("Nem megfelel� �rt�k, egy h�t 7 napb�l �ll.");
			break;
		}
		
		br.close();

	}

}
