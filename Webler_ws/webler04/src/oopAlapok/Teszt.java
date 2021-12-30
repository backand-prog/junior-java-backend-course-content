package oopAlapok;

public class Teszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objektumpédány létrehozás hengerObj néven a Henger osztályból
		//Itt történik a konstruktorhívás
		Henger hengerObj = new Henger(10, 1);
		System.out.println("A henger magassága: " + hengerObj.getMagassag());
		hengerObj.terfogatKiir();
		System.out.println("Henger felszíne: " + hengerObj.getFelszin());
		System.out.println("Henger térfogat: " + hengerObj.getTerfogat());
		
		System.out.println();
		TomorHenger tomorHengerObj = new TomorHenger(10, 2, 0.5);
		System.out.println("Tömörhenger felszín: " + tomorHengerObj.getFelszin());
		System.out.println("Tömörhenger térfogat: " + tomorHengerObj.getTerfogat());
		System.out.println("Tömörhenger tömege: " + tomorHengerObj.getTomeg());
		tomorHengerObj.terfogatKiir();
		System.out.println();
		
		Cso csoObj = new Cso(10, 2, 0.5, 1);
		System.out.println("Csõ térfogata: " + csoObj.getTerfogat());
		System.out.println("Csõ felszíne: " + csoObj.getFelszin());
		
		
	}

}
