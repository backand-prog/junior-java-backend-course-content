package birds;

public class ParkRanger {
	
	
	
	public static void main(String[] args) {
		
		Dogs dog1= new Dogs("Bl�ki");
		
		System.out.println(dog1.hashCode());
		
		dog1 = new Dogs("Zafira");
		
		System.out.println(dog1.hashCode());
		
	}

}
