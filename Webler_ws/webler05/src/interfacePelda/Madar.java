package interfacePelda;

public class Madar extends Eloleny implements Repul {

	public Madar(String nev) {
		super(nev);
	}

	@Override
	public void repul() {
		System.out.println("Fárasztja a szárnyait és közben éhezik");
		this.setEhes(true);
	}

	@Override
	public void felszall() {
		System.out.println("Bárhol ügyesen felszáll");
	}

	@Override
	public void leszall() {
		System.out.println("Bárhol le tud szállni");

	}

}
