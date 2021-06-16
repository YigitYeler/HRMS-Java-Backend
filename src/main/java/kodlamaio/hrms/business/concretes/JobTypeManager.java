package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTypeService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTypeDao;
import kodlamaio.hrms.entities.concretes.JobType;

@Service
public class JobTypeManager implements JobTypeService{
	private JobTypeDao jobTypeDao;

	@Autowired
	public JobTypeManager(JobTypeDao jobTypeDao) {
		super();
		this.jobTypeDao = jobTypeDao;
	}

	@Override
	public DataResult<List<JobType>> getAll() {
		return new SuccessDataResult<List<JobType>>(this.jobTypeDao.findAll(), "İş Tipleri Listelendi...");
	}

	@Override
	public Result add(JobType jobType) {
		// TODO Auto-generated method stub
		this.jobTypeDao.save(jobType);
		return new SuccessResult("İş Tipi Eklendi...");
	}

}
