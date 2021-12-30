package eu.pontsystems.javatanfolyam.stock.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import eu.pontsystems.javatanfolyam.stock.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
