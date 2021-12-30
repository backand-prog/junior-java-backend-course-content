package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Switch-case szerkezettel készítsünk hatványozó alkalmazást! Kérjünk be 2 pozitív egész számot:
az elsõ szám, amit hatványozni szeretnénk, a második megadott szám pedig a menüpont, amit
leütve írja ki a 2. 3. vagy a 4. hatványát az elsõ számnak! Ha más értéket adok meg, írja ki, hogy
hibás adat!
 */
public class _19switch_hatvany {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérem az elsõ számot, amit hatványozni szeretnénk (alap): ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem a második számot, amivel hatványozni szeretnénk (kivetõ): ");
		int num2 = Integer.parseInt(br.readLine());
		
		switch (num2) {
		case 2: System.out.println(Math.pow(num1, num2));
			break;
		case 3: System.out.println(Math.pow(num1, num2));
			break;
		case 4: System.out.println(Math.pow(num1, num2));
			break;
		default: System.out.println("Hibás adat");
			break;
		}
		
		
		
	}

}
