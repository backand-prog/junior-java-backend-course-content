package fajlKezeles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FajlOlvaso {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("adatok.txt"), "UTF-8"));
			while (br.ready()) {
				System.out.println(br.readLine());;
			}
			
			//enn�l nem annyira kritikus ha elhagyjuk a close-t, mint az �r�sn�l
			//itt el is lehet hagyni, de az�rt figyelni kell r�
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("A f�jl nem tal�lja a megadott f�jlt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
