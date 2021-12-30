package tanulo;

public class Tanulo {

		private String vezeteknev;
		private String keresztnev;
		private double atlag;
		
		public Tanulo(String vezeteknev, String keresztnev, double atlag) {
			super();
			this.vezeteknev = vezeteknev;
			this.keresztnev = keresztnev;
			this.atlag = atlag;
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

		public double getAtlag() {
			return atlag;
		}

		public void setAtlag(double atlag) {
			this.atlag = atlag;
		}
		
		
		public void printData () {
			System.out.println("A tanuló vezetékneve: " + this.getVezeteknev());
			System.out.println("A tanuló keresztneve: " + this.getKeresztnev());
			System.out.println("A tanuló átlaga: " + this.getAtlag());
		}
		
		public void alertParent() {
			if (this.getAtlag() < 2) {
				System.out.println("Értesíteni kell a szülõt!");
			} else {
				System.out.println("Nem kell értesíteni a szülõt.");
			}
		}
		
		public void getPraise() {
			if (this.getAtlag() >= 4.5) {
				System.out.println("Kap dícséretet!");
			} else {
				System.out.println("Nem kap dícséretet.");
			}
		}
	
}
