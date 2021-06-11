package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

public interface SkillService {
	DataResult<List<Skill>> getAll();
	Result add(Skill skill);
}
