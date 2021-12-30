package users;

public class User {
	
	private String felhasznaloNev = null;
	private int kor = 0;
	private String neme = null;
	private String hobbi = null;

	public String getFelhasznaloNev() {
		return felhasznaloNev;
	}

	public void setFelhasznaloNev(String felhasznaloNev) {
		this.felhasznaloNev = felhasznaloNev;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public String getNeme() {
		return neme;
	}

	public void setNeme(String neme) {
		this.neme = neme;
	}

	public String getHobbi() {
		return hobbi;
	}

	public void setHobbi(String hobbi) {
		this.hobbi = hobbi;
	}

}
