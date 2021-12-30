package eu.pontsystems.javatanfolyam.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.stock.entity.Stock;
import eu.pontsystems.javatanfolyam.stock.service.StockService;

@Controller
public class StockListController {
	
	@Autowired
	private StockService ss;
	
	@GetMapping("stock/list")
	public String viewStock(Model model) {
		List<Stock> all = ss.getAll();
		
		model.addAttribute("stocks", all);
		
		return "stocklist";
	}

}
