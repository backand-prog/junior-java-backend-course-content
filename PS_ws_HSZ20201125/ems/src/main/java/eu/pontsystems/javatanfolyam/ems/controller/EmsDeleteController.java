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
public class EmsDeleteController {

	@Autowired
	private EmployeeService es;
	
	 @GetMapping("emp/delete/{id}")
	 public String viewDeleteEmp(Model model, @PathVariable("id") Long id) {
		 model.addAttribute("emp", es.getEmp(id));
		 return "deleteemp";
	 }
	 
	 @PostMapping("emp/delete/{id}")
	 public String deleteEmp(Employee empObj) {
		 es.deleteEmp(empObj);
		 return "redirect:/emp/list";
	 }
	
}
