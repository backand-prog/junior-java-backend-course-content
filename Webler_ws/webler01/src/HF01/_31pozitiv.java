package HF01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérjünk be 5 darab egész számot a felhasználótól, mindegyikrõl döntsük el, hogy negatív vagy
pozitív, esetleg nulla!
 */

public class _31pozitiv {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Adj meg egy számot: ");
			int num = Integer.parseInt(br.readLine());
			if (num % 2 == 0) {
				System.out.println("A szám páros.");
			} else {
				System.out.println("A szám páratlan.");
			}
			
		}
			
		br.close();
						
	}

}
