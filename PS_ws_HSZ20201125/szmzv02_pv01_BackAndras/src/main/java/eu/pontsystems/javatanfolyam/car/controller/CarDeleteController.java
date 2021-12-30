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
public class CarDeleteController {

	@Autowired
	private CarService cs;
	
	@GetMapping("car/delete/{id}")
	public String viewDeleteCar(Model model, @PathVariable("id") Long id) {
		model.addAttribute("car", cs.getCar(id));
		return "deletecar";
		
	}

	@PostMapping("car/delete/{id}")
	public String deleteCar(Car carObj) {
		cs.deleteCar(carObj);
		return "redirect:/car/list";
	}
	
}
