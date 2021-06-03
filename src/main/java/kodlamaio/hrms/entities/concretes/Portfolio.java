package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

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
	
	@Column(name = "img_url")
	private String imgUrl;
	
	@Column(name = "skills")
	private Character[] skills;
	
	@Column(name = "intro")
	private String intro;
	
	public Portfolio() {
		
	}

	public Portfolio(int id, List<Education> educations, List<Experience> experiences, List<Language> languages,
			String imgUrl, Character[] skills, String intro) {
		super();
		this.id = id;
		this.educations = educations;
		this.experiences = experiences;
		this.languages = languages;
		this.imgUrl = imgUrl;
		this.skills = skills;
		this.intro = intro;
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

	public Character[] getSkills() {
		return skills;
	}

	public void setSkills(Character[] skills) {
		this.skills = skills;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
}
