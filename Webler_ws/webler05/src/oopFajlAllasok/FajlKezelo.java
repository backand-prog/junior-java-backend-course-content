package oopFajlAllasok;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FajlKezelo {
	
	public List<AllasTarolo> fajlBeolvas(String fajlNev){
		
		List<AllasTarolo> allasokLista = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(fajlNev), "UTF-8"));
			//elsõ sor a fejléc, nincs rá szükség
			@SuppressWarnings("unused")
			String fejlec = br.readLine();
			
			//addig megy a ciklus, amíg a fájl végéig nem érek
			while(br.ready()) {
				
				//1. egy sort beolvasok(számomra hasznos adatot tartalmaz)
				String sor = br.readLine();
				//szétszedem az adatokat határoló mentén
				String[] sorAdatok = sor.split(";");
				
				//3. objektumpéldány létrehozása
				AllasTarolo allasObj = new AllasTarolo();
				allasObj.setId(Integer.parseInt(sorAdatok[0]));
				allasObj.setMegnevezes(sorAdatok[1]);
				allasObj.setBruttoFizetes(Integer.parseInt(sorAdatok[2]));
				allasObj.setElvartTapasztalatiEvek(Byte.parseByte(sorAdatok[3]));
				if (Integer.parseInt(sorAdatok[4]) == 1) {
					allasObj.setTavmunka(true);
				} else {
					allasObj.setTavmunka(false);
				}
				//segédváltozó az object feltöltéséhez
				Date publikaicioIdejeTemp = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[5]);
				allasObj.setPublikacioIdeje(publikaicioIdejeTemp);
				
				//4. lépés: hozzáadjuk a listához a feltöltött állás objectet
				allasokLista.add(allasObj);

				
				
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
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return allasokLista;	
		
	}

}
