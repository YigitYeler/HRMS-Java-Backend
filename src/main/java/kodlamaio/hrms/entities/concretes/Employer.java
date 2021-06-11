package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employers")
public class Employer {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site_url")
	private String webSiteUrl;
	
	@Column(name="emailVerify")
	private boolean emailVerify = false;
	
	@Column(name="phone_number")
	private String phoneNumber;

	public Employer() {
		
	}
	
	public Employer(int id, String companyName, String webSiteUrl, String phoneNumber,boolean emailVerify) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSiteUrl = webSiteUrl;
		this.phoneNumber = phoneNumber;
		this.emailVerify = emailVerify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isEmailVerify() {
		return emailVerify;
	}

	public void setEmailVerify(boolean emailVerify) {
		this.emailVerify = emailVerify;
	}
	
}
