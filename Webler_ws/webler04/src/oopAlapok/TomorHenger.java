package oopAlapok;

public class TomorHenger extends Henger {
	
	/****** mez�k ******/
	
	private double suruseg;
	
	public TomorHenger(int magassag, int sugar, double suruseg) {
		super(magassag, sugar);
		this.suruseg = suruseg;
		
		
	}
	/******* getters/setters ********/
	
	public double getSuruseg() {
		return suruseg;
	}

	public void setSuruseg(double suruseg) {
		this.suruseg = suruseg;
		
	}
	
	/***** saj�t met�dusok ******/
	
	public double getTomeg() {
		return this.suruseg*this.getTerfogat();
	}
	
	
	//fel�l�rjuk az �soszt�lyban l�v� terfogatKiir metodust
	public void terfogatKiir() {
		System.out.println("A t�m�r henger t�rfogata: " + this.getTerfogat());
		
	}
	
	
	
}
