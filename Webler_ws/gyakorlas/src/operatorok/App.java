package operatorok;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<OperatorTarolo> kifejezesek = new ArrayList<>();
		FajlKezelo fk = new FajlKezelo();
		
		String fajlNev = "kifejezesek.txt";
		
		kifejezesek = fk.fajlBeolvas(fajlNev);
		
		Feladatok feladatObj = new Feladatok();
		
		//2. feladat
		System.out.println("2. feladat");
		System.out.println("A kifejezések száma: " + feladatObj.kifejezesDb(kifejezesek));
		System.out.println();
		
		//3. feladat
		System.out.println("3. feladat");
		System.out.println("A maradékos osztás mûveletek darabszáma: " + feladatObj.maradekosDb(kifejezesek));
		System.out.println();
		
		//4. feladat
		System.out.println("4. feladat");
		System.out.println(feladatObj.mindketOperandusTizzelOszthatoEldont(kifejezesek) ? "Van benne..." : "Nincs benne...");
		System.out.println();
		
		//5. feladat
		System.out.println("5. feladat");
		feladatObj.muveletekStatisztika(kifejezesek);
		System.out.println();
		
		//7. feladat
		feladatObj.szamoloGep();
		
		//8. feladat
		fk.eredmenyekFajlba(kifejezesek);
		System.out.println("A fájl elkészült.");

	}

}
