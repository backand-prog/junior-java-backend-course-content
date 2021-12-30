package kerekparBolt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FajlKezelo {
	
	public List<Kerekpar> fajlBeolvas (String fajlNev) {
		List<Kerekpar> kerekparLista = new ArrayList<Kerekpar>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(fajlNev), "UTF-8"));
			
			@SuppressWarnings("unused")
			String fejlec = br.readLine();
			
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Boolean hasznalt = false;
				if (Integer.parseInt(sorAdatok[4])==1) {
					hasznalt = true;
				}
				
				Date rogzitesDatumTemp = new SimpleDateFormat("yyyy.MM.dd").parse(sorAdatok[6]);
				
				Kerekpar kerekparObj = new Kerekpar(
						Integer.parseInt(sorAdatok[0]),
						sorAdatok[1], 
						sorAdatok[2], 
						Integer.parseInt(sorAdatok[3]), 
						hasznalt, 
						Byte.parseByte(sorAdatok[5]), 
						rogzitesDatumTemp
						);
				
				kerekparLista.add(kerekparObj);
				
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
		
		return kerekparLista;
		
	}
	
	public void trekkingFerfiKerekparFajbaIr (List<Kerekpar> kerekparLista) {
		
		FileOutputStream fs;
		try {
			fs = new FileOutputStream("trekking_ferfi.csv", false);
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			out.write("cikkszám;név;típus;ár;használt;kategóriaId;rögzítésDátuma");
			out.write("\n");
			for (Kerekpar item : kerekparLista) {
				String hasznalt = item.getHasznalt() ? "1" : "0";
				if (item.getTipus().equals("trekking") && item.getKategoriaId() == 1) {
					out.write(item.getCikkszam().toString());
					out.write(";");
					out.write(item.getNev());
					out.write(";");
					out.write(item.getTipus());
					out.write(";");
					out.write(item.getAr().toString());
					out.write(";");
					out.write(hasznalt);
					out.write(";");
					out.write(item.getKategoriaId().toString());
					out.write(";");
					out.write(item.getRogzitesDatumaFormazottan());
					out.write("\n");
				}

				

			}
			
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
