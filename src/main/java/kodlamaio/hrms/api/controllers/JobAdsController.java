package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;

@RestController
@RequestMapping("/api/jobads")
public class JobAdsController {
	
	private JobAdService jobAdService;

	@Autowired
	public JobAdsController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAd jobAd) {
		return this.jobAdService.add(jobAd);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAd>> getAll() {
		return this.jobAdService.getAll();
	}
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAd>> getByIsActive() {
		return this.jobAdService.getByIsActive(true);
	}
	
	@GetMapping("/getAllSortedByDate")
	public DataResult<List<JobAd>> getAllSortedByDate() {
		return this.jobAdService.getAllSortedByDate();
	}
	
	@GetMapping("/getByCompanyNameContainsAndIsActive")
	public DataResult<List<JobAd>> getByCompanyNameContainsAndIsActive(@RequestParam String companyName) {
		return this.jobAdService.getByCompanyContainsNameAndIsActive(companyName,true);
	}
	
	@PostMapping("/updateIsActive")
	public DataResult<Integer> updateIsActive(@RequestParam int id) {
		return this.jobAdService.updateIsActive(id,false);
	}
}
