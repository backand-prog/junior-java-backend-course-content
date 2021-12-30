package hasznaltAutok;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Fajlkezelo {

	public List<AutoTarolo> fajlBetolt (String fajlNev) {
		
		List<AutoTarolo> autokLista = new ArrayList<>();
				
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(fajlNev), "UTF-8"));
			br.readLine();
			
			while (br.ready()) {
				AutoTarolo autoObj = new AutoTarolo();
				String sor = br.readLine();
				String[] sorElemek = sor.split("\t");
				
				autoObj.setAzonosito(sorElemek[0]);
				autoObj.setMarka(sorElemek[1]);
				autoObj.setTipus(sorElemek[2]);
				autoObj.setMotorTerfogat(Short.parseShort(sorElemek[3]));
				autoObj.setSzallithatoSzemelyek(Byte.parseByte(sorElemek[4]));
				autoObj.setEvjarat(Short.parseShort(sorElemek[5]));
				autoObj.setAr(Integer.parseInt(sorElemek[6]));
				autoObj.setKilometer(Integer.parseInt(sorElemek[7]));
				autoObj.setUzemanyag(sorElemek[8]);
				
				autokLista.add(autoObj);
			
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
		
		return autokLista;
		
	}
	
	
	
	
}
