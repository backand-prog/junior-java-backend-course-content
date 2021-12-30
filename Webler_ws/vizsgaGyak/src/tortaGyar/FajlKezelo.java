package tortaGyar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {
	
	public List<Tortak> fajlBeolvas(String fajlNev) {
		
		List<Tortak> tortak = new ArrayList<Tortak>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			String elsoSor = br.readLine();
			
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Tortak tortaObj = new Tortak();
				
				tortaObj.setAzonosito(sorAdatok[0]);
				tortaObj.setMegnevezes(sorAdatok[1]);
				tortaObj.setNetto_ar(Integer.parseInt(sorAdatok[2]));
				tortaObj.setSzeletes(Integer.parseInt(sorAdatok[3]));
				tortaObj.setAkcios(Integer.parseInt(sorAdatok[4]));
				tortaObj.setGm(Integer.parseInt(sorAdatok[5]));
				tortaObj.setLm(Integer.parseInt(sorAdatok[6]));
				
				tortak.add(tortaObj);
				
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
		
		return tortak; 
		
	}
	

}
