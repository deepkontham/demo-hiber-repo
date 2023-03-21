package com.employee.dao;

public class Employee {
	private int Eid;
	private String fname;
	private String lname;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String fname, String lname, double salary) {
		super();
		Eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}
	
	 

}
