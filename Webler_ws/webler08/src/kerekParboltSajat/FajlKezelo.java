package kerekParboltSajat;

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

	public List<Kerekpar> fajlBeolvas (String fajlNev) {
		
		List<Kerekpar> kerekparok = new ArrayList<Kerekpar>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("kerekparok.csv"), "UTF-8"));
			String elsoSor = br.readLine();
			
			while (br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Boolean hasznalt = (Integer.parseInt(sorAdatok[4])==1) ? true : false;
				Date datumTemp = new SimpleDateFormat("yyyy.MM.dd").parse(sorAdatok[6]);
				
				Kerekpar kerekparObj = new Kerekpar(
						Integer.parseInt(sorAdatok[0]), 
						sorAdatok[1], 
						sorAdatok[2], 
						Integer.parseInt(sorAdatok[3]), 
						hasznalt, 
						Byte.parseByte(sorAdatok[5]), 
						datumTemp
						);
				
				kerekparok.add(kerekparObj);
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
		
		return kerekparok;
		
		
	}
	
}
