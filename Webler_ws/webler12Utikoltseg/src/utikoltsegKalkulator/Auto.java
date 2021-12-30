package utikoltsegKalkulator;

import java.time.LocalDate;

public class Auto {

	private String rendSzam = null;
	private double fogyasztas = 0;
	private String uzemAnyagTipus = null;
	private int szallithatoSzemelyekSzama = 0;
	private int motorTerfogat = 0;
	private int gyartasiEv = 0;
	
	
	public String getRendSzam() {
		return rendSzam;
	}
	public void setRendSzam(String rendSzam) {
		this.rendSzam = rendSzam;
	}
	public double getFogyasztas() {
		return fogyasztas;
	}
	public void setFogyasztas(double fogyasztas) {
		this.fogyasztas = fogyasztas;
	}
	public String getUzemAnyagTipus() {
		return uzemAnyagTipus;
	}
	public void setUzemAnyagTipus(String uzemAnyagTipus) {
		this.uzemAnyagTipus = uzemAnyagTipus;
	}
	public int getSzallithatoSzemelyekSzama() {
		return szallithatoSzemelyekSzama;
	}
	public void setSzallithatoSzemelyekSzama(int szallithatoSzemelyekSzama) {
		this.szallithatoSzemelyekSzama = szallithatoSzemelyekSzama;
	}
	public int getMotorTerfogat() {
		return motorTerfogat;
	}
	public void setMotorTerfogat(int motorTerfogat) {
		this.motorTerfogat = motorTerfogat;
	}
	public int getGyartasiEv() {
		return gyartasiEv;
	}
	public void setGyartasiEv(int gyartasiEv) {
		this.gyartasiEv = gyartasiEv;
	}
	
	//Saj�t met�dusok
	
	//Eld�nti, hogy sokat vagy keveset fogyaszt-e az aut�
	public boolean kevesetFogyaszetEldont() {
		boolean valasz = false;
		if (this.fogyasztas < 6) {
			valasz = true;
		}		
		return valasz;
	}
	
	public String evjaratKategoriaMeghataroz() {
		String valasz = null;
		
		int aktualisEv = LocalDate.now().getYear();
		int autoKor = aktualisEv - this.gyartasiEv;
		
		if (autoKor>=0 && autoKor<=3) {
			valasz = "�jszer�";
		} else if (autoKor>=4 && autoKor<=10) {
			valasz = "hasz�lt";
		} else if (autoKor>=11 && autoKor<=29) {
			valasz = "�reg";
		} else if (autoKor>=3) {
			valasz = "veter�n";
		} else {
			valasz = "hib�s adat!!!";
		}
		
		
		return valasz;
	}
	/*
	public int evjaratEldont() {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		int kat = 0;
		int kor = year - this.getGyartasiEv();
		
		if (kor < 0) {
			kat = -1;
		} else if (kor <=3) {
			kat = 0;
		} else if (kor <= 10) {
			kat = 1;
		} else if (kor <= 29) {
			kat = 2;
		} else {
			kat = 3;
		}
		
		return kat;
		
	}
	*/
	
	//HF: gy�rt�si �v alapj�n eld�nti, hogy melyik �vj�rat kateg�ri�ba esik az aut�
	//0-3 �jszer�, 4-10 haszn�lt, 11-29 �reg, 30-t�l veter�n
	//az aktu�lis �v alapj�n sz�moljon �s kezeljen hib�t is
	//LocalDate - aktu�lis �v

}
