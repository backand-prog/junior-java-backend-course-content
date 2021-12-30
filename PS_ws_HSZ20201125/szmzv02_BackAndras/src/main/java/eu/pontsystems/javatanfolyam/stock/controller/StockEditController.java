package eu.pontsystems.javatanfolyam.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.stock.entity.Stock;
import eu.pontsystems.javatanfolyam.stock.service.StockService;

@Controller
public class StockEditController {

	@Autowired
	private StockService ss;
	
	@GetMapping("stock/edit/{id}")
	public String viewEditStock(Model model, @PathVariable("id") Long id) {
		model.addAttribute("stock", ss.getStock(id));
		return "editstock";
	}
	
	@PostMapping("stock/edit/{id}")
	public String editEmp(Stock stockObj) {
		ss.saveStock(stockObj);
		return "redirect:/stock/list";
	}
}
