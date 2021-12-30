package balkezesek;

import java.util.Date;

public class BalkezesTarolo {
	
	private String nev;
	private Date elso;
	private Date utolso;
	private Short suly;
	private Short magassag;
	
	public String getNev() {
		return nev;
	}
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	public Date getElso() {
		return elso;
	}
	public void setElso(Date elso) {
		this.elso = elso;
	}
	public Date getUtolso() {
		return utolso;
	}
	public void setUtolso(Date utolso) {
		this.utolso = utolso;
	}
	public Short getSuly() {
		return suly;
	}
	public void setSuly(Short suly) {
		this.suly = suly;
	}
	public Short getMagassag() {
		return magassag;
	}
	public void setMagassag(Short magassag) {
		this.magassag = magassag;
	}

}

