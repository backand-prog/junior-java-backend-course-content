package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Programunk kérje be egy autó fogyasztását (literben 100 km-en), a benzin literenkénti árát és a
megteendõ út hosszát, majd számítsa ki az útiköltséget! (pld. Autó fogyasztása: 5 liter / 100km, út
hossza: 850 km, benzinár: 370 Ft / liter, útiköltség: 15.725 Ft)
*/

public class _02uzemanyag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		//adatok bekérése (fogyasztás, úthossz, üzemanyagár)
		System.out.println("Fogyasztás feladat Scannerrel");
		System.out.print("Add meg az autó fogyasztását 100 kilométeren!");
		int fogyasztas = sc.nextInt();
		System.out.print("Add meg az út hosszát! (Km)");
		int utHossza = sc.nextInt();
		System.out.print("Add meg az üzemanyag árát! (Ft)");
		int uzemanyagAr = sc.nextInt();
		
		//útiköltség számítása
		double utikoltseg = ((double)utHossza / 100) * (fogyasztas * uzemanyagAr);
		
		System.out.println("Az autó fogyasztása: " + fogyasztas + " liter/100km\nAz út hossza: " + utHossza + " km\nÜzemanyagár " + uzemanyagAr + " \naz útiköltség :" + (int)utikoltseg + " Forint.");
		
		//BUFFEREDREAD
		
		System.out.println("\nFogyasztás feladat BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//adatok bekérése (fogyasztás, úthossz, üzemanyagár)
		System.out.print("Add meg az autó fogyasztását 100 kilométeren!");
		int fogyasztasBr = Integer.parseInt(br.readLine());
		System.out.print("Add meg az út hosszát! (Km)");
		int utHosszaBr = Integer.parseInt(br.readLine());
		System.out.print("Add meg az üzemanyag árát! (Ft)");
		int uzemanyagArBr = Integer.parseInt(br.readLine());
		
		//útiköltség számítása
		double utikoltsegBr = ((double)utHosszaBr / 100) * (fogyasztasBr * uzemanyagArBr);
		
		System.out.println("Az autó fogyasztása: " + fogyasztasBr + " liter/100km\nAz út hossza: " + utHosszaBr + " km\nÜzemanyagár " + uzemanyagArBr + " \naz útiköltség :" + (int)utikoltsegBr + " Forint.");
		
		sc.close();
		br.close();
		
	}

}
