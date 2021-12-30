package weblerVizsga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Feladatok {
	
	//2. feladat - adatok kiírása
	public void adatokKiir(List<Kutyak> kutyak) {
		
		for (Kutyak item : kutyak) {
			
			System.out.print(item.getAzonosito());
			System.out.print(";");
			System.out.print(item.getBecenev());
			System.out.print(";");
			System.out.print(item.getFajta());
			System.out.print(";");
			System.out.print(item.getKor());
			System.out.print(";");
			System.out.print(item.getNeme());
			System.out.print(";");
			System.out.print(item.getIvartalanitott() == 1 ? "ivartalanított" : "nem ivartalanított");
			System.out.println();
			
		}
		
	}
	
	//3. feladat
	public long keverekDb(List<Kutyak> kutyak) {
		return kutyak.stream().filter(x -> x.getFajta().equals("keverék")).count();
	}
	
	//4. feladat
	
	public void bekertFajtaAdatokKiir(List<Kutyak> kutyak) {
		
		try {
			
			Boolean voltTalalat = false;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adjon meg egy fajtanevet: ");
			String keresettSzoveg = br.readLine();
			
			for (Kutyak item : kutyak) {
				if (item.getFajta().equals(keresettSzoveg)) {
					
					System.out.print(item.getAzonosito());
					System.out.print(";");
					System.out.print(item.getBecenev());
					System.out.print(";");
					System.out.print(item.getFajta());
					System.out.print(";");
					System.out.print(item.getKor());
					System.out.print(";");
					System.out.print(item.getNeme());
					System.out.print(";");
					System.out.print(item.getIvartalanitott() == 1 ? "ivartalanított" : "nem ivartalanított");
					System.out.println();
					
					voltTalalat = true;
					
				}
				
				
				
			}
			
			if (!voltTalalat) {
				
				System.out.println("Nincs a keresésnek megfelelõ kutyafajta.");
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//5. feladat
	public void vizslaKanIvartalanítottLegfeljebbKetEves(List<Kutyak> kutyak) {
		
		for (Kutyak item : kutyak) {
		
			if (item.getFajta().equals("magyar vizsla") && item.getIvartalanitott() == 1 && item.getNeme().equals("kan") && item.getKor() <= 2) {
				
				System.out.print(item.getAzonosito());
				System.out.print(";");
				System.out.print(item.getBecenev());
				System.out.print(";");
				System.out.print(item.getFajta());
				System.out.print(";");
				System.out.print(item.getKor());
				System.out.print(";");
				System.out.print(item.getNeme());
				System.out.print(";");
				System.out.print(item.getIvartalanitott() == 1 ? "ivartalanított" : "nem ivartalanított");
				System.out.println();
				
			}
			
		}
		
	}
	
	//6. feladat
	
	public void kuytafajtak(List<Kutyak> kutyak) {
		
		Set<String> kutyafajtak = new HashSet<String>();
		
		for (Kutyak item : kutyak) {
			
			kutyafajtak.add(item.getFajta());
			
		}
		
		System.out.println("Ennyi kutyafajta van: " + kutyafajtak.size());
		
		for (String item : kutyafajtak) {
			System.out.println(item);
		}

	}

}