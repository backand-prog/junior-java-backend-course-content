package eu.pontsystems.javatanfolyam.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.ems.service.EmployeeService;

@Controller
public class EmsListUgyint {

	@Autowired
	private EmployeeService es;
	
	@GetMapping("emp/ugyint")
	public String viewAllUgyint(Model model) {
		model.addAttribute("emp", es.getAllUgyint());
		return "listugyint";
	};
	
}
