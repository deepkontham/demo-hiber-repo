package com.ciq.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table

public class Laptop {
	@Id
	private Integer lid;
	private String lname;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Pradeep deep;

	public Laptop() {
	}

	

	public Laptop(Integer lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	


	public Laptop(Integer lid, String lname, Pradeep deep) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.deep = deep;
	}



	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Pradeep getDeep() {
		return deep;
	}

	public void setDeep(Pradeep deep) {
		this.deep = deep;
	}



	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

	
}
