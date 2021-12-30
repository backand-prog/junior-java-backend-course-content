package eu.pontsystems.javatanfolyam.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.ems.entity.Employee;
import eu.pontsystems.javatanfolyam.ems.service.EmployeeService;

@Controller
public class EmsNewController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("emp/new")
	public String viewNew(Model model) {
		return "newemp";
	}
	
	@PostMapping("emp/new")
	public String saveNewEmp(Employee empObj) {
		es.saveEmployee(empObj);
		return "redirect:list";
	}

}
