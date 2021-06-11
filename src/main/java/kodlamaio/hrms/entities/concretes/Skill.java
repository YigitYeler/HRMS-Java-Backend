package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "skills")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "portfolio_id")
	private int portfolioId;
	
	@ManyToOne()
	@JoinColumn(name = "portfolio_id",updatable = false,insertable = false)
	@JsonIgnore
	private Portfolio portfolio;

	public Skill() {
		
	}
			
	public Skill(int id, String skillName, Portfolio portfolio,int portfolioId) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.portfolio = portfolio;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
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
