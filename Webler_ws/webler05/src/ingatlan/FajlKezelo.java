package ingatlan;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {
	
	public List<IngatlanTarolo> fajlBeolvas(String fajlNev) {
		
		List<IngatlanTarolo> ingatlanok = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(fajlNev), "UTF-8"));
			br.readLine();
			while (br.ready()) {
				IngatlanTarolo ingatlanObj = new IngatlanTarolo();
				String sor = br.readLine();
				String[] sorDarabolva = sor.split(";");
				ingatlanObj.setAzonosíto(sorDarabolva[0]);
				ingatlanObj.setKerulet(sorDarabolva[1]);
				ingatlanObj.setAlapterulet(Short.parseShort(sorDarabolva[2]));
				ingatlanObj.setSzobakSzama(Byte.parseByte(sorDarabolva[3]));
				ingatlanObj.setErtekesitoNeve(sorDarabolva[4]);
				if (Integer.parseInt(sorDarabolva[5]) == 1) {
					ingatlanObj.setEladva(true);
				} else {
					ingatlanObj.setEladva(false);
				}
				
				ingatlanok.add(ingatlanObj);
				
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
		
		return ingatlanok;
		
	}
	

}
