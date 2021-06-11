package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.entities.concretes.Portfolio;

public interface PortfolioService {
	Result add(Portfolio portfolio);
	
	DataResult<List<Portfolio>> getAll();
	
	Result saveImg(MultipartFile myFile,int id);
}
