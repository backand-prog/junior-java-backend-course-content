package progKurzus;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		String fajlNev = "kurzus.txt";
		List<Tanulok> tanulok = new ArrayList<Tanulok>();
		FajlKezelo fk = new FajlKezelo();
		ProgKurzus feladatObj = new ProgKurzus();
		
		
		
		int honap = 5;
		
		tanulok = fk.fajlBeolvas(fajlNev);
		System.out.println(tanulok.get(0).getNev());
		System.out.println("3. feladat:");
		System.out.println("\tA tanfolyamra " + feladatObj.beiratkozottFo(tanulok) + " f? iratkozott be.");
		System.out.println("4. feladat:");
		System.out.println("\tFi?k ?tlagteljes?tm?nye: " + String.format("%.2f", feladatObj.atlagNemSzerint(tanulok, "m")) + "%");
		System.out.println("\tL?nyok ?tlagteljes?tm?nye: " + String.format("%.2f", feladatObj.atlagNemSzerint(tanulok, "f")) + "%");
		System.out.println("5. feladat:");
		System.out.println("\tA k?vetkez? di?koknak van tand?jelmarad?sa:");
		feladatObj.fizetesselElmaradtTanulokKiir(tanulok, honap);
		System.out.println("6. feladat:");
		feladatObj.allasajanlatotKap(tanulok);
		
		fk.fajlbaIr(tanulok);


	}

}
