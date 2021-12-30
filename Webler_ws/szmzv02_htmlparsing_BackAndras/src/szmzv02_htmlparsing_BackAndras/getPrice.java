package szmzv02_htmlparsing_BackAndras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class getPrice {

	public static void main(String[] args) {
		
		try {
			URL index = new URL("https://webler.hu/junior-java-backend-fejleszto-tanfolyam");
			BufferedReader in = new BufferedReader(new InputStreamReader(index.openStream()));
			
			String line;
						
			while ((line = in.readLine()) != null) {
				if (line.contains("szeptember")) {
					line = in.readLine();
					line = in.readLine();
					line = in.readLine();
					line = in.readLine();
					line = in.readLine();
					
					String[] lineData = line.split(">");
					String[] lineData2 = lineData[1].split("Ft");
					
					Integer price = Integer.parseInt(lineData2[0].replace(" ", ""));
					
					System.out.println("A képzés ára: " + price + " forint.");
					
					break;
					
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