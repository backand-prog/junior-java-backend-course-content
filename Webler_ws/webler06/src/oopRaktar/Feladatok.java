package oopRaktar;

import java.util.List;

public class Feladatok {

	//c feladat
	
	public void hibasLeltarSzamuAdatTorol(List<EszkozTarolo> termekLista) {
		
		for (int i = 0; i < termekLista.size(); i++) {
			if (termekLista.get(i).getLeltarSzam().length() != 10) {
				termekLista.remove(i);
			}
		}
		
	}
	
	//d feladat - adatok kiírása
	public void adatokKiir(List<EszkozTarolo> termekLista) {
		for (EszkozTarolo item : termekLista) {
			System.out.print(item.getLeltarSzam());
			System.out.print(";");
			System.out.print(item.getMegnevezes());
			System.out.print(";");
			switch (item.getKategoriaId()) {
			case 1:
				System.out.print("Asztali PC");
				break;	
			case 2:
				System.out.print("Notebook");
				break;
			case 3:
				System.out.print("Periféria");
				break;
			default:
				System.out.print("Hibás adat...");
				break;
			}
			System.out.print(";");
			System.out.print(item.getAr());
			System.out.print(";");
			System.out.print(item.getRaktarMennyiseg());
			System.out.print(";");
			System.out.printf("%tF", item.getFeltoltesDatum());
			System.out.print(";");
			String akcios = item.getAkcios() ? "Akciós" : "Nem akciós";
			System.out.print(akcios);
			System.out.println();;
			
		}
	}
	
	//e feladat
	
	public Integer akciosTermekekRaktarMennyisegeMeghataroz(List<EszkozTarolo> termekLista) {
		Integer akciosDb = 0;
		for (EszkozTarolo item : termekLista) {
			if (item.getAkcios()) {
				akciosDb += item.getRaktarMennyiseg();
			}
		}
		
		return akciosDb;
	}
	
	//f feladat
	public void notebookfajtaDbKiir(List<EszkozTarolo> termekLista) {
		Integer notebookDb = 0;
		for (EszkozTarolo item : termekLista) {
			if (item.getKategoriaId() == 2)
				notebookDb++;
		}
		
		System.out.println("Ennyi notebook fajta van: " + notebookDb);
	}
	
	//g feladat 
	public void legdragabbNotebookKiir(List<EszkozTarolo> termekLista) {
		
		Integer maxNoteBookAr = termekLista.get(0).getAr();
		for (EszkozTarolo item : termekLista) {
			if (item.getAr() > maxNoteBookAr && item.getKategoriaId() == 2) {
				maxNoteBookAr = item.getAr();
			}
			
		}
		
		for (EszkozTarolo item : termekLista) {
			if (item.getAr() == maxNoteBookAr && item.getKategoriaId() == 2) {
				System.out.print(item.getLeltarSzam());
				System.out.print(";");
				System.out.print(item.getMegnevezes());
				System.out.print(";");
				System.out.print(item.getAr());
				System.out.println();
			}
		}
		
	}
	
	//h feladat
	
	public double notebookAtlagArMeghataroz(List<EszkozTarolo> termekLista) {
		int notebookDb = 0;
		int notebookOsszAr = 0;
		
		for (EszkozTarolo item : termekLista) {
			if (item.getKategoriaId() == 2) {
				notebookDb++;
				notebookOsszAr+=item.getAr();
			}
			
			
			
		}
		
		return (double) notebookOsszAr / notebookDb;
		
	}
	
	//i feladat
	public void legOlcsobbAsztaliPcRogzitesIdejeKiir(List<EszkozTarolo> termekLista) {
		
		int minAsztaliPcAr = Integer.MAX_VALUE;
		for (EszkozTarolo item : termekLista) {
			if (item.getAr()<minAsztaliPcAr && item.getKategoriaId()==1) {
				minAsztaliPcAr = item.getAr();
			}
		}
		
		for (EszkozTarolo item : termekLista) {
			if (item.getAr() == minAsztaliPcAr && item.getKategoriaId()==1) {
				System.out.print(item.getLeltarSzam());
				System.out.print(";");
				System.out.print(item.getAr());
				System.out.print((";"));
				System.out.printf("%tF", item.getFeltoltesDatum());
				System.out.println();
				
			}
		}
	}
	
	public void legtobbPeriferiaRaktaronKiir(List<EszkozTarolo> termekLista) {
		int maxRaktarMennyisegPeriferia = Integer.MIN_VALUE;
		
		for (EszkozTarolo item : termekLista) {
			if (item.getRaktarMennyiseg() > maxRaktarMennyisegPeriferia && item.getKategoriaId()==3) {
				maxRaktarMennyisegPeriferia = item.getRaktarMennyiseg();
			}
		}
		
		for (EszkozTarolo item : termekLista) {
			if (item.getRaktarMennyiseg() == maxRaktarMennyisegPeriferia && item.getKategoriaId()==3) {
				System.out.print(item.getLeltarSzam());
				System.out.print(";");
				System.out.print(item.getRaktarMennyiseg());
				System.out.println();
				
			}
		}
	}
	
	
	
	
	
	
}
