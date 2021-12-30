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
		System.out.println("A rendelhet� tort�k sz�ma: " + feladatObj.rendelhetoTortakSzama(tortak));
		System.out.println("4. feladat");
		System.out.println("A legdr�b�bb torta(k):");
		feladatObj.legdragabbTortak(tortak);
		System.out.println("5.feladat");
		System.out.println("Glut�n- �s lakt�zmentes tort�k: ");
		feladatObj.glutenEsLaktozmentesTortak(tortak);
		System.out.println("6. feladat");
		System.out.println("A glut�nmentes szeletek �tlag�ra: " + String.format("%.2f", feladatObj.atlagGlutenmentesSzelet(tortak)) + " forint.");
		System.out.println("7. feladat");
		System.out.println("A rendelhet� tort�k " + String.format("%.2f", feladatObj.akciosSzazalek(tortak)) + "%-a akci�s.");
		System.out.println("8. feladat");
		System.out.println("A k�vetkez� torta (vagy tort�k) tartalmazz�k a mandula sz�t: ");
		feladatObj.mandulatTartalmazoTortanevNev(tortak);
		System.out.println("9. feladat");
		feladatObj.kereso(tortak);
		System.out.println("10. feladat");
		feladatObj.bruttoArakFajlba(tortak);


		
	}

}
