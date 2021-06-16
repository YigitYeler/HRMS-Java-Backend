package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "job_positions")
public class Position {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;
	
	@OneToMany(mappedBy = "position")
	@JsonIgnore
	private List<JobAd> jobAds;
	
	@OneToMany(mappedBy = "position")
	@JsonIgnore
	private List<Experience> experiences;

	public Position() {
		
	}
	
	public Position(int id, String positionName,List<JobAd> jobAds) {
		super();
		this.id = id;
		this.positionName = positionName;
		this.jobAds = jobAds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public List<JobAd> getJobAds() {
		return jobAds;
	}

	public void setJobAds(List<JobAd> jobAds) {
		this.jobAds = jobAds;
	}
}
