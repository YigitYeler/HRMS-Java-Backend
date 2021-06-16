package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTimeService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTimeDao;
import kodlamaio.hrms.entities.concretes.JobTime;

@Service
public class JobTimeManager implements JobTimeService{
	private JobTimeDao jobTimeDao;

	@Autowired
	public JobTimeManager(JobTimeDao jobTimeDao) {
		super();
		this.jobTimeDao = jobTimeDao;
	}

	@Override
	public DataResult<List<JobTime>> getAll() {
		return new SuccessDataResult<List<JobTime>>(this.jobTimeDao.findAll(), "İş Tipleri Listelendi...");
	}

	@Override
	public Result add(JobTime jobTime) {
		// TODO Auto-generated method stub
		this.jobTimeDao.save(jobTime);
		return new SuccessResult("İş Tipi Eklendi...");
	}

}

