package interfacePelda;

public class Eloleny {
	
	private String nev;
	private boolean ehes;
	
	public Eloleny(String nev) {
		this.nev = nev;
		this.ehes = true;
	}
	

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public boolean isEhes() {
		return ehes;
	}

	public void setEhes(boolean ehes) {
		this.ehes = ehes;
	}
	
	public void eszik() {
		this.ehes = false;
	}
	
}
