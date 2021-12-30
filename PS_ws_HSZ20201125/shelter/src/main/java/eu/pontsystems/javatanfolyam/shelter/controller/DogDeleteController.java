package eu.pontsystems.javatanfolyam.shelter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.shelter.entity.Dog;
import eu.pontsystems.javatanfolyam.shelter.service.DogService;

@Controller
public class DogDeleteController {

	@Autowired
	private DogService ds;
	
	@GetMapping("dogs/delete/{id}")
	public String viewDeleteDog(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dog", ds.getDog(id));
		return "deletedog";

	}
	
	@PostMapping("dogs/delete/{id}")
	public String deleteDog(Dog dogObj) {
		ds.deleteDog(dogObj);
		return "redirect:/dogs/list";
		
	}
	
}
