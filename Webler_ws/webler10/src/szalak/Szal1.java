package szalak;

public class Szal1 extends Thread{

	String szoveg;
	int ido;
	

	
	public Szal1(String szoveg, int ido) {
		this.szoveg = szoveg;
		this.ido = ido;
		start();
	}

	@SuppressWarnings("static-access")
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(szoveg + ": " + i);
		}
		
		try {
			//felfüggeszti az aktuális szál futását a megadott ideig a megadott paraméter alapján - 1000 ms - 1 másodperc
			this.sleep(ido);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
};