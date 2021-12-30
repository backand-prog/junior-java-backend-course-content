package tesztJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Teszt {

	public static void main(String[] args) {
		Teszt tesztObj = new Teszt();
		tesztObj.proba();

	}
	
	@Test
	public void proba() {
		int a = 10;
		int b = 8;
		assertEquals(a+b, multiply(a, b));
		
	}
	
	
	
	public int multiply(int a, int b) {
		return a*b;
	}

}
