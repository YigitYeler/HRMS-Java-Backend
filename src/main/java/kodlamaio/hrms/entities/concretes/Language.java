package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "language_table")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@Column(name = "language_level")
	private int languageLevel;
	
	@Column(name = "portfolio_id")
	private int portfolioId;
	
	@ManyToOne()
	@JoinColumn(name = "portfolio_id",insertable = false,updatable = false)
	@JsonIgnore
	private Portfolio portfolio;
	
	public Language(){
		
	}

	public Language(int id, String languageName, int languageLevel, int portfolioId, Portfolio portfolio) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.portfolio = portfolio;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
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

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}
	
}
