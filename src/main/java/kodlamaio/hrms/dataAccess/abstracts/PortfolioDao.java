package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Portfolio;

public interface PortfolioDao extends JpaRepository<Portfolio, Integer>{

}
