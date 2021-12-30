package eu.pontsystems.javatanfolyam.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.ems.entity.Employee;
import eu.pontsystems.javatanfolyam.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository er;
	
	public List<Employee> getAll() {
		return er.findAll();	
	}

	public void saveEmployee(Employee empObj) {
	
		er.save(empObj);		
	}

	public Employee getEmp(Long id) {
		return er.getOne(id);
	}

	public void deleteEmp(Employee empObj) {
		er.delete(empObj);
		
	}

	public List<Employee> getAllGraf() {
		 return er.findByCategoryId(-2);
	}

	public List<Employee> getAllUgyint() {
		return er.findByCategoryId(-1);
	}

	
	
}
