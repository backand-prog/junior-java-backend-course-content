package diak;

public class Diak {

		private String vezeteknev;
		private String keresztnev;
		private int igazolatlanOrak;
		public Diak(String vezeteknev, String keresztnev, int igazolatlanOrak) {
			super();
			this.vezeteknev = vezeteknev;
			this.keresztnev = keresztnev;
			this.igazolatlanOrak = igazolatlanOrak;
		}
		
		public String getVezeteknev() {
			return vezeteknev;
		}
		public void setVezeteknev(String vezeteknev) {
			this.vezeteknev = vezeteknev;
		}
		public String getKeresztnev() {
			return keresztnev;
		}
		public void setKeresztnev(String keresztnev) {
			this.keresztnev = keresztnev;
		}
		public int getIgazolatlanOrak() {
			return igazolatlanOrak;
		}
		public void setIgazolatlanOrak(int igazolatlanOrak) {
			this.igazolatlanOrak = igazolatlanOrak;
		}
		
		
		public boolean alertParents() {
			
			boolean haveToAlert = false;
			
			if (this.igazolatlanOrak > 10) {
				haveToAlert = true;
				} else {
				haveToAlert = false;
			}
			
			return haveToAlert;
			
		}
		
		public void letter () {
			System.out.println("Tisztelt Szülõk! \nGyermekük: " + this.vezeteknev + " " + this.keresztnev +  ", igazolatlan " + 
					"hiányzásainak száma elérte a(z) " + this.igazolatlanOrak + " –t!. Kérjük Önöket mihamarabb fáradjanak be iskolánkba! "
							+ "\nÜdvözlettel: Iskolavezetés.");
		}

}
