package com.ciq.m2m;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer D_id;
	private String mine;
	private String Roll;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Engineer> engineer;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String mine, String roll) {
		super();
		this.mine = mine;
		Roll = roll;
	}

	public Integer getD_id() {
		return D_id;
	}

	public void setD_id(Integer d_id) {
		D_id = d_id;
	}

	public String getMine() {
		return mine;
	}

	public void setMine(String mine) {
		this.mine = mine;
	}

	public String getRoll() {
		return Roll;
	}

	public void setRoll(String roll) {
		Roll = roll;
	}

	public List<Engineer> getEngineer() {
		return engineer;
	}

	public void setEngineer(List<Engineer> engineer) {
		this.engineer = engineer;
	}

	@Override
	public String toString() {
		return "Department [D_id=" + D_id + ", mine=" + mine + ", Roll=" + Roll + ", engineer=" + engineer + "]";
	}

}
