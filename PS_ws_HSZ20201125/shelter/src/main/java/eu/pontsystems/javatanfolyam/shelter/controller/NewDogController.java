package eu.pontsystems.javatanfolyam.shelter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.shelter.entity.Dog;
import eu.pontsystems.javatanfolyam.shelter.service.DogService;

@Controller
public class NewDogController {

	@Autowired
	private DogService ds;
	
	@GetMapping("dogs/new")
	public String viewNew(Model model) {
		return "newdog";
	}
	
	@PostMapping("dogs/new")
	public String saveNewDog(Dog dogObj) {
		ds.saveDog(dogObj);
		return "redirect:list";
	}
	
}
