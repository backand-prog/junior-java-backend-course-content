package kivetelKezeles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KivetelKezeles {

	public static void main(String[] args) {
		// Kivételkezelés: ha a program gibára futna, akkor mi történjen.
		// Hiba esetén átvesszük a vezérlést a fordítótól.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Kérem adjon meg egy egész számot: ");
			int szamBekert = Integer.parseInt(br.readLine());
			System.out.println("A megadott szám ez volt: " + szamBekert);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			//Ebbe az ágba akkor megy bele, ha pld szöveget vagy törtszámot adtunk meg.
			System.out.println("Egész számot kértem!!");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println();
			System.out.println("Bezártad az olvasó adatfolyamot, így nem lesz jó...");
		} catch (Exception e) {
			System.out.println("Valamilyen hiba történt, sajnáljuk...");
		}
		
		//A legspeciálisabb kivételtõl megyünk a legáltalánosabbig - FONTOS SZABÁLY
		
		//fontosak:
		//ArrayyIndexOutOfBoundException - olyan elemre hivatkozok a tömbnél, ami nincsen
		//IOException - fájkezeléses mûveletek
		//FileNotFoundException - nem találja a megadon helyen a fájlt
		//saját kivételkezelõ osztályt is létrehozhatunk		
		
		//Feladat: Kérjünk be két egész sázmot hibakezeléssel, osszuk el az elsõt a másodikkal
		//0-val való osztásra figyelni kell
		
		
		//deklaráció
		double eredmeny = 0.0;
		
		try {
			System.out.println("Kérem adja meg az osztandót:" );
			int osztando = Integer.parseInt(br.readLine());
			System.out.println("Kérem adja meg az osztót:" );
			int oszto = Integer.parseInt(br.readLine());
			eredmeny = (double)osztando/oszto; //definició
			System.out.println(eredmeny);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Egész számot kértem...");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0-val való osztás...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("I/O hiba történt.");
		} finally {
			//nem kötelezõ eleme a try-catch szerkezetnek
			//mindenképpen lefut
			//tisztogatásra, memóriaterület felszabadítására használják
			System.out.println("Kivételkezeléssel oldottuk meg ez a feladatot");
		} 
		
		System.out.println("innen folytatódik a program futása");
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(eredmeny);
		//checked Exception: IO mûveletek, fordítási idõben dobnak hibát
		//unchecked Exeption: futási idõben dob hibát, 0-val való osztás
		
	}

}
