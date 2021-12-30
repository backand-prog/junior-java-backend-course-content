package zsebtolvajok;

import java.util.Random;

public class Tolvajok {

	private String keresztnev;
	private String vezeteknev;
	private int penz;
	private int sikeresRablasokSzama;

	public Tolvajok(String keresztnev, String vezeteknev, int penz, int sikeresRablasokSzama) {
		super();
		this.keresztnev = keresztnev;
		this.vezeteknev = vezeteknev;
		this.penz = penz;
		this.sikeresRablasokSzama = sikeresRablasokSzama;
	}

	public String getKeresztnev() {
		return keresztnev;
	}

	public void setKeresztnev(String keresztnev) {
		this.keresztnev = keresztnev;
	}

	public String getVezeteknev() {
		return vezeteknev;
	}

	public void setVezeteknev(String vezeteknev) {
		this.vezeteknev = vezeteknev;
	}

	public int getPenz() {
		return penz;
	}

	public void setPenz(int penz) {
		this.penz = penz;
	}

	public int getSikeresRablasokSzama() {
		return sikeresRablasokSzama;
	}

	public void setSikeresRablasokSzama(int sikeresRablasokSzama) {
		this.sikeresRablasokSzama = sikeresRablasokSzama;
	}

	public void Rabol(int sikerEsely, int probalkozasSzam) {

		Random r = new Random();
		int randSzam = r.nextInt(sikerEsely);
		boolean sikeresRablas;
		if (randSzam == 0) {
			sikeresRablas = false;
		} else {
			sikeresRablas = true;
		}
		
		if (sikeresRablas || probalkozasSzam < sikeresRablasokSzama) {
			int zsakmany = r.nextInt((800  - 50 ) +1) +1;
			this.penz+=zsakmany;
			this.sikeresRablasokSzama++;
		}

	}

}