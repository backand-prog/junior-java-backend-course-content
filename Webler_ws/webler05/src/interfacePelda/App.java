package interfacePelda;

public class App {

	public static void main(String[] args) {

		Madar golyaObj = new Madar("G�lya");
		System.out.println("A golya �hes: " + golyaObj.isEhes());

		if (golyaObj.isEhes()) {
			golyaObj.eszik();
		}

		System.out.println("A g�lya �hes ev�s ut�n: " + golyaObj.isEhes());
		golyaObj.felszall();
		golyaObj.repul();
		golyaObj.leszall();
		System.out.println("A g�lya �hes rep�l�s ut�n: " + golyaObj.isEhes());

		Repulogep repcsiObj = new Repulogep("TSRG21445" , 10);
		System.out.println("Repcsi �zemanyagmennyis�ge: " + repcsiObj.getUzemanyagMennyiseg());

		repcsiObj.tankol(50);
		repcsiObj.tankol(30);
		repcsiObj.felszall();
		repcsiObj.repul();
		repcsiObj.leszall();
		System.out.println("Repcsi �zemanyagmennyis�ge: " + repcsiObj.getUzemanyagMennyiseg());
		repcsiObj.repultOrakSzamaBeallit();
		repcsiObj.karbantartasDatumaBeallit();
		
		
		Repulogep repcsiObj2 = new Repulogep("TSRG21446", 8);
		repcsiObj2.felszall();
		
		


	}

}
