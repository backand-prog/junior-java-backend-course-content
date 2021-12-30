package weblerVizsga;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Fajlkezelo {

	//1. feladat, fájl beolvasása
	
	public List<Kutyak> fajlBeolvas(String fajlNev) {
		
		List<Kutyak> kutyak = new ArrayList<Kutyak>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			@SuppressWarnings("unused")
			String fejlec = br.readLine();
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Kutyak kutyaObj = new Kutyak();
				
				kutyaObj.setAzonosito(Integer.parseInt(sorAdatok[0]));
				kutyaObj.setBecenev(sorAdatok[1]);
				kutyaObj.setFajta(sorAdatok[2]);
				kutyaObj.setKor(Byte.parseByte(sorAdatok[3]));
				kutyaObj.setNeme(sorAdatok[4]);
				kutyaObj.setIvartalanitott(Byte.parseByte(sorAdatok[5]));
				
				kutyak.add(kutyaObj);
				
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
		
		return kutyak;

	}
	
}
