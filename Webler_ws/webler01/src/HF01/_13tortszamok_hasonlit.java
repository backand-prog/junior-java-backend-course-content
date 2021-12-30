package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Készíts alkalmazást, amely bekér két tört számot, majd eldönti, hogy melyik a kisebb/nagyobb,
esetleg egyenlõ –e a két szám!
 */

public class _13tortszamok_hasonlit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg az elsõ törtszámot!");
		double float1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Add meg a második törtszámot!");
		double float2 = Double.parseDouble(sc.nextLine());
		
		if (float1 > float2) {
			System.out.println("Az elsõ tört (" + float1 + ") a nagyobb");
		} else if (float1 < float2) {
			System.out.println("Az második tört (" + float2 + ") a nagyobb");
		} else {
			System.out.println("A két tört értéke egyenlõ.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nMegoldás BufferedReaderrel");
		
		System.out.print("Add meg az elsõ törtszámot!");
		double float3 = Double.parseDouble(br.readLine());
		
		System.out.print("Add meg a második törtszámot!");
		double float4 = Double.parseDouble(br.readLine());
		
		if (float3 > float4) {
			System.out.println("Az elsõ tört (" + float3 + ") a nagyobb");
		} else if (float3 < float4) {
			System.out.println("Az második tört (" + float4 + ") a nagyobb");
		} else {
			System.out.println("A két tört értéke egyenlõ.");
		}
		
		sc.close();
		br.close();
	}

}
