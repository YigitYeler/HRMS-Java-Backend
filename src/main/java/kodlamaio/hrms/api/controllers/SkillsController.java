package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("api/skills")
public class SkillsController {
	private SkillService skillService;
	
	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Skill>> getAll() {
		// TODO Auto-generated method stub
		return this.skillService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		// TODO Auto-generated method stub
		return this.skillService.add(skill);
	}
}
