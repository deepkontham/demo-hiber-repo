 package com.ciq.ems.entity;

public class Teacher {
	
	private int id;
	private String name;
	private double salary;
	private String sclname;
	
	public Teacher() {
	
	}

	public Teacher(int id, String name, double salary, String sclname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sclname = sclname;
	}

	public Teacher(String name, double salary, String sclname) {
		super();
		this.name = name;
		this.salary = salary;
		this.sclname = sclname;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSclname() {
		return sclname;
	}

	public void setSclname(String sclname) {
		this.sclname = sclname;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", sclname=" + sclname + "]";
	}
	

	
}
