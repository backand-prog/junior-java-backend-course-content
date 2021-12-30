package alapok;

public class TipusokSzoveg {

	public static void main(String[] args) {
		
		//szövegek és karakterek - String és char
		
		char betu = 'R'; //szimpla aposztrof szerepel
		System.out.println(betu);
		
		String szoveg; //deklaráció
		szoveg = "teszt szöveg";
		System.out.println(szoveg);
		
		//string literal
		String szoveg2 = "teszt szöveg 2"; //deklaráció és definíció egy sorban
		
		//kiírás összefûzés (konkanettáció - concat)
		System.out.println("A szoveg valtozo tartalma: " + szoveg2 + "...");
		
		String szoveg3 = "Ez egye Java\nstring";
		System.out.println(szoveg3);
		
		//speciális karakterek
		// \n sortörés
		// \t tabulátor
		// \b backspace
		
		//formázott kiírások printf() - java11 óta elavult
		Integer egeszSzam = 4;
		System.out.printf("A szám %d, volt...", egeszSzam);
		
		//Stringkezelõ metódusok (beépítettek) - késõbb
		
		//!!!!!Stringek összehasonlítása!!!!! eltér a többi nyelvtõl == nem mûködik
		//equals -el kell megoldani
		// if (szoveg==szoveg2) - nem lesz jó
		// a hashcode-okat hasonlítja össze, amik nem ugyanazok
		// szoveg.equals(szoveg2); -> true vagy false - ÍGY A JÓ
		System.out.println();
		
		//String immutable objectek - nem lehet megváltoztati az egyes karaktereket
		//csak elérni tudom õket, megváltoztatni nem
		System.out.println(szoveg3.charAt(1));
		
		}

}