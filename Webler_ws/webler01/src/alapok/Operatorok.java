package alapok;

public class Operatorok {

	public static void main(String[] args) {
		//Operátorok
		
		//Matematikai operátorok
		// + - * / % (MOD)
		
		int szam1 = 5;
		int szam2 = 10;
		System.out.println("Összegük: " + (szam1 + szam2));
		
		int kulonbseg = szam2 - szam1;
		System.out.println("Különbség :" + kulonbseg);
		
		//maradékképés - modulo - MOD
		System.out.println(5 % 7);
		System.out.println(4 % 2);
		System.out.println(6 % 2);
		System.out.println(2 % 1);
		System.out.println(12 % 5);
		
		//értéknövelés és értékcsökkentés operátorok ++ --
		//prefix és postfix
		
		int szam3 = 7;
		System.out.println(++szam3);
		System.out.println(szam3++);
		System.out.println(szam3);
		
		//értékadó operátor =
		//balérték - jobbérték
		//right value és left value
		int a = 10;
		int b = 12;
		a = b;
		System.out.println(a);
		
		a += 5; //a = a + 5;
		
		//összehasonlító operátorok
		// < > <= >= != ==
		
		//logikai operátorok
		boolean A = true;
		boolean B = false;
		
		//Bool algebra mûveletei: ÉS (AND) VAGY (OR) Negálás (Tagadás)
		//mûveletvégzõ jelek: && ||
		System.out.println("A és B mûvelet értéke: " + (A && B)); //false
		System.out.println("A és B mûvelet értéke: " + (A || B)); //true
		System.out.println("A és B mûvelet értéke: " + (!A)); //false
		System.out.println("A és B mûvelet értéke: " + (A && B || A)); //true
		System.out.println("A és B mûvelet értéke: " + (A || (B && A))); //true
		
		System.out.println(5 == 7); //false
		System.out.println(5 <= 5); //true
		
		//operátorok sorrendisége
		
	}

}
