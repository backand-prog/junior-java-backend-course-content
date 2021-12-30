package HF01;

/*
 * �rj programot, amely bek�ri k�t pont koordin�t�it, majd kisz�molja azok t�vols�g�t!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27_tavolsag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem az els� pont x koodin�t�j�t: ");
		int x1 = Integer.parseInt(br.readLine());
		System.out.print("K�rem az els� pont y koodin�t�j�t: ");
		int y1 = Integer.parseInt(br.readLine());
		System.out.print("K�rem a m�sodik pont x koodin�t�j�t: ");
		int x2 = Integer.parseInt(br.readLine());
		System.out.print("K�rem a m�sodik y koodin�t�j�t: ");
		int y2 = Integer.parseInt(br.readLine());
		
		double coordDistance = Math.sqrt((x1 - x2) * (x1 - x2 ) + (y2 - y1) * (y2- y1));
		
		System.out.println("A k�t pont t�vols�ga: " +coordDistance);
		
	}

}
