package tortaGyarCukraszda;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Torta> tortaLista = new ArrayList<Torta>();
		FajlKezelo fk = new FajlKezelo();
		tortaLista = fk.fajlBeolvas("tortaGyar.csv");

		
		System.out.println("1. feladat - f�jlbeolvas�s: k�sz");
		//System.out.println(tortaLista.get(0).getAzonosito());
		//System.out.println(tortaLista.size());
		
		Feladatok feladatObj = new Feladatok();
		System.out.println("2. feladat - adatok");
		feladatObj.adatokKiir(tortaLista);
		System.out.println();
		
		System.out.println("3. feladat- h�ny f�le torta rendelhet�:");
		System.out.println(tortaLista.size());
		System.out.println();
		
		System.out.println("4. feladat - melyik a legdr�g�bb torta:");
		feladatObj.legdragabbTortaKiir(tortaLista);
		System.out.println();
		
		System.out.println("5. feladat - lakt�z �s glut�nmentes tort�k:");
		feladatObj.gmEsLmTortakKiir(tortaLista);
		System.out.println();
		
		System.out.println("6. feladat - �tlagosan mennyibe ker�l egy szelet glut�nmentes:");
		System.out.println(feladatObj.gmAtlagSzeletSzamol(tortaLista));
		System.out.println();
		
		System.out.println("7. feladat - tort�k h�ny sz�zal�ka akci�s");
		System.out.println(feladatObj.akciosSzazalekSzamol(tortaLista));
		System.out.println();
		
		System.out.println("8. feladat - mandula sz� szerepel benne");
		
		System.out.println();
		
		System.out.println("9. feladat - keres� (tartalmaz�s vizsg�lattal)");
		feladatObj.keresesEredmenyKiir(tortaLista);
		System.out.println();
		
		System.out.println("10. feladat - tortaGyar_brutto.scv:");
		fk.bruttoArakFajlbaIr(tortaLista);
		System.out.println();

	}

}
