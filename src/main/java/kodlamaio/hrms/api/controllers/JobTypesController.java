package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTypeService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobType;

@RestController
@RequestMapping("api/jobTypes")
@CrossOrigin
public class JobTypesController {
	private JobTypeService jobTypeService;

	@Autowired
	public JobTypesController(JobTypeService jobTypeService) {
		super();
		this.jobTypeService = jobTypeService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobType>> getAll() {
		return this.jobTypeService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobType jobType) {
		// TODO Auto-generated method stub
		return this.jobTypeService.add(jobType);
	}
}
