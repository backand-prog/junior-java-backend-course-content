package idozito;

import java.util.Timer;

public class Idozitett {

	Idozito feladat = new Idozito();
	
	public Idozitett() {
		
		Timer timerObj = new Timer();
		timerObj.schedule(feladat, 1000, 2000);
		
	}
	
}
