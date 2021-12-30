package oopAlapok;

public class Henger {

	/********* adattagok, mez�k, fields ************/
	/*** OOP szab�lyai alapj�n private-k�nt hozzunk l�tre ***/
	
	private int magassag;
	private int sugar;
	
	/******* Konstruktor deklar�ci�***************/
	//Olyan publikus met�dus, amely azonos nev�, mint az oszt�ly
	//Mire szolg�l? Inicializ�lja (be�ll�tja) az objektump�ld�ny alap�rt�keit
	//Akkor ker�l megh�v�sra, amikor az objektump�ld�ny l�trej�n
	//Komolyabb �zleti logik�t nem szabad a konstruktorba helyezni (el�gaz�sok, ciklusok)
	//Elk�pzhet�, ha nem j�n l�tre az objektump�ld�ny, ha az eggyel feljebbi pontot nem vessz�k figyelembe
	
	
	public Henger(int magassag, int sugar) {
		
		this.magassag = magassag;
		this.sugar = sugar;
		
	}

	/******** tulajdons�gok (adattagok), properties (setter/getter) **********/
	
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
	
	/*********** saj�t met�dusok **********/
	
	public double getFelszin() {
		return 2*(Math.pow(this.sugar, 2)* Math.PI) + this.magassag*2*this.sugar*Math.PI;
	}
	
	public double getTerfogat() {
		return Math.pow(this.sugar, 2)*Math.PI*this.magassag;
	}
	
	public void terfogatKiir() {
		System.out.println("A henger t�rfogata: " + getTerfogat());
	}
	
}
