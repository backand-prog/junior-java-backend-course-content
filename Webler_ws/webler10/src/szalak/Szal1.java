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
			//felf�ggeszti az aktu�lis sz�l fut�s�t a megadott ideig a megadott param�ter alapj�n - 1000 ms - 1 m�sodperc
			this.sleep(ido);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
};