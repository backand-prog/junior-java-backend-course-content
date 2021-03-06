package kosar2004;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FajlKezelo {

	public List<KosarasTarolo> fajlBeolvas(String fajlNev) {

		List<KosarasTarolo> merkozesek = new ArrayList<>();

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));

			br.readLine();

			while (br.ready()) {

				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");

				Date idopontTemp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sorAdatok[5] + " 00:00:00");
				
				

				KosarasTarolo meccs = new KosarasTarolo (
						sorAdatok[0],
						sorAdatok[1],
						Integer.parseInt(sorAdatok[2]),
						Integer.parseInt(sorAdatok[3]),
						sorAdatok[4],
						idopontTemp
						);

				merkozesek.add(meccs);

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

		return merkozesek;

	}

}