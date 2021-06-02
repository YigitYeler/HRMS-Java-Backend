package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PortfolioService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PortfolioDao;
import kodlamaio.hrms.entities.concretes.Portfolio;

@Service
public class PortfolioManager implements PortfolioService{

	private PortfolioDao portfolioDao;
	
	@Autowired
	public PortfolioManager(PortfolioDao portfolioDao) {
		super();
		this.portfolioDao = portfolioDao;
	}

	@Override
	public Result add(Portfolio portfolio) {
		this.portfolioDao.save(portfolio);
		return new SuccessResult("Eklendi...");
	}

	@Override
	public DataResult<List<Portfolio>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Portfolio>>
		(this.portfolioDao.findAll(), "Data Listelendi...");
	}

}
