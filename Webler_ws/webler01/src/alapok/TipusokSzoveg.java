package alapok;

public class TipusokSzoveg {

	public static void main(String[] args) {
		
		//sz�vegek �s karakterek - String �s char
		
		char betu = 'R'; //szimpla aposztrof szerepel
		System.out.println(betu);
		
		String szoveg; //deklar�ci�
		szoveg = "teszt sz�veg";
		System.out.println(szoveg);
		
		//string literal
		String szoveg2 = "teszt sz�veg 2"; //deklar�ci� �s defin�ci� egy sorban
		
		//ki�r�s �sszef�z�s (konkanett�ci� - concat)
		System.out.println("A szoveg valtozo tartalma: " + szoveg2 + "...");
		
		String szoveg3 = "Ez egye Java\nstring";
		System.out.println(szoveg3);
		
		//speci�lis karakterek
		// \n sort�r�s
		// \t tabul�tor
		// \b backspace
		
		//form�zott ki�r�sok printf() - java11 �ta elavult
		Integer egeszSzam = 4;
		System.out.printf("A sz�m %d, volt...", egeszSzam);
		
		//Stringkezel� met�dusok (be�p�tettek) - k�s�bb
		
		//!!!!!Stringek �sszehasonl�t�sa!!!!! elt�r a t�bbi nyelvt�l == nem m�k�dik
		//equals -el kell megoldani
		// if (szoveg==szoveg2) - nem lesz j�
		// a hashcode-okat hasonl�tja �ssze, amik nem ugyanazok
		// szoveg.equals(szoveg2); -> true vagy false - �GY A J�
		System.out.println();
		
		//String immutable objectek - nem lehet megv�ltoztati az egyes karaktereket
		//csak el�rni tudom �ket, megv�ltoztatni nem
		System.out.println(szoveg3.charAt(1));
		
		}

}