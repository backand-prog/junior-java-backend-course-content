package oopAlapok;

public class Cso extends TomorHenger {

	private int belsoSugar;

	public Cso(int magassag, int sugar, double suruseg, int belsoSugar) {
		super(magassag, sugar, suruseg);
		this.belsoSugar = belsoSugar;
	}

	public int getBelsoSugar() {
		return belsoSugar;
	}

	public void setBelsoSugar(int belsoSugar) {
		this.belsoSugar = belsoSugar;
	}
	
	public double getTerfogat() {
		return new Henger(this.getMagassag(), this.getSugar()).getTerfogat() - 
				new Henger(this.getMagassag(), this.getBelsoSugar()).getTerfogat();
	}
	

	//a super az mindig az õsosztályra utal, el tudjuk érni vele az adott dolgait
	public double getFelszin() {
		return super.getFelszin() + (new Henger(this.getMagassag(), this.belsoSugar))
				.getFelszin()-4*Math.pow(this.belsoSugar, 2)*Math.PI;
	}
	
}
