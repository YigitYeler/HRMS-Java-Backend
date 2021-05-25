package kodlamaio.hrms.entities.concretes;

import java.util.Date;

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
	private boolean verifyEmail;

	public JobSeeker() {
		
	}

	public JobSeeker(int id, String nationalityIdentity, String name, String surName, Date birthDate,
			boolean verifyEmail) {
		super();
		this.id = id;
		this.nationalityIdentity = nationalityIdentity;
		this.name = name;
		this.surName = surName;
		this.birthDate = birthDate;
		this.verifyEmail = verifyEmail;
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

	
	
	
}
