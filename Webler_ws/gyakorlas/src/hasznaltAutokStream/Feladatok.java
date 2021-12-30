package hasznaltAutokStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.OptionalDouble;

public class Feladatok {

	public void adatokKiir (List<AutoTarolo> autok) {
		
		autok.stream()
			.forEach(x -> System.out.println(
					x.getAzonosito() + "\t" +
					x.getMarka() + "\t" +
					x.getTipus() + "\t" + 
					x.getMotor_terfogat() + "\t" + 
					x.getSzallithato_szemelyek() + "\t" + 
					x.getEvjarat() + "\t" + 
					x.getAr() + "\t" + 
					x.getKilometer() + "\t" + 
					x.getUzemanyag()
					));
		
	}
	
	public long autokDb(List<AutoTarolo> autok) {
		
		return autok.stream().count();
		
	}
	
	public OptionalDouble atlagArBenzin(List<AutoTarolo> autok) {
		
		OptionalDouble atlagArBenzin =  autok.stream()
				.filter(x -> x.getUzemanyag().equals("benzin"))
				.mapToDouble(x -> x.getAr().intValue())
				.average();
		
		return atlagArBenzin;

	}
	
	public OptionalDouble atlagKilometerDizel(List<AutoTarolo> autok) {
		
		OptionalDouble atlagKmDizel = autok.stream()
				.filter(x -> x.getUzemanyag().equals("dízel"))
				.mapToDouble(x -> x.getKilometer().doubleValue())
				.average();
		
		return atlagKmDizel;
		
	}
	
	public Boolean hibridSzerepelNyilvantartasban(List<AutoTarolo> autok) {

		return (autok.stream().anyMatch(x -> x.getUzemanyag().equals("hibrid")));

	}
	
	public void hibasSor (List<AutoTarolo> autok) {
		/*
		autok.stream()
			.forEach(x -> Short.parseShort(x.getAzonosito().split("-")[1]) == x.getEvjarat();
		*/
	}
	
	public void ujAuto (List<AutoTarolo> autok) {
		
		
		try {
			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Az új autó azonosítója: ");
			String ujAzonosito = br.readLine();
			System.out.println("Az új autó márkája: ");
			String ujMarka = br.readLine();
			System.out.println("Az új autó azontípusaosítója: ");
			String ujTipus = br.readLine();
			System.out.println("Az új autó motortérfogata: ");
			Integer ujMotorTerfogat = Integer.parseInt(br.readLine());
			System.out.println("Az új autóban szállítható személyek száma: ");
			Byte ujSzallithatoSzemelyek = Byte.parseByte(br.readLine());
			System.out.println("Az új autó évjárata: ");
			Short ujEvjarat = Short.parseShort(br.readLine());
			System.out.println("Az új autóban eddig megetett kilométerek: ");
			Integer ujKilometer = Integer.parseInt(br.readLine());
			System.out.println("Az új autó üzemanyag típusa: ");
			String ujUzemanyag = br.readLine();
			
			AutoTarolo autoObj = new AutoTarolo();
			autoObj.setAzonosito(ujAzonosito);
			autoObj.setMarka(ujMarka);
			autoObj.setTipus(ujTipus);
			autoObj.setMotor_terfogat(ujMotorTerfogat);
			autoObj.setSzallithato_szemelyek(ujSzallithatoSzemelyek);
			autoObj.setEvjarat(ujEvjarat);
			autoObj.setKilometer(ujKilometer);
			autoObj.setUzemanyag(ujUzemanyag);
				
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
		
	
}
