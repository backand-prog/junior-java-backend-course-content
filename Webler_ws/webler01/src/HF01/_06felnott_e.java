package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rj�k be a felhaszn�l� �letkor�t, 
 * majd d�nts�k el, hogy feln�tt �e (18 �ves kort�l m�r feln�tt)! 
 */
public class _06felnott_e {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem adja meg az �letkor�t: ");
		int age = Integer.parseInt(br.readLine());
		
		if (age < 0) {
			System.out.println("Negat�v sz�m nem �rtelmezhet� �letkorn�l.");
		} else if (age < 18) {
			System.out.println("Nem feln�tt");
		} else {
			System.out.println("Feln�tt");
		}
		
		br.close();
		
	}

}
