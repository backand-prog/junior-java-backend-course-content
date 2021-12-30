package ingatlan;

public class Ingatlan {
	
	private String megnevezes;
	private int negyzetmeter;
	private int iranyitoszam;
	private String varos;
	private String cim;
	private int szobakSzama;
	
	public Ingatlan(String megnevezes, int negyzetmeter, int iranyitoszam, String varos, String cim, int szobakSzama) {
		super();
		this.megnevezes = megnevezes;
		this.negyzetmeter = negyzetmeter;
		this.iranyitoszam = iranyitoszam;
		this.varos = varos;
		this.cim = cim;
		this.szobakSzama = szobakSzama;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}

	public int getNegyzetmeter() {
		return negyzetmeter;
	}

	public void setNegyzetmeter(int negyzetmeter) {
		this.negyzetmeter = negyzetmeter;
	}

	public int getIranyitoszam() {
		return iranyitoszam;
	}

	public void setIranyitoszam(int iranyitoszam) {
		this.iranyitoszam = iranyitoszam;
	}

	public String getVaros() {
		return varos;
	}

	public void setVaros(String varos) {
		this.varos = varos;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public int getSzobakSzama() {
		return szobakSzama;
	}

	public void setSzobakSzama(int szobakSzama) {
		this.szobakSzama = szobakSzama;
	}
	
	
	public void printAllData() {
		System.out.println("Az ingatlan megnevez�se: " + this.megnevezes);
		System.out.println("Az ingatlan m�rete: " + this.negyzetmeter + " n�gyzetm�ter");
		System.out.println("Az ingatlan ir�ny�t�sz�ma: " + this.iranyitoszam);
		System.out.println("Az ingatlan ebben a v�rosban van: " + this.varos);
		System.out.println("Az ingatlan c�me: " + this.cim);
		System.out.println("Az ingatlan szob�inak sz�ma: " + this.szobakSzama);
	
	}
	
	public void isCapital(String townName) {
		
		if (townName.equals("Budapest") || townName.equals("budapest")) {
			System.out.println("Az ingatlan a f�v�rosban, Budapesten tal�lhat�.");
		} else {
			System.out.println("Az ingatlan nem a f�v�rosban tal�lhat�.");
		}
			
	}
	
	public void isEnoughForBigFams(int nm) {
		if (nm > 110) {
			System.out.println("Az ingatlan alkalmas nagycsal�dosok sz�m�ra.");
		} else {
			System.out.println("Az ingatlan nem alkalmas nagycsal�dosok sz�m�ra.");
		}
		
	}
	
}
