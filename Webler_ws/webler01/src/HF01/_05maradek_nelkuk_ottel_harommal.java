package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérj be két számot, majd döntsd el, 
 * hogy összegük osztható –e 5-tel és 3-mal is maradék nélkül!
 */

public class _05maradek_nelkuk_ottel_harommal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg az elsõ számot!");
		int num1 = sc.nextInt();
		System.out.print("Add meg a második számot!");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Az elsõ szám, a '" +  num1 + "' a nagyobb.");			
		} else if (num2 > num1) {
			System.out.println("Az második szám, a '" +  num2 + "' a nagyobb.");
		} else {
			System.out.println("Mindkét szám értéke '" + num1 + "', így két szám egyelnõ");
		}
		
		
		System.out.println();
		System.out.println("BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg az elsõ számot!");
		int num3 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a második számot!");
		int num4 = Integer.parseInt(br.readLine());
		
		if (num3 > num4) {
			System.out.println("Az elsõ szám, a '" +  num3 + "' a nagyobb.");			
		} else if (num4 > num3) {
			System.out.println("Az második szám, a '" +  num4 + "' a nagyobb.");
		} else {
			System.out.println("Mindkét szám értéke '" + num3 + "', így két szám egyelnõ");
		}
		
		sc.close();
		br.close();
		
	}
	
}
