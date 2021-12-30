package ingatlan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Feladatok {

	
	//a feladat
	public void adatokKiir(List<IngatlanTarolo> ingatlanok) {
		for (IngatlanTarolo item : ingatlanok) {
			System.out.print(item.getAzonosíto());
			System.out.print("\t");
			System.out.print(item.getKerulet());
			System.out.print("\t");
			System.out.print(item.getAlapterulet());
			System.out.print("\t");
			System.out.print(item.getSzobakSzama());
			System.out.print("\t");
			System.out.print(item.getErtekesitoNeve());
			System.out.print("\t");
			if (item.getEladva()) {
				System.out.print("Eladva");
			} else {
				System.out.print("Nincs eladva");
			}		
			
			System.out.println();
			
		}
		
	}
	
	//b feladat
	
	public int rekordokDarab(List<IngatlanTarolo> ingatlanok) {
		return ingatlanok.size();
		
	}
	
	//c feladat
	
	public int tizenegyKerDarab(List<IngatlanTarolo> ingatlanok) {
		int darab = 0;
		
		for (IngatlanTarolo item : ingatlanok) {
			if (item.getKerulet().equals("11")) {
				darab++;
			}
		
		}
		
		return darab;
	}
	
	//d feladat
	public void soldByGivenAgent(List<IngatlanTarolo> ingatlanok, String agent) {
		
		for (IngatlanTarolo item : ingatlanok) {
			if (item.getErtekesitoNeve().equals(agent)) {
				System.out.print(item.getAzonosíto());
				System.out.print("\t");
				System.out.print(item.getKerulet());
				System.out.print("\t");
				System.out.print(item.getAlapterulet());
				System.out.print("\t");
				System.out.print(item.getSzobakSzama());
				System.out.println();
			}
		}
	}
		//e feladat
		public double negySzobasAtlagTerulet(List<IngatlanTarolo> ingatlanok) {
				int sum = 0;
				int darab = 0;
				for (IngatlanTarolo item : ingatlanok) {
					if (item.getSzobakSzama() == 4) {
						sum+=item.getAlapterulet();
						darab++;	
					}
						
				}
				return (double)sum/darab;	
	
		}
		
		//f feladat
		public void hetKerMin80NmNincsEladva(List<IngatlanTarolo> ingatlanok) {
			for (IngatlanTarolo item: ingatlanok) {
				if (item.getKerulet().equals("11") && item.getAlapterulet() >= 80 && !item.getEladva()) {
					System.out.print(item.getAzonosíto());
					System.out.print("\t");
					System.out.print(item.getAlapterulet());
					System.out.print("\t");
					System.out.print(item.getErtekesitoNeve());
					System.out.println();
					
			}
		}
			
	}
	
	public void ujIngatlan(List<IngatlanTarolo> ingatlanok) {
		
		IngatlanTarolo ingatlanObj = new IngatlanTarolo();
		ingatlanObj.setAzonosíto("38123");
		ingatlanObj.setKerulet("15");
		ingatlanObj.setAlapterulet((Short.parseShort("35")));
		ingatlanObj.setSzobakSzama(Byte.parseByte("1"));
		ingatlanObj.setErtekesitoNeve("Mészáros Erika");
		ingatlanObj.setEladva(false);
		
		ingatlanok.add(ingatlanObj);
		
		try {
			FileWriter fw = new FileWriter("ingatlan_uj.txt", false);
			for (IngatlanTarolo item : ingatlanok) {
				fw.write(item.getAzonosíto());
				fw.write(";");
				fw.write(item.getKerulet());
				fw.write(";");
				fw.write(item.getAlapterulet().toString());
				fw.write(";");
				fw.write(item.getSzobakSzama().toString());
				fw.write(";");
				fw.write(item.getErtekesitoNeve());
				fw.write(";");
				if (item.getEladva()) {
					fw.write("1");
				} else {
					fw.write("0");
				}
				
				fw.write("\r\n");
				
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("A fájl elkészült.");
		
	}
		
}
	
	

