package oopFajlAllasok;

import java.util.Date;

public class AllasTarolo {

	//CSAK ADATTÁROLÁSRA - POJO -PLAIN OLD JAVA OBJECT
	
	//mezõk, fields
	private Integer id;
	private String megnevezes;
	private Integer bruttoFizetes;
	private Byte elvartTapasztalatiEvek;
	private Boolean tavmunka;
	private Date publikacioIdeje;
	
	//konstruktor nélkül
	
	
	//getters/setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMegnevezes() {
		return megnevezes;
	}
	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}
	public Integer getBruttoFizetes() {
		return bruttoFizetes;
	}
	public void setBruttoFizetes(Integer bruttoFizetes) {
		this.bruttoFizetes = bruttoFizetes;
	}
	public Byte getElvartTapasztalatiEvek() {
		return elvartTapasztalatiEvek;
	}
	public void setElvartTapasztalatiEvek(Byte elvartTapasztalatiEvek) {
		this.elvartTapasztalatiEvek = elvartTapasztalatiEvek;
	}
	public Boolean getTavmunka() {
		return tavmunka;
	}
	public void setTavmunka(Boolean tavmunka) {
		this.tavmunka = tavmunka;
	}
	public Date getPublikacioIdeje() {
		return publikacioIdeje;
	}
	public void setPublikacioIdeje(Date publikacioIdeje) {
		this.publikacioIdeje = publikacioIdeje;
	}
	
	
}
