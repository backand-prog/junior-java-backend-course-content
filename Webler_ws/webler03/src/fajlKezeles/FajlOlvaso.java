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
			
			//ennél nem annyira kritikus ha elhagyjuk a close-t, mint az írásnál
			//itt el is lehet hagyni, de azért figyelni kell rá
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("A fájl nem találja a megadott fájlt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
