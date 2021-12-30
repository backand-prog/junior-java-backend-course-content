package oopRaktar;

import java.util.Date;

public class EszkozTarolo {
	
	private String leltarSzam;
	private String megnevezes;
	private Byte kategoriaId;
	private Integer ar;
	private Integer raktarMennyiseg;
	private Date feltoltesDatum;
	private Boolean akcios;
	
	public EszkozTarolo(String leltarSzam, String megnevezes, Byte kategoriaId, Integer ar, Integer raktarMennyiseg,
			Date feltoltesDatum, Boolean akcios) {
		
		super();
		this.leltarSzam = leltarSzam;
		this.megnevezes = megnevezes;
		this.kategoriaId = kategoriaId;
		this.ar = ar;
		this.raktarMennyiseg = raktarMennyiseg;
		this.feltoltesDatum = feltoltesDatum;
		this.akcios = akcios;
		
	}

	public String getLeltarSzam() {
		return leltarSzam;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public Byte getKategoriaId() {
		return kategoriaId;
	}

	public Integer getAr() {
		return ar;
	}

	public Integer getRaktarMennyiseg() {
		return raktarMennyiseg;
	}

	public Date getFeltoltesDatum() {
		return feltoltesDatum;
	}

	public Boolean getAkcios() {
		return akcios;
	}
	
	
	
}
