package zsebtolvajok;

public class Futtatas {

	public static void main(String[] args) {
		
		Tolvajok tolvaj1 = new Tolvajok("William M.", "Perez", 0, 0);
		Tolvajok tolvaj2 = new Tolvajok("Hector", "Fleming", 0, 0);
		int tolvaj1Probalkozasok = 0;
		for (int i = 0; i < 3; i++) {
			tolvaj1.Rabol(3, i);
			tolvaj1Probalkozasok++;
		}
		int tolvaj2Probalkozasok = 0;
		for (int i = 0; i < 2; i++) {
			tolvaj2.Rabol(4, i);
			tolvaj2Probalkozasok++;
		}
		
		System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " " + tolvaj1.getSikeresRablasokSzama() + 
				" sikeres rabl�ssal z�rta a hetet.");
		System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " " + tolvaj2.getSikeresRablasokSzama() + 
				" sikeres rabl�ssal z�rta a hetet.");
		
		System.out.println();
		
		System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " " + tolvaj1.getPenz() + " doll�rral z�rta a hetet.");
		System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " " + tolvaj2.getPenz() + " doll�rral z�rta a hetet.");
		
		System.out.println();
		
		if (tolvaj1Probalkozasok > tolvaj1.getSikeresRablasokSzama()) {
			System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " b�rt�nben van a h�t v�g�re.");
		} else {
			System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " szabadl�bon van a h�t v�g�re.");
		}
		
		if (tolvaj2Probalkozasok > tolvaj2.getSikeresRablasokSzama()) {
			System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " b�rt�nben van a h�t v�g�re.");
		} else {
			System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " szabadl�bon van a h�t v�g�re.");
		}
		
	}

}
