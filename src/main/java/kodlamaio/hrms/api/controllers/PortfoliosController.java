package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.PortfolioService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.Portfolio;

@RestController
@RequestMapping("/api/portfolios")
public class PortfoliosController {
	
	private PortfolioService portfolioService;
	
	@Autowired
	public PortfoliosController(PortfolioService portfolioService) {
		super();
		this.portfolioService = portfolioService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Portfolio portfolio) {
		return this.portfolioService.add(portfolio);
	}

	@GetMapping("/getAll")
	public DataResult<List<Portfolio>> getAll() {
		return this.portfolioService.getAll();
	}
	
	@PostMapping("/saveImg")
	public Result saveImg(@RequestBody MultipartFile myFile, int id) {
		return this.portfolioService.saveImg(myFile , id);
	}
}
