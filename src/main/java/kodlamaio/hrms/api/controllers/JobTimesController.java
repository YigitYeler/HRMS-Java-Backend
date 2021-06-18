package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTimeService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobTime;

@RestController
@RequestMapping("api/jobTimes")
@CrossOrigin
public class JobTimesController {
	
	private JobTimeService jobTimeService;

	@Autowired
	public JobTimesController(JobTimeService jobTimeService) {
		super();
		this.jobTimeService = jobTimeService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobTime>> getAll() {
		return this.jobTimeService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobTime jobTime) {
		// TODO Auto-generated method stub
		return this.jobTimeService.add(jobTime);
	}
}
