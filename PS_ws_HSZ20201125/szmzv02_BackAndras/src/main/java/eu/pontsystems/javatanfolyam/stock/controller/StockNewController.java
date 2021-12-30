package eu.pontsystems.javatanfolyam.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.stock.entity.Stock;
import eu.pontsystems.javatanfolyam.stock.service.StockService;

@Controller
public class StockNewController {
	
	@Autowired
	private StockService ss;
	
	
	@GetMapping("/stock/new")
	public String viewNew(Model model) {
		return "newstock";
	}
	
	@PostMapping("stock/new")
	public String saveNewLoan(Stock stockObj) {
		ss.saveStock(stockObj);
		return "redirect:list";
	}

}
