package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "portfolios")
public class Portfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Education> educations;
	
	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Experience> experiences;
	
	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Language> languages;
	
	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Skill> skills;
	
	@Column(name = "img_url")
	private String imgUrl;
	
	/*@Column(name = "skills")
	private Character[] skills;*/
	
	@Column(name = "intro")
	private String intro;
	
	@Column(name = "job_seeker_id")
	private int jobSeekerId;
	
	@ManyToOne
	@JoinColumn(name = "job_seeker_id",updatable = false,insertable = false)
	@JsonIgnore
	private JobSeeker jobSeeker;
	
	public Portfolio() {
		
	}

	public Portfolio(int id, List<Education> educations, List<Experience> experiences, List<Language> languages,
			String imgUrl, String intro,JobSeeker jobSeeker,List<Skill> skills,int jobSeekerId) {
		super();
		this.id = id;
		this.educations = educations;
		this.experiences = experiences;
		this.languages = languages;
		this.imgUrl = imgUrl;
		this.intro = intro;
		this.jobSeeker = jobSeeker;
		this.skills = skills;
		this.jobSeekerId = jobSeekerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/*public Character[] getSkills() {
		return skills;
	}

	public void setSkills(Character[] skills) {
		this.skills = skills;
	}*/

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
}
