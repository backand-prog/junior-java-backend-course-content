package oopRaktar;

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

	public List<EszkozTarolo> fajlbeolvas (String fajlNev) {
		List<EszkozTarolo> termekLista = new ArrayList<EszkozTarolo>();
				
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(fajlNev), "UTF-8"));
			
			
			@SuppressWarnings("unused")
			String fejlec = br.readLine();
			
			while (br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Date feltoltesDatumTemp = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[5]);
				Boolean akciosTemp = sorAdatok[6].equals("1");
				
				
				EszkozTarolo ujEszkoz = new EszkozTarolo(
						sorAdatok[0], 
						sorAdatok[1], 
						Byte.parseByte(sorAdatok[2]), 
						Integer.parseInt(sorAdatok[3]),
						Integer.parseInt(sorAdatok[4]),
						feltoltesDatumTemp, 
						akciosTemp);
				
				termekLista.add(ujEszkoz);
				
				
				
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
		
		return termekLista;
	}
	
	public void notebookFajlbaIr(List<EszkozTarolo> termekLista) {
		
		
		try {
			FileOutputStream fs = new FileOutputStream("notebook.txt");
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			for (EszkozTarolo item: termekLista) {
				if(item.getKategoriaId()==2) {
					out.write(item.getLeltarSzam().toString());
					out.write(";");
					out.write(item.getMegnevezes().toString());
					out.write(",");
					out.write(item.getKategoriaId().toString());
					out.write(",");
					out.write(item.getAr().toString());
					out.write(",");
					out.write(item.getRaktarMennyiseg().toString());
					out.write(",");
					out.write(item.getRaktarMennyiseg().toString());
					out.write(",");
					SimpleDateFormat dateTemp = new SimpleDateFormat("yyyy-MM-dd");
					String dateStringTemp = dateTemp.format(item.getFeltoltesDatum());
					out.write(dateStringTemp);
					out.write(";");
					if (item.getAkcios()) {
						out.write("1");
					} else {
						out.write("0");

					}
					
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
