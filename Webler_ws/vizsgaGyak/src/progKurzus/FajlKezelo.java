package progKurzus;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FajlKezelo {
	
	public List<Tanulok> fajlBeolvas(String fajlNev) {
		
		List<Tanulok> tanulok = new ArrayList<Tanulok>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			
			
			while (br.ready()) {
				
				Tanulok tanulo = new Tanulok();
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				
				int befizetettOsszeg = Integer.parseInt(sorAdatok[3].substring(1));
				
				tanulo.setNev(sorAdatok[0]);
				tanulo.setNem(sorAdatok[1]);
				tanulo.setFinanszKod(Byte.parseByte(sorAdatok[2]));
				tanulo.setBefizetettOsszeg(befizetettOsszeg);
				tanulo.setProgEredmeny(Byte.parseByte(sorAdatok[4]));
				tanulo.setGrafEredmeny(Byte.parseByte(sorAdatok[5]));
				tanulo.setArchitektEredmeny(Byte.parseByte(sorAdatok[6]));
				tanulo.setMestintEredmeny(Byte.parseByte(sorAdatok[7]));
				
				tanulok.add(tanulo);
				
				
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
		
		return tanulok;
		
		
	}
	
	public void fajlbaIr (List<Tanulok> tanulok) {
		
		try {
			FileWriter fw = new FileWriter("eredmeny.txt");
			
			
				Map<String, Integer> nemBukottak = new HashMap<>();
				for (Tanulok tanulo : tanulok) {
					if (tanulo.getProgEredmeny() > 50 && tanulo.getMestintEredmeny() > 50 && tanulo.getGrafEredmeny() > 50 && tanulo.getArchitektEredmeny() > 50) {
						nemBukottak.put(tanulo.getNev(), (tanulo.getProgEredmeny() + tanulo.getMestintEredmeny() + tanulo.getArchitektEredmeny() + tanulo.getGrafEredmeny()));
					}
				}
				
				Map<String, Integer> sortedMap = nemBukottak.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
				
				for (Entry<String, Integer> item : sortedMap.entrySet()) {
					fw.write(item.getKey() + ";" + item.getValue());
					fw.write("\r\n");
				}
				/*
				if (item.getProgEredmeny() > 50 && item.getMestintEredmeny() > 50 && item.getGrafEredmeny() > 50 && item.getArchitektEredmeny() > 50) {
					
					
					fw.write(item.getNev() + ";" + (item.getProgEredmeny() + item.getMestintEredmeny() + item.getArchitektEredmeny() + item.getGrafEredmeny()));
					fw.write("\r\n");
				}
				*/
			

			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
 