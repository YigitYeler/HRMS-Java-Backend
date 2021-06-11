package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.PortfolioService;
import kodlamaio.hrms.core.abstracts.CloudinaryService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PortfolioDao;
import kodlamaio.hrms.entities.concretes.Portfolio;

@Service
public class PortfolioManager implements PortfolioService{

	private PortfolioDao portfolioDao;
	
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public PortfolioManager(PortfolioDao portfolioDao,CloudinaryService cloudinaryService) {
		super();
		this.portfolioDao = portfolioDao;
		this.cloudinaryService = cloudinaryService;
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

	@Override
	public Result saveImg(MultipartFile myFile, int id) {
		Map<?,?> res = this.cloudinaryService.imgSave(myFile);
		Portfolio portFolio = this.portfolioDao.getOne(id);
		String imgUrl = (String) res.get("url");
		
		portFolio.setImgUrl(imgUrl);
		this.portfolioDao.save(portFolio);
		
		return new SuccessResult("Cv güncellendi");
	}

}
