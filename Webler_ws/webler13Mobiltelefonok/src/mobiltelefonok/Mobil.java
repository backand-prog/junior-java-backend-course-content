package mobiltelefonok;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mobilBean")
@SessionScoped

public class Mobil {
	
	private String marka;
	private String tipus;
	private String szin;
	private int mennyiseg;
	private int ar;
	
	public Mobil(String marka, String tipus, String szin, int mennyiseg, int ar) {
		this.marka = marka;
		this.tipus = tipus;
		this.szin = szin;
		this.mennyiseg = mennyiseg;
		this.ar = ar;
	}

	public Mobil() {
		
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public String getSzin() {
		return szin;
	}

	public void setSzin(String szin) {
		this.szin = szin;
	}

	public int getMennyiseg() {
		return mennyiseg;
	}

	public void setMennyiseg(int mennyiseg) {
		this.mennyiseg = mennyiseg;
	}

	public int getAr() {
		return ar;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}
	
	private static ArrayList<Mobil> mobilok = new ArrayList<Mobil>(
			Arrays.asList(
					new Mobil("Nokia", "N123", "fekete", 55, 90000),
					new Mobil("Huawei", "P20 Lite", "azúrkék", 100, 118000),
					new Mobil("Samsung", "S5", "szürke", 34, 156000),
					new Mobil("iPhone", "X", "fehér", 25, 400000),
					new Mobil("LG", "440", "kék", 45, 140000)
					)
			);
	
	public ArrayList<Mobil> getMobilok() {
			return mobilok;		
			}
	

}
