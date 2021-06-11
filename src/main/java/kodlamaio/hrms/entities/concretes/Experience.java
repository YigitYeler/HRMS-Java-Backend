package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "experiences")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "experience_id")
	private int id;
	
	@Column(name = "work_place_name")
	private String workPlaceName;
	
	@JoinColumn(name = "position_id")
	@ManyToOne
	private Position position;
	
	@Column(name = "entry_date")
	private Date entryDate;
	
	@Column(name = "quit_date")
	private Date quitDate;
	
	@Column(name = "portfolio_id")
	private int portfolioId;
	
	@ManyToOne()
	@JoinColumn(name = "portfolio_id",insertable = false,updatable = false)
	@JsonIgnore
	private Portfolio portfolio;
	
	public Experience() {
		
	}

	public Experience(int id, String workPlaceName, Position position, Date entryDate, Date quitDate,
			Portfolio portfolio,int portfolioId) {
		super();
		this.id = id;
		this.workPlaceName = workPlaceName;
		this.position = position;
		this.entryDate = entryDate;
		this.quitDate = quitDate;
		this.portfolio = portfolio;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkPlaceName() {
		return workPlaceName;
	}

	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getQuitDate() {
		return quitDate;
	}

	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
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
