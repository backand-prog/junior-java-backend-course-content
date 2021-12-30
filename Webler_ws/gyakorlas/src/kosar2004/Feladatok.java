package kosar2004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Feladatok {

	//3. feladat

	public String meccsekMadrid(List<KosarasTarolo> meccsek) {

		int madridHazaiDb = 0;
		int madridIdegenDb = 0;

		for (int i = 0; i < meccsek.size(); i++) {
			if (meccsek.get(i).getHazai().equals("Real Madrid")) {
				madridHazaiDb++;
			}

			if (meccsek.get(i).getIdegen().equals("Real Madrid")) {
				madridIdegenDb++;
			}
		}

		return ("Real Madrid: Hazai " + madridHazaiDb + ", Idegen: " + madridIdegenDb);

	}

	//4. feladat

	public boolean dontetlenek(List<KosarasTarolo> meccsek) {

		boolean dontetlen = false;
		for (KosarasTarolo item : meccsek) {
			if (item.getHazaiPont() == item.getIdegenPont()) {
				dontetlen = true;
			}
		}


		return dontetlen;


	}

	//5. feladat

	public String nevBarcelona(List<KosarasTarolo> meccsek) {
		String teljesNev = "";

		for (KosarasTarolo item : meccsek) {
			if (item.getHazai().contains("Barcelona")) {
				teljesNev = item.getHazai();
			}
		}

		return teljesNev;

	}

	//6. feladat

	public void adottDatumMeccsek(List<KosarasTarolo> meccsek) throws ParseException {

		Date datum = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2004-11-21 00:00:00");

		System.out.printf("%1$s %2$tF %3$s", "A következõ csapatok játszottak ",  datum, "\b-én:");
		System.out.println();
		for (KosarasTarolo item : meccsek) {

			if(item.getIdopont().compareTo(datum) == 0) {

				System.out.println(item.getHazai()+"-"+item.getIdegen()+" ("+item.getHazaiPont()+":"+item.getIdegenPont()+")");
				

			}

		}

	}

	public void husznalTobbMeccsStadion(List<KosarasTarolo> meccsek) {
		
		Set<String> stadionok = new HashSet<>();
		
		for (KosarasTarolo item : meccsek) {
			stadionok.add(item.getHelyszin());
		}

		Map<String, Integer> meccsOsszeg = new HashMap<>();
		for (String stadion : stadionok) {
			for (int i = 0; i < meccsek.size(); i++) {
				Integer dbTemp = 0;
				for (KosarasTarolo item : meccsek) {
					if (stadion.equals(item.getHelyszin())) {
						dbTemp++;
					}
				}
				meccsOsszeg.put(stadion, dbTemp);
			}

		}
		
		for (Map.Entry<String, Integer> item : meccsOsszeg.entrySet()) {
			if (item.getValue() > 20) {
				System.out.println(item.getKey() +": " + item.getValue());
			}
			
		}

		}

}