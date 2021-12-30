package eu.pontsystems.javatanfolyam.ems.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private Integer categoryId;
	
	@OneToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="categoryId", nullable=false, insertable=false, updatable=false)
	private EmployeeCategory employeeCategory;

	public Employee(Long id, String firstName, String lastName, Integer categoryId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.categoryId = categoryId;
	}
	
	public Employee() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public EmployeeCategory getEmployeeCategory() {
		return employeeCategory;
	}

	public void setEmployeeCategory(EmployeeCategory employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	@Override
	public String toString() {
		return "EmployeeCategory id: "+id+"name: "+lastName + " " + firstName;
	}
}