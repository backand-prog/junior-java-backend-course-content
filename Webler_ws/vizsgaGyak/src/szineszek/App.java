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
		System.out.println("A Berlinben születettek száma: " + feladatObj.berlinbenSzuletettDb(szineszek));
		System.out.println();
		
		System.out.println("d. feladat");
		System.out.println("Az USA-ban született férfiak száma: " + feladatObj.usabanSzuletettFerfiDb(szineszek));
		System.out.println();
		
		System.out.println("e. feladat");
		feladatObj.fiatalSzineszekFajlba(szineszek);
		System.out.println();
		
		System.out.println("f. feladat");
		System.out.println("Az olaszországban születettek összes filmszáma: " + feladatObj.olaszorszagbanSzulOsszesFilm(szineszek));
		System.out.println();
		
		System.out.println("g. feladat");
		System.out.println("A legfiatalabb férfi színész: " + feladatObj.legfiatalabbFerfiSzinesz(szineszek));
		System.out.println("A legfiatalabb nõi színész: " + feladatObj.legfiatalabbNoiSzinesz(szineszek));
		System.out.println();
		
		System.out.println("h. feladat");
		System.out.println("A legidõsebb színész: " + feladatObj.legIdosebbSzinesz(szineszek));
		System.out.println();
		
		System.out.println("i. feladat");
		System.out.println("Szeptemberben születettek: ");
		feladatObj.szeptemberbenSzuletettek(szineszek);
		System.out.println();
		
		System.out.println("j. feladat");
		System.out.println("A letöbb színész ebben az országban született: " + feladatObj.legtobbSzineszSzuletettOrszag(szineszek));
		System.out.println();
		
		
		System.out.println("k. feladat");
		System.out.println("Szombaton születetettek:");
		feladatObj.szombatonSzuletettek(szineszek);

	}

}
