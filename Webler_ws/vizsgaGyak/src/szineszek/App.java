package szineszek;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<SzineszTarolo> szineszek = new ArrayList<>();
		FajlKezelo fk = new FajlKezelo();
		String fajlNev = "szineszek.txt";
		szineszek = fk.fajlBeolvas(fajlNev);
		
		Feladatok feladatObj = new Feladatok();
		
		//a feladat
		feladatObj.adatokKiir(szineszek);
		System.out.println();

		System.out.println("b. feladat");
		feladatObj.budapestenSzuletettFilmSzamKiir(szineszek);
		System.out.println();
		
		System.out.println("c. feladat");
		System.out.println("A Berlinben sz�letettek sz�ma: " + feladatObj.berlinbenSzuletettDb(szineszek));
		System.out.println();
		
		System.out.println("d. feladat");
		System.out.println("Az USA-ban sz�letett f�rfiak sz�ma: " + feladatObj.usabanSzuletettFerfiDb(szineszek));
		System.out.println();
		
		System.out.println("e. feladat");
		feladatObj.fiatalSzineszekFajlba(szineszek);
		System.out.println();
		
		System.out.println("f. feladat");
		System.out.println("Az olaszorsz�gban sz�letettek �sszes filmsz�ma: " + feladatObj.olaszorszagbanSzulOsszesFilm(szineszek));
		System.out.println();
		
		System.out.println("g. feladat");
		System.out.println("A legfiatalabb f�rfi sz�n�sz: " + feladatObj.legfiatalabbFerfiSzinesz(szineszek));
		System.out.println("A legfiatalabb n�i sz�n�sz: " + feladatObj.legfiatalabbNoiSzinesz(szineszek));
		System.out.println();
		
		System.out.println("h. feladat");
		System.out.println("A legid�sebb sz�n�sz: " + feladatObj.legIdosebbSzinesz(szineszek));
		System.out.println();
		
		System.out.println("i. feladat");
		System.out.println("Szeptemberben sz�letettek: ");
		feladatObj.szeptemberbenSzuletettek(szineszek);
		System.out.println();
		
		System.out.println("j. feladat");
		System.out.println("A let�bb sz�n�sz ebben az orsz�gban sz�letett: " + feladatObj.legtobbSzineszSzuletettOrszag(szineszek));
		System.out.println();
		
		
		System.out.println("k. feladat");
		System.out.println("Szombaton sz�letetettek:");
		feladatObj.szombatonSzuletettek(szineszek);

	}

}
