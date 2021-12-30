package operatorok;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FajlKezelo {

	//1. feladat - adatok beolvasása és tárolása
	
	public List<OperatorTarolo> fajlBeolvas(String fajlNev) {
		
		List<OperatorTarolo> muveletSorok = new ArrayList<>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			while (br.ready()) {
				
				String sor = br.readLine();
				String[] elemek = sor.split(" ");				
				
				OperatorTarolo operatorObj = new OperatorTarolo();
				
				operatorObj.setElsoOperandus(Integer.parseInt(elemek[0]));
				operatorObj.setOperator(elemek[1]);
				operatorObj.setMasodikOperandus(Integer.parseInt(elemek[2]));
				
				muveletSorok.add(operatorObj);
				
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
		
		
		return muveletSorok;
		
	}
	
	public void eredmenyekFajlba(List<OperatorTarolo> muveletek) {
		
		FileOutputStream fs;
		try {
			fs = new FileOutputStream("eredmenyek.txt");
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			String[] muveletekOperatorok = {"+", "-", "*", "/", "div", "mod"};
			
			for (OperatorTarolo item : muveletek) {
				
				if (!Arrays.asList(muveletekOperatorok).contains(item.getOperator())) {
					out.write(item.getElsoOperandus() + " " + item.getOperator() 
					+ " " + item.getMasodikOperandus() + " = Hibás operátor!");
				} else if (item.getOperator().equals(muveletekOperatorok[0])) {
					out.write(item.getElsoOperandus() + " " + item.getOperator() 
					+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()+item.getMasodikOperandus()));
				} else if (item.getOperator().equals(muveletekOperatorok[1])) {
					out.write(item.getElsoOperandus() + " " + item.getOperator() 
					+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()-item.getMasodikOperandus()));
				} else if (item.getOperator().equals(muveletekOperatorok[2])) {
					out.write(item.getElsoOperandus() + " " + item.getOperator() 
					+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()*item.getMasodikOperandus()));
				} else if (item.getOperator().equals(muveletekOperatorok[3])) {
					if (item.getMasodikOperandus() == 0) {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = Hibás mûvelet!");
					}else {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()/item.getMasodikOperandus()));
					}	
				} else if (item.getOperator().equals(muveletekOperatorok[4])) {
					if (item.getMasodikOperandus() == 0) {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = Hibás mûvelet!");
					}else {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()/item.getMasodikOperandus()));
					}	
				} else if (item.getOperator().equals(muveletekOperatorok[5])) {
					if (item.getMasodikOperandus() == 0) {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = Hibás mûvelet!");
					}else {
						out.write(item.getElsoOperandus() + " " + item.getOperator() 
						+ " " + item.getMasodikOperandus() + " = " + (item.getElsoOperandus()%item.getMasodikOperandus()));
					}	
				}
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
