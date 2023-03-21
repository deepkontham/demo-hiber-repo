package sessionutil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Software")
public class Software {
	@Column (name="S_id",length = 20,unique = true)
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Column (name="S_name",length = 30,nullable =true)
	private String name;
	@Column(name="S_company",length = 50,nullable = true)
	private String company;
	 
	
	public Software() {
	}


	public Software(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
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


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Software [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
	
	 
	
	

}
