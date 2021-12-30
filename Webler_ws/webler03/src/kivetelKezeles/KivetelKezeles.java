package kivetelKezeles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KivetelKezeles {

	public static void main(String[] args) {
		// Kiv�telkezel�s: ha a program gib�ra futna, akkor mi t�rt�njen.
		// Hiba eset�n �tvessz�k a vez�rl�st a ford�t�t�l.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("K�rem adjon meg egy eg�sz sz�mot: ");
			int szamBekert = Integer.parseInt(br.readLine());
			System.out.println("A megadott sz�m ez volt: " + szamBekert);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			//Ebbe az �gba akkor megy bele, ha pld sz�veget vagy t�rtsz�mot adtunk meg.
			System.out.println("Eg�sz sz�mot k�rtem!!");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println();
			System.out.println("Bez�rtad az olvas� adatfolyamot, �gy nem lesz j�...");
		} catch (Exception e) {
			System.out.println("Valamilyen hiba t�rt�nt, sajn�ljuk...");
		}
		
		//A legspeci�lisabb kiv�telt�l megy�nk a leg�ltal�nosabbig - FONTOS SZAB�LY
		
		//fontosak:
		//ArrayyIndexOutOfBoundException - olyan elemre hivatkozok a t�mbn�l, ami nincsen
		//IOException - f�jkezel�ses m�veletek
		//FileNotFoundException - nem tal�lja a megadon helyen a f�jlt
		//saj�t kiv�telkezel� oszt�lyt is l�trehozhatunk		
		
		//Feladat: K�rj�nk be k�t eg�sz s�zmot hibakezel�ssel, osszuk el az els�t a m�sodikkal
		//0-val val� oszt�sra figyelni kell
		
		
		//deklar�ci�
		double eredmeny = 0.0;
		
		try {
			System.out.println("K�rem adja meg az osztand�t:" );
			int osztando = Integer.parseInt(br.readLine());
			System.out.println("K�rem adja meg az oszt�t:" );
			int oszto = Integer.parseInt(br.readLine());
			eredmeny = (double)osztando/oszto; //definici�
			System.out.println(eredmeny);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Eg�sz sz�mot k�rtem...");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0-val val� oszt�s...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("I/O hiba t�rt�nt.");
		} finally {
			//nem k�telez� eleme a try-catch szerkezetnek
			//mindenk�ppen lefut
			//tisztogat�sra, mem�riater�let felszabad�t�s�ra haszn�lj�k
			System.out.println("Kiv�telkezel�ssel oldottuk meg ez a feladatot");
		} 
		
		System.out.println("innen folytat�dik a program fut�sa");
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(eredmeny);
		//checked Exception: IO m�veletek, ford�t�si id�ben dobnak hib�t
		//unchecked Exeption: fut�si id�ben dob hib�t, 0-val val� oszt�s
		
	}

}
