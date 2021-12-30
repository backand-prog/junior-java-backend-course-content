package szalak;

public class Szinkronizalas {

	private int szam = 0;
	
	
	
	public static void main(String[] args) {
	
		Szinkronizalas szObj = new Szinkronizalas();
		szObj.work();
		
		
	}
	
	//A szálak látják egymást, kommunikálnak egymással. Lehetséges hibaforrások: azonos erõsforráshoz akarnak hozzáférni
	//pld. memóriához: memóriakonzisztencia hibához vezet
	
	public synchronized void noveles() {
		szam++;
	}
	
	
	public void work() {
		
		//1. szál létrehozása
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for (int i = 0; i < 100; i++) {
					noveles();
					System.out.println("t1: " + i);
				}
				
			}
		});
		
		//1. szál létrehozása
			Thread t2 = new Thread(new Runnable() {
					
				@Override
				public void run() {
					
					for (int i = 0; i < 150; i++) {
						noveles();
						System.out.println("t2: " + i);
					}
						
				}
			});
		
			//mindkét szál elindítása
			t1.start();
			t2.start();
			
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("A szám értéke: " + szam);
			
			
	}
	

}
