package lionOOP;

public class Lion {
	
	//fields
	
	private String name;
	private int age;
	private double weight;
	
	//constructor
	
	public Lion (String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	//getters/setters
		
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
	
	//methods
	
	public void sleep(int hours) {
		
		this.weight -= hours*0.1;
		
	}
	
	public void Eat() {
		
		this.weight+=4;
		
	}
	
	public boolean Hunt(boolean successful) {
		
		if (successful) {
			this.Eat();
		}
		else {
			this.weight-=3;
		}
		
		return successful;
		
	}
	
}
