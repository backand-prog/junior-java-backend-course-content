package idozito;

import java.util.TimerTask;

public class Idozito extends TimerTask {

	private int szam = 0;
	
	@Override
	public void run() {
		szam++;
		System.out.println("Szam: " + szam);
		
	}

	
	
}
