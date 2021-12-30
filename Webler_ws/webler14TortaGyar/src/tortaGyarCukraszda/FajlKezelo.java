package tortaGyarCukraszda;

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

public class FajlKezelo {


	public List<Torta> fajlBeolvas(String fajlNev){

		List<Torta> tortaLista = new ArrayList<Torta>();

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));

			String fejlec = br.readLine();

			while (br.ready()) {

				String sor = br.readLine();
				String[] sorAdat = sor.split(";");

				Boolean akcios = sorAdat[4].equals("1") ? true : false;
				Boolean gm = sorAdat[5].equals("1") ? true : false;
				// Boolean lm = sorAdat[6].equals("1") ? true : false;

				Boolean lm = false;
				if (Integer.parseInt(sorAdat[6]) == 1) {
					lm = true;
				}


				Torta ujTortaObj = new Torta(
						sorAdat[0], 
						sorAdat[1], 
						Integer.parseInt(sorAdat[2]), 
						Short.parseShort(sorAdat[3]), 
						akcios, 
						gm, 
						lm);

				tortaLista.add(ujTortaObj);

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

		return tortaLista;

	}

	public void bruttoArakFajlbaIr(List<Torta> tortaLista) {

		try {
			FileOutputStream fs = new FileOutputStream("tortaGyar_brutto.csv");
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");

			out.write("azonosito;megnevezes;netto_ar;szeletes;akcios;gm;lm");
			out.write("\n");
			for (Torta item : tortaLista) {
				out.write(item.getAzonosito().toString());
				out.write(";");
				out.write(item.getMegnevezes().toString());
				out.write(";");
				out.write(item.getNettoAr().toString());
				out.write(";");
				if (item.getAkcios()) {
					out.write(1 + "");
				} else {
					out.write(0 + "");
				}
				out.write(";");
				if (item.getGm()) {
					out.write(1 + "");
				} else {
					out.write(0 + "");
				}
				out.write(";");
				if (item.getLm()) {
					out.write(1 + "");
				} else {
					out.write(0 + "");
				}
				out.write(";");
				out.write("\n");

			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("A fájl sikeresen létrehozva");

	}

}