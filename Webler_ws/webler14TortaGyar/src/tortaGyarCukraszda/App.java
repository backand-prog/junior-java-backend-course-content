package tortaGyarCukraszda;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Torta> tortaLista = new ArrayList<Torta>();
		FajlKezelo fk = new FajlKezelo();
		tortaLista = fk.fajlBeolvas("tortaGyar.csv");

		
		System.out.println("1. feladat - fájlbeolvasás: kész");
		//System.out.println(tortaLista.get(0).getAzonosito());
		//System.out.println(tortaLista.size());
		
		Feladatok feladatObj = new Feladatok();
		System.out.println("2. feladat - adatok");
		feladatObj.adatokKiir(tortaLista);
		System.out.println();
		
		System.out.println("3. feladat- hány féle torta rendelhetõ:");
		System.out.println(tortaLista.size());
		System.out.println();
		
		System.out.println("4. feladat - melyik a legdrágább torta:");
		feladatObj.legdragabbTortaKiir(tortaLista);
		System.out.println();
		
		System.out.println("5. feladat - laktóz és gluténmentes torták:");
		feladatObj.gmEsLmTortakKiir(tortaLista);
		System.out.println();
		
		System.out.println("6. feladat - átlagosan mennyibe kerül egy szelet gluténmentes:");
		System.out.println(feladatObj.gmAtlagSzeletSzamol(tortaLista));
		System.out.println();
		
		System.out.println("7. feladat - torták hány százaléka akciós");
		System.out.println(feladatObj.akciosSzazalekSzamol(tortaLista));
		System.out.println();
		
		System.out.println("8. feladat - mandula szó szerepel benne");
		
		System.out.println();
		
		System.out.println("9. feladat - keresõ (tartalmazás vizsgálattal)");
		feladatObj.keresesEredmenyKiir(tortaLista);
		System.out.println();
		
		System.out.println("10. feladat - tortaGyar_brutto.scv:");
		fk.bruttoArakFajlbaIr(tortaLista);
		System.out.println();

	}

}
