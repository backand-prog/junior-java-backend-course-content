package kerekParboltSajat;

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
	
	public Kerekpar(Integer cikkszam, String nev, String tipus, Integer ar, Boolean hasznalt, Byte kategoriaId,
			Date rogzitesDatuma) {
		
		this.cikkszam = cikkszam;
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
		
		String kategoriaSzoveg = "";
		
		switch (kategoriaId) {
		case 1: kategoriaSzoveg = "f?rfi";
			break;
		case 2: kategoriaSzoveg = "n?";
			break;
		case 3: kategoriaSzoveg = "gyermek";
			break;
		default:
			break;
		}
		
		return kategoriaSzoveg;
		
		
	}
	
	public String getHasznaltSzovegesen () {
		String kategoriaSzovegesen = "";
		
		kategoriaSzovegesen = kategoriaId==0 ? "?j" : "haszn?lt";
		
		return kategoriaSzovegesen;
		
	}
	
	public String getRogzitesDatumaFormazottan () {
		
		String datum = "";
		
		Calendar calendarObj = Calendar.getInstance();
		calendarObj.setTime(this.rogzitesDatuma);
		
		datum += calendarObj.get(Calendar.YEAR);
		datum += ".";
		datum += calendarObj.get(Calendar.MONTH);
		datum += ".";
		datum += calendarObj.get(Calendar.DAY_OF_MONTH);
		
		return datum;
		
	}
	
}
