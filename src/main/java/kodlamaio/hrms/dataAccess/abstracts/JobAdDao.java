package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import kodlamaio.hrms.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd, Integer>{
	List<JobAd> getByIsActive(boolean isActive);
	List<JobAd> getByCompanyNameContainsAndIsActive(String companyName,boolean isActive);
	@Modifying
	@Transactional
    @Query("UPDATE JobAd j SET j.isActive = :isActive WHERE j.id = :id")
    int updateIsActive(@Param("id") int id, @Param("isActive") boolean isActive);
}
