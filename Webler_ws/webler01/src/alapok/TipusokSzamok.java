package alapok;

public class TipusokSzamok {

	
	public static void main(String[] args) {
		
		//eg�sz sz�m
		int szam; //deklar�ci�
		
		szam = 100; // defin�ci�
		
		int szam2 = 200; //dek. �s def. egy sorban
		
		System.out.println("k�t sz�m �sszege " + (szam + szam2));
		
		/*adatt�pusok - sz�mok eset�ben
		byte 8 bit -128 �s +127
		short 16 bit -32768 �s +32767 k�z�tt
		int 4byte bit kb. +-2 milli�rd 
		long 8byte 
		
		float - egyszeres pontoss�g� lebeg�ontos sz�m (t�rtsz�m)
		double - k�tszeres pontoss�g� lebeg�pontos sz�m (t�rtsz�m)
		*/
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		double tortSzam = 10 / 3;
		System.out.println(tortSzam); //adatveszt�s
		
		//hogyan lehet megoldani az adatveszt�st?
		
		//1. m�dszer
		double tortSzam2 = 10/3.0;
		System.out.println(tortSzam2);
		
		//2.m�dszer
		double tortSzam3 = 10/3f;   // ----> az f azt jelenti, hogy floatk�nt kezeld
		System.out.println(tortSzam3);
		
		//3.m�dszer - t�pusk�nyszer�t�s (castol�s)
		
		double tortSzam4 = (double)10/3;
		System.out.println(tortSzam4);
		
		//int �s Integer k�z�tt k�l�nbs�g?
		//az int az primit�v t�pus 
			//amikor �gy veszem fel, akkor a mem�ri�ba fizikailag is beleker�l
			//int szam = 5;
			// | | | | | | | | |5| | | | | | |
		//az Integer egy object
			//ebben az esetben csak a c�m ker�l bele
			//Integer szamObj = 48   ---> csak egy hash k�dot, ez ker�l bele a mem�ri�ba
											//referenciac�m alapj�n
			//szamObj sz2 = 2   ----> ez nem �j v�ltoz�, hanem ugyanoda mutat
		
		@SuppressWarnings("unused")
		Integer szamObj = null;
		
		// int szam = null;  --> ez hib�ra fut, mert csak object vehet fel nullt
	}

}