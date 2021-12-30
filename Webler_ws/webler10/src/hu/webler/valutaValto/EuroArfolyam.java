package hu.webler.valutaValto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class EuroArfolyam {

	public static void main(String[] args) {
		
		try {
			URL index = new URL("https://www.index.hu");
			BufferedReader in = new BufferedReader(new InputStreamReader(index.openStream()));
			
			String sor;
			
			while ((sor = in.readLine()) != null) {
				if (sor.contains("EUR")) {
					sor = in.readLine();
					sor = in.readLine();
					sor = sor.trim();  //a trim kiszedi a whitespaceket az elejérõl és a végérõl
					String[] sorAdatok = sor.split(" ");
					String arfolyamString = sorAdatok[0];
					
					float eurArfolyam = Float.parseFloat(arfolyamString.replace(",", "."));
					System.out.println("12 EUR ennyi Ft: " + 12*eurArfolyam);
					
					
					
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
