package eu.pontsystems.javatanfolyam.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.stock.entity.Stock;
import eu.pontsystems.javatanfolyam.stock.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository sr;
	
	public List<Stock> getAll(){
		return sr.findAll();
	}

	public Object getStock(Long id) {
		
		return sr.getOne(id);
	}

	public void saveStock(Stock stockObj) {
		sr.save(stockObj);
		
	}

	public void deleteStock(Stock stockObj) {
		sr.delete(stockObj);
		
	}

}
