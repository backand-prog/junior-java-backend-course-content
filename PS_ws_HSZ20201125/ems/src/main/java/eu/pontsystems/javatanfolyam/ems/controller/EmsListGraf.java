package eu.pontsystems.javatanfolyam.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.ems.service.EmployeeService;

@Controller
public class EmsListGraf {

	@Autowired
	private EmployeeService es;
	
	@GetMapping("emp/graf")
	public String viewGrafs(Model model) {
		model.addAttribute("emp", es.getAllGraf());
		return "listgraf";
	}
}
