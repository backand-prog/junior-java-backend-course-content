package eu.pontsystems.javatanfolyam.shelter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.shelter.entity.Dog;
import eu.pontsystems.javatanfolyam.shelter.repository.DogRepository;

@Service
public class DogService {

	@Autowired
	private DogRepository dr;

	public List<Dog> getAll() {
		
		return dr.findAll();
		
	}

	public void saveDog(Dog dogObj) {
		
		if (dogObj.getId() == null) {
			dogObj.setStatus("IN_PROGRESS");
		}
		dr.save(dogObj);
	}

	public Object getDog(Long id) {
		return dr.getOne(id);
	}

	public void deleteDog(Dog dogObj) {
		dr.delete(dogObj);
	}

	public List<Dog> getAllAccepted() {
		return dr.findByStatus("ACCEPTED");
	}

	public List<Dog> getAllRejected() {
		return dr.findByStatus("REJECTED");

	}

	public List<Dog> getAllInprog() {
		
		return dr.findByStatus("IN_PROGRESS");
	}

}
