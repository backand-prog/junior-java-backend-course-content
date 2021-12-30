package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérjük be két autó rendszámát és fogyasztását, majd írjuk ki melyik rendszámú autónak több a
fogyasztása, esetleg egyenlõ -e!
 */
public class _16benzin_fogyasztas {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem, adja meg az elsõ autó rendszámát: ");
		String carPlate1 = br.readLine();
		System.out.print("Kérem, adja meg az elsõ autó fogyasztását: ");
		int carConsuption1 = Integer.parseInt(br.readLine());
		
		System.out.print("Kérem, adja meg a második autó rendszámát: ");
		String carPlate2 = br.readLine();
		System.out.print("Kérem, adja meg a második autó fogyasztását: ");
		int carConsuption2 = Integer.parseInt(br.readLine());
		
		if (carConsuption1 > carConsuption2) {
			System.out.println("A " + carPlate1 + " forgalmi rendszámú autónak több a fogyasztása.");	
		} else if (carConsuption1 < carConsuption2) {
			System.out.println("A " + carPlate2 + " forgalmi rendszámú autónak több a fogyasztása.");
		} else {
			System.out.println("Megegyezõ a fogyasztásuk.");
		}
		
		br.close();

	}

}
