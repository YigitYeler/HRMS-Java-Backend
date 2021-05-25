package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
public class Position {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;

	public Position() {
		
	}
	
	public Position(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
}
