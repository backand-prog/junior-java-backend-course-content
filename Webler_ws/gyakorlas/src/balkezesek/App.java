package balkezesek;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		String fajlNev = "balkezesek.csv";
		FajlKezelo fk = new FajlKezelo();
		List<BalkezesTarolo> balkezesek = new ArrayList<>();
		balkezesek = fk.fajlBeolvas(fajlNev);
		
		
		Feladatok feladatObj = new Feladatok();
		
		
		System.out.println("1. feladat: " + feladatObj.balkezesDb(balkezesek));
		

	}

}
