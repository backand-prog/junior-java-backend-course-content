package szalak;

public class Szinkronizalas {

	private int szam = 0;
	
	
	
	public static void main(String[] args) {
	
		Szinkronizalas szObj = new Szinkronizalas();
		szObj.work();
		
		
	}
	
	//A sz�lak l�tj�k egym�st, kommunik�lnak egym�ssal. Lehets�ges hibaforr�sok: azonos er�sforr�shoz akarnak hozz�f�rni
	//pld. mem�ri�hoz: mem�riakonzisztencia hib�hoz vezet
	
	public synchronized void noveles() {
		szam++;
	}
	
	
	public void work() {
		
		//1. sz�l l�trehoz�sa
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for (int i = 0; i < 100; i++) {
					noveles();
					System.out.println("t1: " + i);
				}
				
			}
		});
		
		//1. sz�l l�trehoz�sa
			Thread t2 = new Thread(new Runnable() {
					
				@Override
				public void run() {
					
					for (int i = 0; i < 150; i++) {
						noveles();
						System.out.println("t2: " + i);
					}
						
				}
			});
		
			//mindk�t sz�l elind�t�sa
			t1.start();
			t2.start();
			
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("A sz�m �rt�ke: " + szam);
			
			
	}
	

}
