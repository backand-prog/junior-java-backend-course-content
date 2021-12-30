package eu.pontsystems.javatanfolyam.shelter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.javatanfolyam.shelter.entity.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

	List<Dog> findByStatus(String string);
	
}
