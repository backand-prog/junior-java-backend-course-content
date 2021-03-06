package sandbox;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Szotar {

	public static Map<String, String> szotar = new HashMap<>();
	
	public static void main(String[] args) {
		
		fajlBeolvas();
		System.out.println(szotar);
		
	}
	
	public static void fajlBeolvas ( ) {
		
		String fajlEleresiut = "szotar/szotar.txt";
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(fajlEleresiut), "UTF-8"));
			
			while(br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				szotar.put(sorAdatok[0], sorAdatok[1]);
			}
			
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				}

}
