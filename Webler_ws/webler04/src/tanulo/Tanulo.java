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
			System.out.println("A tanul� vezet�kneve: " + this.getVezeteknev());
			System.out.println("A tanul� keresztneve: " + this.getKeresztnev());
			System.out.println("A tanul� �tlaga: " + this.getAtlag());
		}
		
		public void alertParent() {
			if (this.getAtlag() < 2) {
				System.out.println("�rtes�teni kell a sz�l�t!");
			} else {
				System.out.println("Nem kell �rtes�teni a sz�l�t.");
			}
		}
		
		public void getPraise() {
			if (this.getAtlag() >= 4.5) {
				System.out.println("Kap d�cs�retet!");
			} else {
				System.out.println("Nem kap d�cs�retet.");
			}
		}
	
}
