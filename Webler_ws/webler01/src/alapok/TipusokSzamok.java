package alapok;

public class TipusokSzamok {

	
	public static void main(String[] args) {
		
		//egész szám
		int szam; //deklaráció
		
		szam = 100; // definíció
		
		int szam2 = 200; //dek. és def. egy sorban
		
		System.out.println("két szám összege " + (szam + szam2));
		
		/*adattípusok - számok esetében
		byte 8 bit -128 és +127
		short 16 bit -32768 és +32767 között
		int 4byte bit kb. +-2 milliárd 
		long 8byte 
		
		float - egyszeres pontosságú lebegõontos szám (törtszám)
		double - kétszeres pontosságú lebegõpontos szám (törtszám)
		*/
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		double tortSzam = 10 / 3;
		System.out.println(tortSzam); //adatvesztés
		
		//hogyan lehet megoldani az adatvesztést?
		
		//1. módszer
		double tortSzam2 = 10/3.0;
		System.out.println(tortSzam2);
		
		//2.módszer
		double tortSzam3 = 10/3f;   // ----> az f azt jelenti, hogy floatként kezeld
		System.out.println(tortSzam3);
		
		//3.módszer - típuskényszerítés (castolás)
		
		double tortSzam4 = (double)10/3;
		System.out.println(tortSzam4);
		
		//int és Integer között különbség?
		//az int az primitív típus 
			//amikor így veszem fel, akkor a memóriába fizikailag is belekerül
			//int szam = 5;
			// | | | | | | | | |5| | | | | | |
		//az Integer egy object
			//ebben az esetben csak a cím kerül bele
			//Integer szamObj = 48   ---> csak egy hash kódot, ez kerül bele a memóriába
											//referenciacím alapján
			//szamObj sz2 = 2   ----> ez nem új változó, hanem ugyanoda mutat
		
		@SuppressWarnings("unused")
		Integer szamObj = null;
		
		// int szam = null;  --> ez hibára fut, mert csak object vehet fel nullt
	}

}