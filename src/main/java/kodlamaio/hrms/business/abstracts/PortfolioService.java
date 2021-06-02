package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.Portfolio;

public interface PortfolioService {
	Result add(Portfolio portfolio);
	
	DataResult<List<Portfolio>> getAll();
}
