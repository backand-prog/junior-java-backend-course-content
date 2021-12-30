package tortaGyarCukraszda;

import java.util.List;
import java.util.Scanner;



public class Feladatok {

	//2. feladat
	public void adatokKiir(List<Torta> tortaLista) {
		
		for (Torta item : tortaLista) {
			
			System.out.print(item.getAzonosito());
			System.out.print("\t");
			System.out.print(item.getMegnevezes());
			System.out.print("\t");
			System.out.print(item.getNettoAr());
			System.out.print("\t");
			System.out.print(item.getSzeletes());
			System.out.print("\t");
			System.out.print(item.getAckiosSzovegesen());
			System.out.print("\t");
			System.out.print(item.getGmSzovegesen());
			System.out.print("\t");
			System.out.print(item.getLmSzovegesen());
			System.out.println();
			
		}
		
	}
	//4. feladat
	public void legdragabbTortaKiir(List<Torta> tortaLista) {
		
		Integer maxTortaAr = tortaLista.get(0).getNettoAr();
		
		for (Torta item : tortaLista) {
			if (item.getNettoAr() > maxTortaAr) {
				maxTortaAr = item.getNettoAr();
			}
		}
		
		for (Torta item : tortaLista) {
			
			if (item.getNettoAr() == maxTortaAr) {
				
				System.out.print(item.getAzonosito());
				System.out.print(";");
				System.out.print(item.getMegnevezes());
				System.out.print(";");
				System.out.print(item.getNettoAr());
				System.out.println();
				
			}
		}
		
	}
	
	//5
	
	public void gmEsLmTortakKiir(List<Torta> tortaLista) {
		
		for (Torta item : tortaLista) {
			
			if (item.getGm() && item.getLm()) {
				
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getNettoAr());
				System.out.print("\t");
				System.out.print(item.getSzeletes());
				System.out.print("\t");
				System.out.print(item.getAckiosSzovegesen());
				System.out.print("\t");
				System.out.print(item.getGmSzovegesen());
				System.out.print("\t");
				System.out.print(item.getLmSzovegesen());
				System.out.println();
				
			}
			
		}
		
	}
	
	
	//6
	public Double gmAtlagSzeletSzamol(List<Torta> tortaLista) {
		
		int dbGmSzeletekSzama = 0;
		int gmOsszAr = 0;
		for (Torta item : tortaLista) {
			if (item.getGm()) {
				
				dbGmSzeletekSzama += item.getSzeletes();
				gmOsszAr += item.getNettoAr();
				
			}
		}
		
		return (double) (gmOsszAr / dbGmSzeletekSzama);
		
		
	}

	//7
	
	public Double akciosSzazalekSzamol(List<Torta> tortaLista) {
		double dbAkcios = 0;
		for (Torta item : tortaLista) {
			if (item.getAkcios()) {
				dbAkcios++;
			}
			
		}

		return dbAkcios/tortaLista.size()*100;
	}
	
	//8
	
	public void manulaSzerepel(List<Torta> tortaLista) {
		
		for (Torta item : tortaLista) {
			if (item.getMegnevezes().contains("mandula")) {
				
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getNettoAr());
				System.out.print("\t");
				System.out.print(item.getSzeletes());
				System.out.print("\t");
				System.out.print(item.getAckiosSzovegesen());
				System.out.print("\t");
				System.out.print(item.getGmSzovegesen());
				System.out.print("\t");
				System.out.print(item.getLmSzovegesen());
				System.out.println();
			}
		}
		
	}
	
	//9
	
	public void keresesEredmenyKiir(List<Torta> tortaLista) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kérem adjon meg egy tortanevet: ");
		String tortaNevBeolvasott = sc.nextLine();
		
		Boolean voltTalalat = false;
		
		
		for (Torta item : tortaLista) {
			
			if (item.getMegnevezes().contains(tortaNevBeolvasott)) {
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getNettoAr());
				System.out.print("\t");
				System.out.print(item.getSzeletes());
				System.out.print("\t");
				System.out.print(item.getAckiosSzovegesen());
				System.out.print("\t");
				System.out.print(item.getGmSzovegesen());
				System.out.print("\t");
				System.out.print(item.getLmSzovegesen());
				System.out.println();
				
				voltTalalat = true;
			}
			
			
				
			}
		
		if (!voltTalalat) {
			
			System.out.println("Sajnos nincs találat.");
			
		}
		
		sc.close();
		
	}

}
