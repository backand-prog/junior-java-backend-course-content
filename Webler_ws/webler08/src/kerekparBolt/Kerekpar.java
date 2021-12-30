package kerekparBolt;

import java.util.Calendar;
import java.util.Date;

public class Kerekpar {

	private Integer cikkszam;
	private String nev;
	private String tipus;
	private Integer ar;
	private Boolean hasznalt;
	private Byte kategoriaId; 
	private Date rogzitesDatuma;
	
	public Kerekpar(Integer cikkaszam, String nev, String tipus, Integer ar, Boolean hasznalt, Byte kategoriaId,
			Date rogzitesDatuma) {
		this.cikkszam = cikkaszam;
		this.nev = nev;
		this.tipus = tipus;
		this.ar = ar;
		this.hasznalt = hasznalt;
		this.kategoriaId = kategoriaId;
		this.rogzitesDatuma = rogzitesDatuma;
	}

	public Integer getCikkszam() {
		return cikkszam;
	}

	public String getNev() {
		return nev;
	}

	public String getTipus() {
		return tipus;
	}

	public Integer getAr() {
		return ar;
	}

	public Boolean getHasznalt() {
		return hasznalt;
	}

	public Byte getKategoriaId() {
		return kategoriaId;
	}

	public Date getRogzitesDatuma() {
		return rogzitesDatuma;
	}
	
	
	public String getKategoriaSzoveg() {
		String kategoriaSzoveg = null;
		
		switch (this.kategoriaId) {
		case 1: kategoriaSzoveg = "férfi";
			break;
		case 2: kategoriaSzoveg = "nõi";
			break;
		case 3: kategoriaSzoveg = "gyermek";
			break;
		default: kategoriaSzoveg = "hiba";
			break;
		}
		
		return kategoriaSzoveg;
	}
	
	public String getHasznaltSzovegesen() {
		
		if (this.hasznalt) {
			return "használt";
		}
		
		else {
			return "új";
		}
		
	}
	
	public String getRogzitesDatumaFormazottan() {
		String datum = "";
		Calendar calendarObj = Calendar.getInstance();
		calendarObj.setTime(this.getRogzitesDatuma());
		datum += calendarObj.get(Calendar.YEAR);
		datum += ".";
		datum += calendarObj.get(Calendar.MONTH);
		datum += ".";
		datum += calendarObj.get(Calendar.DAY_OF_MONTH);
		datum += ".";
		
		return datum;
		
	}
	
		
}
