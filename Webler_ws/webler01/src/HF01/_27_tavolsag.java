package HF01;

/*
 * Írj programot, amely bekéri két pont koordinátáit, majd kiszámolja azok távolságát!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27_tavolsag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem az elsõ pont x koodinátáját: ");
		int x1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem az elsõ pont y koodinátáját: ");
		int y1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem a második pont x koodinátáját: ");
		int x2 = Integer.parseInt(br.readLine());
		System.out.print("Kérem a második y koodinátáját: ");
		int y2 = Integer.parseInt(br.readLine());
		
		double coordDistance = Math.sqrt((x1 - x2) * (x1 - x2 ) + (y2 - y1) * (y2- y1));
		
		System.out.println("A két pont távolsága: " +coordDistance);
		
	}

}
