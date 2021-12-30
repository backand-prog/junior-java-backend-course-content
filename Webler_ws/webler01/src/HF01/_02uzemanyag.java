package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Programunk k�rje be egy aut� fogyaszt�s�t (literben 100 km-en), a benzin literenk�nti �r�t �s a
megteend� �t hossz�t, majd sz�m�tsa ki az �tik�lts�get! (pld. Aut� fogyaszt�sa: 5 liter / 100km, �t
hossza: 850 km, benzin�r: 370 Ft / liter, �tik�lts�g: 15.725 Ft)
*/

public class _02uzemanyag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		//adatok bek�r�se (fogyaszt�s, �thossz, �zemanyag�r)
		System.out.println("Fogyaszt�s feladat Scannerrel");
		System.out.print("Add meg az aut� fogyaszt�s�t 100 kilom�teren!");
		int fogyasztas = sc.nextInt();
		System.out.print("Add meg az �t hossz�t! (Km)");
		int utHossza = sc.nextInt();
		System.out.print("Add meg az �zemanyag �r�t! (Ft)");
		int uzemanyagAr = sc.nextInt();
		
		//�tik�lts�g sz�m�t�sa
		double utikoltseg = ((double)utHossza / 100) * (fogyasztas * uzemanyagAr);
		
		System.out.println("Az aut� fogyaszt�sa: " + fogyasztas + " liter/100km\nAz �t hossza: " + utHossza + " km\n�zemanyag�r " + uzemanyagAr + " \naz �tik�lts�g :" + (int)utikoltseg + " Forint.");
		
		//BUFFEREDREAD
		
		System.out.println("\nFogyaszt�s feladat BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//adatok bek�r�se (fogyaszt�s, �thossz, �zemanyag�r)
		System.out.print("Add meg az aut� fogyaszt�s�t 100 kilom�teren!");
		int fogyasztasBr = Integer.parseInt(br.readLine());
		System.out.print("Add meg az �t hossz�t! (Km)");
		int utHosszaBr = Integer.parseInt(br.readLine());
		System.out.print("Add meg az �zemanyag �r�t! (Ft)");
		int uzemanyagArBr = Integer.parseInt(br.readLine());
		
		//�tik�lts�g sz�m�t�sa
		double utikoltsegBr = ((double)utHosszaBr / 100) * (fogyasztasBr * uzemanyagArBr);
		
		System.out.println("Az aut� fogyaszt�sa: " + fogyasztasBr + " liter/100km\nAz �t hossza: " + utHosszaBr + " km\n�zemanyag�r " + uzemanyagArBr + " \naz �tik�lts�g :" + (int)utikoltsegBr + " Forint.");
		
		sc.close();
		br.close();
		
	}

}
