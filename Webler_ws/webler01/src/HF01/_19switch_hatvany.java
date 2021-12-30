package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Switch-case szerkezettel k�sz�ts�nk hatv�nyoz� alkalmaz�st! K�rj�nk be 2 pozit�v eg�sz sz�mot:
az els� sz�m, amit hatv�nyozni szeretn�nk, a m�sodik megadott sz�m pedig a men�pont, amit
le�tve �rja ki a 2. 3. vagy a 4. hatv�ny�t az els� sz�mnak! Ha m�s �rt�ket adok meg, �rja ki, hogy
hib�s adat!
 */
public class _19switch_hatvany {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("K�rem az els� sz�mot, amit hatv�nyozni szeretn�nk (alap): ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("K�rem a m�sodik sz�mot, amivel hatv�nyozni szeretn�nk (kivet�): ");
		int num2 = Integer.parseInt(br.readLine());
		
		switch (num2) {
		case 2: System.out.println(Math.pow(num1, num2));
			break;
		case 3: System.out.println(Math.pow(num1, num2));
			break;
		case 4: System.out.println(Math.pow(num1, num2));
			break;
		default: System.out.println("Hib�s adat");
			break;
		}
		
		
		
	}

}
