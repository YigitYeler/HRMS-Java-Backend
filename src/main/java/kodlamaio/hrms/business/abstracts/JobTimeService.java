package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobTime;

public interface JobTimeService {
	DataResult<List<JobTime>> getAll();
	Result add(JobTime jobTime);
}
