package com.model;

public class Engineer {
	private int id;
	private String ename;
	private double esalary;
	private String email;
	
	
	public Engineer() {
		
	}


	public Engineer(int id, String ename, double esalary, String email) {
		super();
		this.id = id;
		this.ename = ename;
		this.esalary = esalary;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Engineer [id=" + id + ", ename=" + ename + ", esalary=" + esalary + ", email=" + email + "]";
	}
	
	
	

}
