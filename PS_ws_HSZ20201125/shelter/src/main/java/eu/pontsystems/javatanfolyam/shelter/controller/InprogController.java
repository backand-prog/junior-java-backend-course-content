package eu.pontsystems.javatanfolyam.shelter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.shelter.service.DogService;

@Controller
public class InprogController {

	@Autowired
	private DogService ds;
	
	@GetMapping("dogs/inprog")
	public String listAllInprog(Model model) {
		
		model.addAttribute("dogs", ds.getAllInprog());
		
		return "listinprog";
		
	}
	
}
