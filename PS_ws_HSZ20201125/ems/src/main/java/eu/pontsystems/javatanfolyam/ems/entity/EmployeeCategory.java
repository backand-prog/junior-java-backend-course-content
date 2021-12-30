package eu.pontsystems.javatanfolyam.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_category")
public class EmployeeCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY, optional=false, cascade=CascadeType.ALL, mappedBy="employeeCategory")
	private Employee employee;

	public EmployeeCategory(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmployeeCategory() {
		
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "EmployeeCategory id: "+id+"name: "+name;
	}
	
}
