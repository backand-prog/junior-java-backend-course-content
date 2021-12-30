package hasznaltAutokStream;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<AutoTarolo> autok = new ArrayList<>();
		String fajlNev = "hasznalt_autok.txt";
		FajlKezelo fkObj = new FajlKezelo();
		autok = fkObj.fajlBeolvas(fajlNev);
		
		Feladatok feladatObj = new Feladatok();
		
		//a. feladat
		System.out.println("a. feladat");
		feladatObj.adatokKiir(autok);
		System.out.println();
		
		//b. feladat
		System.out.println("b. feladat");
		System.out.println("Ennyi aut� szerepel a nyilv�ntart�sban: " + feladatObj.autokDb(autok) + " darab.");
		System.out.println();
		
		//c. feladat
		System.out.println("c. feladat");
		System.out.println("A benzin aut�k �tlag�ra: " + Math.round(feladatObj.atlagArBenzin(autok).getAsDouble()) + " forint.");
		System.out.println();
		
		//d. feladat
		System.out.println("d. feladat");
		System.out.println("D�zel aut�k �tlagosan megtett km: " + Math.round(feladatObj.atlagKilometerDizel(autok).getAsDouble()) + " kilom�ter.");
		System.out.println();
		
		//e. feladat
		System.out.println("e. feladat");
		System.out.println(feladatObj.hibridSzerepelNyilvantartasban(autok) ? "Van hibrid aut�." : "Nincs hibrid aut�.");
		System.out.println();
		
		//f. feladat
		feladatObj.hibasSor(autok);
		
		feladatObj.ujAuto(autok);
		
	}

}
