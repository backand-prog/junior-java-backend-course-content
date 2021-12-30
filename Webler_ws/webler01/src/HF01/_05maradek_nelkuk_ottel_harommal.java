package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�rj be k�t sz�mot, majd d�ntsd el, 
 * hogy �sszeg�k oszthat� �e 5-tel �s 3-mal is marad�k n�lk�l!
 */

public class _05maradek_nelkuk_ottel_harommal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg az els� sz�mot!");
		int num1 = sc.nextInt();
		System.out.print("Add meg a m�sodik sz�mot!");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Az els� sz�m, a '" +  num1 + "' a nagyobb.");			
		} else if (num2 > num1) {
			System.out.println("Az m�sodik sz�m, a '" +  num2 + "' a nagyobb.");
		} else {
			System.out.println("Mindk�t sz�m �rt�ke '" + num1 + "', �gy k�t sz�m egyeln�");
		}
		
		
		System.out.println();
		System.out.println("BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg az els� sz�mot!");
		int num3 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a m�sodik sz�mot!");
		int num4 = Integer.parseInt(br.readLine());
		
		if (num3 > num4) {
			System.out.println("Az els� sz�m, a '" +  num3 + "' a nagyobb.");			
		} else if (num4 > num3) {
			System.out.println("Az m�sodik sz�m, a '" +  num4 + "' a nagyobb.");
		} else {
			System.out.println("Mindk�t sz�m �rt�ke '" + num3 + "', �gy k�t sz�m egyeln�");
		}
		
		sc.close();
		br.close();
		
	}
	
}
