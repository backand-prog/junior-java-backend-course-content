package HF01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�rj�nk be 5 darab eg�sz sz�mot a felhaszn�l�t�l, mindegyikr�l d�nts�k el, hogy negat�v vagy
pozit�v, esetleg nulla!
 */

public class _31pozitiv {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Adj meg egy sz�mot: ");
			int num = Integer.parseInt(br.readLine());
			if (num % 2 == 0) {
				System.out.println("A sz�m p�ros.");
			} else {
				System.out.println("A sz�m p�ratlan.");
			}
			
		}
			
		br.close();
						
	}

}
