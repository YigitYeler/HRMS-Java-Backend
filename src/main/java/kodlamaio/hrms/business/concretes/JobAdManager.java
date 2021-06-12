package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdDao;
import kodlamaio.hrms.entities.concretes.JobAd;

@Service
public class JobAdManager implements JobAdService{

	private JobAdDao jobAdDao;
	
	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}

	@Override
	public Result add(JobAd jobAd) {
		this.jobAdDao.save(jobAd);
		return new SuccessResult("Pozisyon Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<JobAd>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll(),"Data Listelendi");
	}

	@Override
	public DataResult<List<JobAd>> getByIsActive(boolean isActive) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getByIsActive(isActive),"Aktif olanlar listelendi");
	}

	@Override
	public DataResult<List<JobAd>> getAllSortedByDate() {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.DESC,"lastDate");
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll(sort),"Tarihe göre listelendi");
	}

	@Override
	public DataResult<List<JobAd>> getByCompanyContainsNameAndIsActive(String companyName, boolean isActive) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getByCompanyNameContainsAndIsActive(companyName, isActive), "İstenilen şirket'in aktif ilanları listelendi");
	}

	@Override
	public DataResult<Integer> updateIsActive(int id, boolean isActive) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Integer>(this.jobAdDao.updateIsActive(id, isActive),"Başarılı");
	}

	@Override
	public DataResult<JobAd> getById(int id) {
		return new SuccessDataResult<JobAd>(this.jobAdDao.getById(id), "İş İlanı Getirildi");
	}

}
