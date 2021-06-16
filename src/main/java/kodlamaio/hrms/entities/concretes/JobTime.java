package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_times")
public class JobTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;

	public JobTime(){
		
	}
	
	public JobTime(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
