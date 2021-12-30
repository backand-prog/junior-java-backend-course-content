package eu.pontsystems.javatanfolyam.car.service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository cr;

	public List<Car> findAll() {
		return cr.findAll();
	}

	public void saveCar(Car carObj) {
		cr.save(carObj);
		
	}

	public Car getCar(Long id) {
		return cr.getOne(id);

	}

	public void deleteCar(Car carObj) {
		cr.delete(carObj);

	}

	public List<Car> getVets() {

		List<Car> allCars = cr.findAll();

		Calendar dateTime = Calendar.getInstance();
		Integer currentYear = dateTime.get(dateTime.YEAR);
		List<Car> vetCars = allCars.stream()
				.filter(x -> x.getGyartasiEv() <= (currentYear - 30)).collect(Collectors.toList());
		return vetCars;
	}

}