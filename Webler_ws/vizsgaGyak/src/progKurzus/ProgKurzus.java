package progKurzus;

import java.util.List;

public class ProgKurzus {
	
	public int beiratkozottFo(List<Tanulok> tanulok) {
		
		return (int) tanulok.stream().count();

	}
	
	public float atlagNemSzerint(List<Tanulok> tanulok, String nem) {
		
		float atlag = 0.0F;
		float count = 0.0F;
		float sum = 0.0F;
		
		for (int i = 0; i < tanulok.size(); i++) {
			
			if (tanulok.get(i).getNem().equals(nem)) {
				count+=4;
				sum += tanulok.get(i).getProgEredmeny();
				sum += tanulok.get(i).getGrafEredmeny();
				sum += tanulok.get(i).getMestintEredmeny();
				sum += tanulok.get(i).getArchitektEredmeny();
			}
			
		}
		
		atlag = sum / count;
		
		return atlag;
		
	}
	
	public void fizetesselElmaradtTanulokKiir(List<Tanulok> tanulok, int honap) {

		for (Tanulok item : tanulok) {

			if (item.getFinanszKod() == 0 && item.getBefizetettOsszeg() < 2600) {
				System.out.println("\t" + item.getNev());
			} else if (item.getFinanszKod() == 1 && item.getBefizetettOsszeg() < (honap * 312)) {
				System.out.println("\t" + item.getNev());
			} else if (item.getFinanszKod() == 2 && item.getBefizetettOsszeg() < 4000 && honap > 10) {
				System.out.println("\t" + item.getNev());
			}
		}
		
	}
	
	public void allasajanlatotKap(List<Tanulok> tanulok) {
		
		for (Tanulok item : tanulok) {
			
			if (item.getFinanszKod() == 2 && item.getBefizetettOsszeg() == 0 && item.getProgEredmeny() > 50 && item.getMestintEredmeny() > 50 && item.getGrafEredmeny() > 50 && item.getArchitektEredmeny() > 50) {
				
				int szazalekSum = item.getProgEredmeny() + item.getMestintEredmeny() + item.getGrafEredmeny() + item.getArchitektEredmeny();
				System.out.println(item.getNev() + " " +szazalekSum);
			}
			
		}
		
		
	}

}
