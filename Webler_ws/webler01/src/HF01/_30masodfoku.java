package HF01;


/*
 * Készítsünk egy másodfokú egyenlet megoldó alkalmazást! Kérjük be a, b és c értékét,
majd számoljuk ki x1-et és x2-t, ahol:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30masodfoku {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem az 'a'-t: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Kérem a 'b'-t: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("Kérem az 'c'-t: ");
		int c = Integer.parseInt(br.readLine());
		
		double D = Math.pow(b, 2) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		if (D < 0) {
			System.out.println("Az egyenletnek nincs megoldása");
		} else if (D == 0) {
			System.out.println("Az egyenletnek egy megoldása van: x = " + x1);
		} else if (D > 0) {
			System.out.println("Az egyenletnek két ereménye van: x1 = " + x1 + ", x2 = " + x2);
		}
		
		br.close();
		
		
		
	}

}
