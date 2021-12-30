package eu.pontsystems.javatanfolyam.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.ems.entity.Employee;
import eu.pontsystems.javatanfolyam.ems.service.EmployeeService;

@Controller
public class EmsEditController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping("emp/edit/{id}")
	public String viewEditEmp(Model model, @PathVariable("id") Long id) {
		model.addAttribute("emp", es.getEmp(id));
		return "editemp";
	}
	
	@PostMapping("emp/edit/{id}")
	public String editEmp(Employee empObj) {
		es.saveEmployee(empObj);
		return "redirect:/emp/list";
	}
	
}
