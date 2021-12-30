package kezisek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FaljKezelo {
	
	public List<JatekosTarolo> FajlBeolvas (String fajlNev) {
		
		List<JatekosTarolo> jatekosok = new ArrayList<>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			br.readLine();
			
			while (br.ready()) {
				
				JatekosTarolo jatekosObj = new JatekosTarolo();
				
				String sor = br.readLine();
				String[] jatekosAdatok = sor.split("\t");
				
				jatekosObj.setAzonosito(Byte.parseByte(jatekosAdatok[0]));
				jatekosObj.setNev(jatekosAdatok[1]);
				jatekosObj.setPoszt(jatekosAdatok[2]);
				jatekosObj.setGolokSzama(Byte.parseByte(jatekosAdatok[3]));
				if (Byte.parseByte(jatekosAdatok[4]) == 1) {
					jatekosObj.setSerult(true);
				} else {
					jatekosObj.setSerult(false);
				}
				
				jatekosObj.setMerkozesekSzama(Byte.parseByte(jatekosAdatok[5]));
				
				
				jatekosok.add(jatekosObj);
				
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
		
		return jatekosok;
		
	}
	
	public void ujFajl (List<JatekosTarolo> jatekosok, String fajlNev) {
		
		try {
			
			FileOutputStream fs = new FileOutputStream(fajlNev);
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			for (JatekosTarolo item : jatekosok) {
				out.write(item.getAzonosito().toString());
				out.write("\t");
				out.write(item.getNev());
				out.write("\t");
				out.write(item.getPoszt());
				out.write("\t");
				out.write(item.getGolokSzama().toString());
				out.write("\t");
				if (item.getSerult()) {
					out.write("1");
				} else {
					out.write("0");
				}
				out.write("\t");
				out.write(item.getMerkozesekSzama().toString());
				
				out.write("\n");
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
