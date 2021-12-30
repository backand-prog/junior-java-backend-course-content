package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11paros_hat {

	public static void main(String[] args) throws IOException {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (int i = 1; i < 7; i++) {
			System.out.println(i + ". sz�m.");
			System.out.print("K�rem, adjon meg egy sz�mot!");
						
			num = Integer.parseInt(sc.nextLine());
			
			if (num % 2 == 0) {
				System.out.println("A megadott sz�m (" + num + ") p�ros.");
			} else {
				System.out.println("A megadott sz�m (" + num + ") p�ratlan.");
			}
			
		}
		
		//BufferedReader
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nFeladat megold�sa BufferedReaderrel");
		int num2;
		
		for (int i = 1; i < 7; i++) {
			System.out.println(i + ". sz�m.");
			System.out.print("K�rem, adjon meg egy sz�mot!");
						
			num2 = Integer.parseInt(br.readLine());
			
			if (num2 % 2 == 0) {
				System.out.println("A megadott sz�m (" + num2 + ") p�ros.");
			} else {
				System.out.println("A megadott sz�m (" + num2 + ") p�ratlan.");
			}
		
		
		
		}
		
		sc.close();
		br.close();
	}

}


