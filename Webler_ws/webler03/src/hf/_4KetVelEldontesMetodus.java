package hf;

import java.util.Random;

public class _4KetVelEldontesMetodus {

	public static void main(String[] args) {
		
		productOddorEven();

	}
	
	public static void productOddorEven () {
		
		Random r = new Random();
		int num1 = r.nextInt(10) + 1;
		int num2 = r. nextInt(10) + 1;
		
		int product = num1 * num2;
		
		if (product % 2 == 0) {
			
			System.out.println("A k�t sz�m (" + num1 + ", " + num2 + ") szorzata: " + product + ", ami p�ros..");			
		} else {
			System.out.println("A k�t sz�m (" + num1 + ", " + num2 + ") szorzata: " + product + ", ami p�ratlan..");
		}
		
	}

}
