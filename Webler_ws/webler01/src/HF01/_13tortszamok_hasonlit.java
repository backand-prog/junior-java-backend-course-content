package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�sz�ts alkalmaz�st, amely bek�r k�t t�rt sz�mot, majd eld�nti, hogy melyik a kisebb/nagyobb,
esetleg egyenl� �e a k�t sz�m!
 */

public class _13tortszamok_hasonlit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg az els� t�rtsz�mot!");
		double float1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Add meg a m�sodik t�rtsz�mot!");
		double float2 = Double.parseDouble(sc.nextLine());
		
		if (float1 > float2) {
			System.out.println("Az els� t�rt (" + float1 + ") a nagyobb");
		} else if (float1 < float2) {
			System.out.println("Az m�sodik t�rt (" + float2 + ") a nagyobb");
		} else {
			System.out.println("A k�t t�rt �rt�ke egyenl�.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nMegold�s BufferedReaderrel");
		
		System.out.print("Add meg az els� t�rtsz�mot!");
		double float3 = Double.parseDouble(br.readLine());
		
		System.out.print("Add meg a m�sodik t�rtsz�mot!");
		double float4 = Double.parseDouble(br.readLine());
		
		if (float3 > float4) {
			System.out.println("Az els� t�rt (" + float3 + ") a nagyobb");
		} else if (float3 < float4) {
			System.out.println("Az m�sodik t�rt (" + float4 + ") a nagyobb");
		} else {
			System.out.println("A k�t t�rt �rt�ke egyenl�.");
		}
		
		sc.close();
		br.close();
	}

}
