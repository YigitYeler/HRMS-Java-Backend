package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "job_seekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="national_identity")
	private String nationalityIdentity;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surName;
	
	@Column(name="birth_date")
	private Date birthDate; 
	
	@Column(name="verify_email")
	private boolean verifyEmail = false;
	
	@OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Portfolio> portfolios;

	public JobSeeker() {
		
	}

	public JobSeeker(int id, String nationalityIdentity, String name, String surName, Date birthDate,
			boolean verifyEmail,List<Portfolio> portfolios) {
		super();
		this.id = id;
		this.nationalityIdentity = nationalityIdentity;
		this.name = name;
		this.surName = surName;
		this.birthDate = birthDate;
		this.verifyEmail = verifyEmail;
		this.portfolios = portfolios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(boolean verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	
	
	
}
