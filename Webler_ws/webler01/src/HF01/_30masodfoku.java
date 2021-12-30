package HF01;


/*
 * K�sz�ts�nk egy m�sodfok� egyenlet megold� alkalmaz�st! K�rj�k be a, b �s c �rt�k�t,
majd sz�moljuk ki x1-et �s x2-t, ahol:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30masodfoku {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem az 'a'-t: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("K�rem a 'b'-t: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("K�rem az 'c'-t: ");
		int c = Integer.parseInt(br.readLine());
		
		double D = Math.pow(b, 2) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		if (D < 0) {
			System.out.println("Az egyenletnek nincs megold�sa");
		} else if (D == 0) {
			System.out.println("Az egyenletnek egy megold�sa van: x = " + x1);
		} else if (D > 0) {
			System.out.println("Az egyenletnek k�t erem�nye van: x1 = " + x1 + ", x2 = " + x2);
		}
		
		br.close();
		
		
		
	}

}
