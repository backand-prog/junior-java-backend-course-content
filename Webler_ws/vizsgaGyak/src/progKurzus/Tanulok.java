package progKurzus;

public class Tanulok {
	
	private String nev;
	private String nem;
	private byte finanszKod;
	private int befizetettOsszeg;
	private byte progEredmeny;
	private byte grafEredmeny;
	private byte architektEredmeny;
	private byte mestintEredmeny;
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getNem() {
		return nem;
	}
	public void setNem(String nem) {
		this.nem = nem;
	}
	public byte getFinanszKod() {
		return finanszKod;
	}
	public void setFinanszKod(byte finanszKod) {
		this.finanszKod = finanszKod;
	}
	public int getBefizetettOsszeg() {
		return befizetettOsszeg;
	}
	public void setBefizetettOsszeg(int befizetettOsszeg) {
		this.befizetettOsszeg = befizetettOsszeg;
	}
	public byte getProgEredmeny() {
		return progEredmeny;
	}
	public void setProgEredmeny(byte progEredmeny) {
		this.progEredmeny = progEredmeny;
	}
	public byte getGrafEredmeny() {
		return grafEredmeny;
	}
	public void setGrafEredmeny(byte grafEredmeny) {
		this.grafEredmeny = grafEredmeny;
	}
	public byte getArchitektEredmeny() {
		return architektEredmeny;
	}
	public void setArchitektEredmeny(byte architektEredmeny) {
		this.architektEredmeny = architektEredmeny;
	}
	public byte getMestintEredmeny() {
		return mestintEredmeny;
	}
	public void setMestintEredmeny(byte mestintEredmeny) {
		this.mestintEredmeny = mestintEredmeny;
	}

}
