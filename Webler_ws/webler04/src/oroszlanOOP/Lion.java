package oroszlanOOP;

public class Lion {

	/****** fields ******/
	private String name;
	private int age;
	private double weight;
	
	/******** constructor ********/
	
	public Lion(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//empty constructor
	public Lion() {
		
	}

	/****** getters/setters *******/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	/****** own methods ******/
	
	//every sleeping hours means 0.1 kilos for the lion
	public void sleep(int hours) {
		
		this.weight -= hours*0.1; 
		
	}
	
	//every time the lions eats, it gets 4 kilos heavier
	public void eat() {
		
		this.weight += 4; 	
		
	}
	
	//if the hunt is successful, we call the eat() method
	//otherwise it loses 3 kilos
	
	public void hunt(boolean successful) {
		if (successful) {
			this.eat();
		} else {
			this.weight -= 3;
		}
	
		
	}
	
	
}
