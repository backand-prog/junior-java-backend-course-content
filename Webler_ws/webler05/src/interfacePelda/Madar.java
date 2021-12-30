package interfacePelda;

public class Madar extends Eloleny implements Repul {

	public Madar(String nev) {
		super(nev);
	}

	@Override
	public void repul() {
		System.out.println("F�rasztja a sz�rnyait �s k�zben �hezik");
		this.setEhes(true);
	}

	@Override
	public void felszall() {
		System.out.println("B�rhol �gyesen felsz�ll");
	}

	@Override
	public void leszall() {
		System.out.println("B�rhol le tud sz�llni");

	}

}
