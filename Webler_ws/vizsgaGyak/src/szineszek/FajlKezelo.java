package szineszek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FajlKezelo {
	
	public List<SzineszTarolo> fajlBeolvas(String fajlNev) {
		
		List<SzineszTarolo> szineszek = new ArrayList<>();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			while (br.ready()) {
				
				SzineszTarolo szineszObj = new SzineszTarolo();
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split("\t");

				
				Date datum = new SimpleDateFormat("yyyy.MM.dd").parse(sorAdatok[2]);
				
				szineszObj.setNev(sorAdatok[0]);
				szineszObj.setNem(Integer.parseInt(sorAdatok[1]));
				szineszObj.setSzulDatum(datum);
				szineszObj.setSzulVaros(sorAdatok[3]);
				szineszObj.setSzulOrszag(sorAdatok[4]);
				szineszObj.setFilmSzam(Short.parseShort(sorAdatok[5]));

				szineszek.add(szineszObj);
				
			}
			
			br.close();
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		return szineszek;
		
		
	}

}
