package alapok;

public class Operatorok {

	public static void main(String[] args) {
		//Oper�torok
		
		//Matematikai oper�torok
		// + - * / % (MOD)
		
		int szam1 = 5;
		int szam2 = 10;
		System.out.println("�sszeg�k: " + (szam1 + szam2));
		
		int kulonbseg = szam2 - szam1;
		System.out.println("K�l�nbs�g :" + kulonbseg);
		
		//marad�kk�p�s - modulo - MOD
		System.out.println(5 % 7);
		System.out.println(4 % 2);
		System.out.println(6 % 2);
		System.out.println(2 % 1);
		System.out.println(12 % 5);
		
		//�rt�kn�vel�s �s �rt�kcs�kkent�s oper�torok ++ --
		//prefix �s postfix
		
		int szam3 = 7;
		System.out.println(++szam3);
		System.out.println(szam3++);
		System.out.println(szam3);
		
		//�rt�kad� oper�tor =
		//bal�rt�k - jobb�rt�k
		//right value �s left value
		int a = 10;
		int b = 12;
		a = b;
		System.out.println(a);
		
		a += 5; //a = a + 5;
		
		//�sszehasonl�t� oper�torok
		// < > <= >= != ==
		
		//logikai oper�torok
		boolean A = true;
		boolean B = false;
		
		//Bool algebra m�veletei: �S (AND) VAGY (OR) Neg�l�s (Tagad�s)
		//m�veletv�gz� jelek: && ||
		System.out.println("A �s B m�velet �rt�ke: " + (A && B)); //false
		System.out.println("A �s B m�velet �rt�ke: " + (A || B)); //true
		System.out.println("A �s B m�velet �rt�ke: " + (!A)); //false
		System.out.println("A �s B m�velet �rt�ke: " + (A && B || A)); //true
		System.out.println("A �s B m�velet �rt�ke: " + (A || (B && A))); //true
		
		System.out.println(5 == 7); //false
		System.out.println(5 <= 5); //true
		
		//oper�torok sorrendis�ge
		
	}

}
