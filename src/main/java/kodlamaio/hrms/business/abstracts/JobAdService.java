package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;

public interface JobAdService {
	Result add(JobAd jobAd);
	DataResult<List<JobAd>> getByIsActive(boolean isActive);
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getAllSortedByDate();
	DataResult<List<JobAd>> getByCompanyContainsNameAndIsActive(String companyName, boolean isActive);
	DataResult<Integer> updateIsActive(int id, boolean isActive);
}
