package balkezesek;

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
	
	public List<BalkezesTarolo> fajlBeolvas (String fajlNev) {
		
		List<BalkezesTarolo> balkezesek = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			br.readLine();
			
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				BalkezesTarolo balkezesObj = new BalkezesTarolo();
				
				Date elsoTempDatum = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[1]);
				Date utolsoTempDatum = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[2]);
				
				balkezesObj.setNev(sorAdatok[0]);
				balkezesObj.setElso(elsoTempDatum);
				balkezesObj.setUtolso(utolsoTempDatum);
				balkezesObj.setSuly(Short.parseShort(sorAdatok[3]));
				balkezesObj.setMagassag(Short.parseShort(sorAdatok[4]));
				
				balkezesek.add(balkezesObj);
				
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
		
		return balkezesek;
		
	}

}
