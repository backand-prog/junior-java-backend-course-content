package eu.pontsystems.javatanfolyam.shelter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shelter")
public class Dog {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer age;
	private String status;
	
	public Dog(Long id, String name, Integer age, String status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
	}
	
	public Dog() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "Dog id: "+id+"name: "+name+"age: "+age+"status "+status;
	}

	
	
}
