package eu.pontsystems.javatanfolyam.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.ems.entity.Employee;
import eu.pontsystems.javatanfolyam.ems.service.EmployeeService;

@Controller
public class EmsListController {

	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("emp/list")
	public String viewList(Model model) {
		List<Employee> all = es.getAll();
		
		for (Employee item : all) {
			System.out.println(item);
		}
		
		model.addAttribute("employees", all);
		return "emplist";
		
	}
}
