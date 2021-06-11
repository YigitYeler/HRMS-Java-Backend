package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAds"})
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "city_name")
	private String cityName;
	
	@Column(name = "plate_number")
	private String plateNumber;
	
	@OneToMany(mappedBy = "city")
	private List<JobAd> jobAds;

	public City() {
		
	}
	
	public City(int id, String cityName, String plateNumber, List<JobAd> jobAds) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.plateNumber = plateNumber;
		this.jobAds = jobAds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public List<JobAd> getJobAds() {
		return jobAds;
	}

	public void setJobAds(List<JobAd> jobAds) {
		this.jobAds = jobAds;
	}
}
