package tortaGyar;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Tortak> tortak = new ArrayList<Tortak>();
		String fajlNev = "tortaGyar.csv";
		tortak = new FajlKezelo().fajlBeolvas(fajlNev);
		Feladatok feladatObj = new Feladatok();

		feladatObj.adatokKiir(tortak);

		System.out.println("3. feladat");
		System.out.println("A rendelhetõ torták száma: " + feladatObj.rendelhetoTortakSzama(tortak));
		System.out.println("4. feladat");
		System.out.println("A legdrábább torta(k):");
		feladatObj.legdragabbTortak(tortak);
		System.out.println("5.feladat");
		System.out.println("Glutén- és laktózmentes torták: ");
		feladatObj.glutenEsLaktozmentesTortak(tortak);
		System.out.println("6. feladat");
		System.out.println("A gluténmentes szeletek átlagára: " + String.format("%.2f", feladatObj.atlagGlutenmentesSzelet(tortak)) + " forint.");
		System.out.println("7. feladat");
		System.out.println("A rendelhetõ torták " + String.format("%.2f", feladatObj.akciosSzazalek(tortak)) + "%-a akciós.");
		System.out.println("8. feladat");
		System.out.println("A következõ torta (vagy torták) tartalmazzák a mandula szót: ");
		feladatObj.mandulatTartalmazoTortanevNev(tortak);
		System.out.println("9. feladat");
		feladatObj.kereso(tortak);
		System.out.println("10. feladat");
		feladatObj.bruttoArakFajlba(tortak);


		
	}

}
