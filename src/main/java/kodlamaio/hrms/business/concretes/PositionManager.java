package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.core.utilites.results.DataResult;
import kodlamaio.hrms.core.utilites.results.ErrorResult;
import kodlamaio.hrms.core.utilites.results.Result;
import kodlamaio.hrms.core.utilites.results.SuccessDataResult;
import kodlamaio.hrms.core.utilites.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Position>>
		(this.positionDao.findAll());
	}

	@Override
	public Result add(Position position) {
		// TODO Auto-generated method stub
		if(!this.positionDao.existsPositionByPositionName(position.getPositionName())) {
			this.positionDao.save(position);
			return new SuccessResult("Position Eklendi");
		}
			return new ErrorResult("Bu pozisyon zaten var");
	}

}
