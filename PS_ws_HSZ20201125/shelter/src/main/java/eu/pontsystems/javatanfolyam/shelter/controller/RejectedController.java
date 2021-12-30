package eu.pontsystems.javatanfolyam.shelter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.shelter.service.DogService;

@Controller
public class RejectedController {

	@Autowired
	private DogService ds;
	
	@GetMapping("dogs/rejected")
	public String listAllRejected(Model model) {
		model.addAttribute("dogs", ds.getAllRejected());
		return "listrejected";
	}
}
