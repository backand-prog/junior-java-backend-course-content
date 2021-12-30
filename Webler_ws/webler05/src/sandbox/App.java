package sandbox;

public class App {

	public static void main(String[] args) {
		Proba probacska = new Proba();
		Proba proba = new Proba() {
			public void shout() {
				System.out.println("Wooooo");
			} public void cry() {
				System.out.println("Brühühü");
			} public void threat() {
				System.out.println("Give me the money or i'll kill you");
			}
		};
		probacska.shout();
		proba.shout();
		proba.cry();
		proba.threat();
		
		
	}

}
