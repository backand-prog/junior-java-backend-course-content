package eu.pontsystems.javatanfolyam.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarEditController {

	@Autowired
	private CarService cs; 
	
	@GetMapping("car/edit/{id}")
	public String viewCarEdit(Model model, @PathVariable("id") Long id) {
		model.addAttribute("car", cs.getCar(id));
		return "editcar";
	}
	
	@PostMapping("car/edit/{id}")
	public String editCar(Car carObj) {
		cs.saveCar(carObj);
		return "redirect:/car/list";
	}
	
}
