package oopAlapok;

public class Teszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objektump�d�ny l�trehoz�s hengerObj n�ven a Henger oszt�lyb�l
		//Itt t�rt�nik a konstruktorh�v�s
		Henger hengerObj = new Henger(10, 1);
		System.out.println("A henger magass�ga: " + hengerObj.getMagassag());
		hengerObj.terfogatKiir();
		System.out.println("Henger felsz�ne: " + hengerObj.getFelszin());
		System.out.println("Henger t�rfogat: " + hengerObj.getTerfogat());
		
		System.out.println();
		TomorHenger tomorHengerObj = new TomorHenger(10, 2, 0.5);
		System.out.println("T�m�rhenger felsz�n: " + tomorHengerObj.getFelszin());
		System.out.println("T�m�rhenger t�rfogat: " + tomorHengerObj.getTerfogat());
		System.out.println("T�m�rhenger t�mege: " + tomorHengerObj.getTomeg());
		tomorHengerObj.terfogatKiir();
		System.out.println();
		
		Cso csoObj = new Cso(10, 2, 0.5, 1);
		System.out.println("Cs� t�rfogata: " + csoObj.getTerfogat());
		System.out.println("Cs� felsz�ne: " + csoObj.getFelszin());
		
		
	}

}
