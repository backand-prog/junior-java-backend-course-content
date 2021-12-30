package kezisek;

import java.util.List;

public class Feladatok {

	//a feladat
	
	public void jatekosokKiir(List<JatekosTarolo> jatekosok) {
		
		for (int i = 0; i < jatekosok.size(); i++) {
			
			System.out.print(jatekosok.get(i).getAzonosito());
			System.out.print(" ");
			System.out.print(jatekosok.get(i).getNev());
			System.out.print(" ");
			System.out.print(jatekosok.get(i).getPoszt());
			System.out.print(" ");
			System.out.print(jatekosok.get(i).getGolokSzama());
			System.out.print(" ");
			if (jatekosok.get(i).getSerult()) {
				System.out.print("S�r�lt");
			} else {
				System.out.print("Nem s�r�lt");
			}
			System.out.print(" ");
			System.out.print(jatekosok.get(i).getMerkozesekSzama());
			System.out.println();
			
		}
		
	}
	
	//b feladat
	
	public Integer osszesIranyitoGol (List<JatekosTarolo> jatekosok) {
		
		Integer golSum = 0;
		
		for (int i = 0; i < jatekosok.size(); i++) {
			
			if (jatekosok.get(i).getPoszt().equals("ir�ny�t�")) {
				
				golSum += jatekosok.get(i).golokSzama; 
				
			}
			
		}
		
		return golSum;
		
	}
	
	//c feladat
	
	public Integer nemSerultKapusok (List<JatekosTarolo> jatekosok) {
		
		Integer nemSerultKapusSum = 0;
		
		for (int i = 0; i < jatekosok.size(); i++) {
			
			if (jatekosok.get(i).getPoszt().equals("kapus") && jatekosok.get(i).getSerult() == false) {
				
				nemSerultKapusSum++;
				
			}
			
		}
		
		return nemSerultKapusSum;
		
	}
	
	//d feladat
	public void legtobbGoltSzerzo (List<JatekosTarolo> jatekosok) {
		
		int maxGol = jatekosok.get(0).getGolokSzama();
		
		for (int i = 0; i < jatekosok.size(); i++) {
			if (jatekosok.get(i).getGolokSzama() > maxGol) {
				maxGol = jatekosok.get(i).getGolokSzama();
			}
		}
		System.out.println("Ez(ek) a j�t�kos(ok) a legt�bb g�lt szerz�(k): ");
		for (int i = 0; i < jatekosok.size(); i++) {
			if (jatekosok.get(i).getGolokSzama() == maxGol) {
				System.out.print(jatekosok.get(i).getAzonosito());
				System.out.print(" ");
				System.out.print(jatekosok.get(i).getNev());
				System.out.print(" ");
				System.out.print(jatekosok.get(i).getGolokSzama());
				System.out.println();
			}
		}
		
	}
	
	//e feladat
	
	public int legalabb13Merkozes (List<JatekosTarolo> jatekosok) {
		
		int legalabb13MeccsDb = 0;
		
		for (int i = 0; i < jatekosok.size(); i++) {
			
			if (jatekosok.get(i).getMerkozesekSzama() >= 13) {
				legalabb13MeccsDb++;
			}
			
		}
		
		return legalabb13MeccsDb;
	}
	
	 //f feladat
	
	public void tobbMintOtvenGoltSzerzok (List<JatekosTarolo> jatekosok) {
		
		for (int i = 0; i < jatekosok.size(); i++) {
			if (jatekosok.get(i).getGolokSzama() > 50) {
				System.out.print(jatekosok.get(i).getAzonosito());
				System.out.print(" ");
				System.out.print(jatekosok.get(i).getNev());
				System.out.print(" ");
				System.out.print(jatekosok.get(i).getGolokSzama());
				System.out.println();
			}
		}
		
	}
	
	public List<JatekosTarolo> jatekosCsere (List<JatekosTarolo> jatekosok) {
		
		for (int i = 0; i < jatekosok.size(); i++) {
			if (jatekosok.get(i).getAzonosito() == 18 || jatekosok.get(i).getAzonosito() == 81) {
				
				jatekosok.remove(i);
			}
			
		}
		
		for (int i = 0; i < jatekosok.size(); i++) {
			
			jatekosok.get(i).setGolokSzama(Byte.parseByte("0"));			
			jatekosok.get(i).setSerult(false);;	
			jatekosok.get(i).setMerkozesekSzama(Byte.parseByte("0"));			
			
			}
		
		JatekosTarolo ujJatekos1 = new JatekosTarolo();
		
		ujJatekos1.setAzonosito(Byte.parseByte("93"));
		ujJatekos1.setNev("Kiss Ram�na");
		ujJatekos1.setPoszt("balsz�ls�");
		ujJatekos1.setGolokSzama((byte) 0);
		ujJatekos1.setSerult(false);
		ujJatekos1.setMerkozesekSzama((byte) 0);
	
		JatekosTarolo ujJatekos2 = new JatekosTarolo();
	
		ujJatekos2.setAzonosito(Byte.parseByte("78"));
		ujJatekos2.setNev("Tak�cs S�ra");
		ujJatekos2.setPoszt("jobb�tl�v�");
		ujJatekos2.setSerult(false);
		ujJatekos2.setGolokSzama((byte) 0);
		ujJatekos2.setMerkozesekSzama((byte) 0);
		
		
		jatekosok.add(ujJatekos1);
		jatekosok.add(ujJatekos2);
		
		return jatekosok;
	}
	
	
}
