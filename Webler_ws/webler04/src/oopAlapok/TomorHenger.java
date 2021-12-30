package oopAlapok;

public class TomorHenger extends Henger {
	
	/****** mezõk ******/
	
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
	
	/***** saját metódusok ******/
	
	public double getTomeg() {
		return this.suruseg*this.getTerfogat();
	}
	
	
	//felülírjuk az õsosztályban lévõ terfogatKiir metodust
	public void terfogatKiir() {
		System.out.println("A tömör henger térfogata: " + this.getTerfogat());
		
	}
	
	
	
}
