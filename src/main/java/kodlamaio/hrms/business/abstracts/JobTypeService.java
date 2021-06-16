package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobType;

public interface JobTypeService {
	DataResult<List<JobType>> getAll();
	Result add(JobType jobType);
}
