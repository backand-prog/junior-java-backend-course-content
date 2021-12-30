package oopAlapok;

public class Henger {

	/********* adattagok, mezõk, fields ************/
	/*** OOP szabályai alapján private-ként hozzunk létre ***/
	
	private int magassag;
	private int sugar;
	
	/******* Konstruktor deklaráció***************/
	//Olyan publikus metódus, amely azonos nevû, mint az osztály
	//Mire szolgál? Inicializálja (beállítja) az objektumpéldány alapértékeit
	//Akkor kerül meghívásra, amikor az objektumpéldány létrejön
	//Komolyabb üzleti logikát nem szabad a konstruktorba helyezni (elágazások, ciklusok)
	//Elképzhetõ, ha nem jön létre az objektumpéldány, ha az eggyel feljebbi pontot nem vesszük figyelembe
	
	
	public Henger(int magassag, int sugar) {
		
		this.magassag = magassag;
		this.sugar = sugar;
		
	}

	/******** tulajdonságok (adattagok), properties (setter/getter) **********/
	
	public int getMagassag() {
		return magassag;
	}

	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	/*********** saját metódusok **********/
	
	public double getFelszin() {
		return 2*(Math.pow(this.sugar, 2)* Math.PI) + this.magassag*2*this.sugar*Math.PI;
	}
	
	public double getTerfogat() {
		return Math.pow(this.sugar, 2)*Math.PI*this.magassag;
	}
	
	public void terfogatKiir() {
		System.out.println("A henger térfogata: " + getTerfogat());
	}
	
}
