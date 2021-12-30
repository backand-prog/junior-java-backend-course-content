package eu.pontsystems.javatanfolyam.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarNewController {

	
	@Autowired
	private CarService cs;
	
	@GetMapping("car/new")
	public String viewNewCar() {
		return "newcar";
		
	}
	
	@PostMapping("car/new")
	public String saveNewCar(Car carObj) {
		cs.saveCar(carObj);		
		return "redirect:list";
	}
}
