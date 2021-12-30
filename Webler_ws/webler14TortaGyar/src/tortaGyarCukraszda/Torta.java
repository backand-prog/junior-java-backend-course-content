package tortaGyarCukraszda;

public class Torta {

	private String azonosito;
	private String megnevezes;
	private Integer nettoAr;
	private Short szeletes;
	private Boolean akcios;
	private Boolean gm;
	private Boolean lm;
	
	public Torta(String azonosito, String megnevezes, Integer nettoAr, Short szeletes, Boolean akcios, Boolean gm,
			Boolean lm) {
		this.azonosito = azonosito;
		this.megnevezes = megnevezes;
		this.nettoAr = nettoAr;
		this.szeletes = szeletes;
		this.akcios = akcios;
		this.gm = gm;
		this.lm = lm;
	}

	public String getAzonosito() {
		return azonosito;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public Integer getNettoAr() {
		return nettoAr;
	}

	public Short getSzeletes() {
		return szeletes;
	}

	public Boolean getAkcios() {
		return akcios;
	}

	public Boolean getGm() {
		return gm;
	}

	public Boolean getLm() {
		return lm;
	}

	public String getAckiosSzovegesen() {
		String valasz = "";
		if (this.akcios) {
			valasz = "akciós";
		} else {
			valasz = "nem akciós";
		}
		
		return valasz;
		
	}
	
	public String getLmSzovegesen() {
		String valasz = "";
		if (this.lm) {
			valasz = "laktózmentes";
		} else {
			valasz = "nem laktózmentes";
		}
		
		return valasz;
		
	}
	
	public String getGmSzovegesen() {
		String valasz = "";
		if (this.gm) {
			valasz = "gluténmentes";
		} else {
			valasz = "nem gluténmentes";
		}
		
		return valasz;
		
	}

}