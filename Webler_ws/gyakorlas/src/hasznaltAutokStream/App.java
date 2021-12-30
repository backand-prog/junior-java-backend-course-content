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
		System.out.println("Ennyi autó szerepel a nyilvántartásban: " + feladatObj.autokDb(autok) + " darab.");
		System.out.println();
		
		//c. feladat
		System.out.println("c. feladat");
		System.out.println("A benzin autók átlagára: " + Math.round(feladatObj.atlagArBenzin(autok).getAsDouble()) + " forint.");
		System.out.println();
		
		//d. feladat
		System.out.println("d. feladat");
		System.out.println("Dízel autók átlagosan megtett km: " + Math.round(feladatObj.atlagKilometerDizel(autok).getAsDouble()) + " kilométer.");
		System.out.println();
		
		//e. feladat
		System.out.println("e. feladat");
		System.out.println(feladatObj.hibridSzerepelNyilvantartasban(autok) ? "Van hibrid autó." : "Nincs hibrid autó.");
		System.out.println();
		
		//f. feladat
		feladatObj.hibasSor(autok);
		
		feladatObj.ujAuto(autok);
		
	}

}
