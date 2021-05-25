package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.ErrorResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"Başarılı");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		if(!this.jobSeekerDao.existsJobSeekerByName(jobSeeker.getName())) {
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("JobSeeker Eklendi");
		}
			return new ErrorResult("Bu email kullanılıyor");
	}
}
