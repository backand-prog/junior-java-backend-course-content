package interfacePelda;

public class Repulogep extends Gep implements Repul, Tulajdonsagok{

	public Repulogep(String nev, double uzemanyagMennyiseg) {
		super(nev, uzemanyagMennyiseg);
	}

	@Override
	public void repul() {
		System.out.println("Fogy az üzemanyag");
		this.setUzemanyagMennyiseg(this.getUzemanyagMennyiseg() - 20);
	}

	@Override
	public void felszall() {
		System.out.println("Felszállópálya kell");
		if (this.getUzemanyagMennyiseg()<20) {
			System.out.println("Nem lehet felszállni, nincs elég üzemanyag");
		}
		
	}

	@Override
	public void leszall() {
		System.out.println("Leszállópálya kell");
		
	}

	@Override
	public void karbantartasDatumaBeallit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repultOrakSzamaBeallit() {
		// TODO Auto-generated method stub
		
	}

}
