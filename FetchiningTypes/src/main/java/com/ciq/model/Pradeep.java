package com.ciq.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Pradeep {
	@Id
	private Long pid;

	private String name;
	@OneToMany(mappedBy = "deep",cascade = CascadeType.ALL)
	private List<Laptop> laps;

	public Pradeep() {

	}


	public Pradeep(Long pid, String name, List<Laptop> laps) {
		super();
		this.pid = pid;
		this.name = name;
		this.laps = laps;
	}


	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLops() {
		return laps;
	}

	public void setLops(List<Laptop> laps) {
		this.laps = laps;
	}

	@Override
	public String toString() {
		return "Pradeep [pid=" + pid + ", name=" + name + ", lops=" + laps + "]";
	}

	

}
