package hasznaltAutokStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {

	public List<AutoTarolo> fajlBeolvas (String fajlNev) {
		
		List<AutoTarolo> autok = new ArrayList<AutoTarolo>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			String firstLine = br.readLine();
			
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split("\t");
								
				AutoTarolo autoObj = new AutoTarolo();
				autoObj.setAzonosito(sorAdatok[0]);
				autoObj.setMarka(sorAdatok[1]);
				autoObj.setTipus(sorAdatok[2]);
				autoObj.setMotor_terfogat(Integer.parseInt(sorAdatok[3]));
				autoObj.setSzallithato_szemelyek(Byte.parseByte(sorAdatok[4]));
				autoObj.setEvjarat(Short.parseShort(sorAdatok[5]));
				autoObj.setAr(Integer.parseInt(sorAdatok[6]));
				autoObj.setKilometer(Integer.parseInt(sorAdatok[7]));
				autoObj.setUzemanyag(sorAdatok[8]);

				autok.add(autoObj);
				
			}
			
			br.close();
			
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return autok;
		
	}
	
}
