package kosar2004;

import java.util.Date;

public class KosarasTarolo {

	private String hazai;
	private String idegen;
	private int hazaiPont;
	private int idegenPont;
	private String helyszin;
	private Date idopont;
	
	
	public KosarasTarolo(String hazai, String idegen, int hazaiPont, int idegenPont, String helyszin, Date idopont) {
		super();
		this.hazai = hazai;
		this.idegen = idegen;
		this.hazaiPont = hazaiPont;
		this.idegenPont = idegenPont;
		this.helyszin = helyszin;
		this.idopont = idopont;
	}


	public String getHazai() {
		return hazai;
	}


	public void setHazai(String hazai) {
		this.hazai = hazai;
	}


	public String getIdegen() {
		return idegen;
	}


	public void setIdegen(String idegen) {
		this.idegen = idegen;
	}


	public int getHazaiPont() {
		return hazaiPont;
	}


	public void setHazaiPont(int hazaiPont) {
		this.hazaiPont = hazaiPont;
	}
	
	public int getIdegenPont() {
		return idegenPont;
	}


	public void setIdegenPont(int idegenPont) {
		this.idegenPont = idegenPont;
	}


	public String getHelyszin() {
		return helyszin;
	}


	public void setHelyszin(String helyszin) {
		this.helyszin = helyszin;
	}


	public Date getIdopont() {
		return idopont;
	}


	public void setIdopont(Date idopont) {
		this.idopont = idopont;
	}
	
	
	
}
