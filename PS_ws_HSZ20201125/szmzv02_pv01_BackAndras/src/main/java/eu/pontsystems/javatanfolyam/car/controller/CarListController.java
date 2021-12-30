package eu.pontsystems.javatanfolyam.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarListController {

	@Autowired
	private CarService cs;
	
	@GetMapping("car/list")
	public String viewAllCar(Model model) {
		List<Car> all = cs.findAll();
		model.addAttribute("car", all);
		return "carlist";
		
	}
	
	
}
