package eu.pontsystems.javatanfolyam.shelter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.shelter.entity.Dog;
import eu.pontsystems.javatanfolyam.shelter.service.DogService;

@Controller
public class DogListController {

	@Autowired
	private DogService ds;
	
	@GetMapping("dogs/list")
	public String viewList(Model model) {
		
		List<Dog> all = ds.getAll();
		
		model.addAttribute("dogs", all);
		
		return "doglist";
		
	}
	
}
