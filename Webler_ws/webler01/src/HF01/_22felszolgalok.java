package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 22. A gyorsétterem felszolgálói hetente kapnak fizetést. Mindenki az alapján hány napot dolgozott a
héten. Bérük 8.000 Ft / nap. Kérjük be a felszolgáló nevét és hány napon dolgozott a héten, majd
írjuk ki a heti fizetését.
 */

public class _22felszolgalok {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem, adja meg a felszolgáló nevét: ");
		String waiterName = br.readLine();
		System.out.print("Kérem adja meg, hogy hány napot dolgozott a felszolgáló a héten (1-7): ");
		int weekWorkDays = Integer.parseInt(br.readLine());
		int dailySaraly = 8000;
		
		switch (weekWorkDays) {
		case 1:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 2:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 3:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 4:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 5:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 6:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		case 7:
			System.out.println(waiterName + " " + weekWorkDays + " napot dolgozott, így a heti fizetése: " + (weekWorkDays * dailySaraly) + " Ft.");
			break;
		default:
			System.out.println("Nem megfelelõ érték, egy hét 7 napból áll.");
			break;
		}
		
		br.close();

	}

}
