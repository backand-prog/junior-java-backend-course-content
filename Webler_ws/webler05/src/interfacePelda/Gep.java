package interfacePelda;

public class Gep {
	
	private String nev;
	private double uzemanyagMennyiseg;
	
	public Gep(String nev, double uzemanyagMennyiseg) {
		this.nev = nev;
		this.uzemanyagMennyiseg = uzemanyagMennyiseg;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public double getUzemanyagMennyiseg() {
		return uzemanyagMennyiseg;
	}

	public void setUzemanyagMennyiseg(double uzemanyagMennyiseg) {
		this.uzemanyagMennyiseg = uzemanyagMennyiseg;
	}
	
	public void tankol (double mennyiseg) {
		this.uzemanyagMennyiseg+=mennyiseg;
	}
	
}
