package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int id;
	
	@Column(name = "language_name")
	private int languageName;
	
	@Column(name = "language_level")
	private int languageLevel;
	
	@JoinColumn(name = "language_id", insertable = false, updatable = false)
    @ManyToOne
    private Portfolio portfolio;
	
	public Language(){
		
	}

	public Language(int id, int languageName, int languageLevel, Portfolio portfolio) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.portfolio = portfolio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLanguageName() {
		return languageName;
	}

	public void setLanguageName(int languageName) {
		this.languageName = languageName;
	}

	public int getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(int languageLevel) {
		this.languageLevel = languageLevel;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
}
