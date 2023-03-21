package com.model;

public class Student {
	private int eid;
	private String ename;
	private double salary;
	private String clgname;
	public Student() {
		
	}
	public Student(int eid, String ename, double salary, String clgname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.clgname = clgname;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", clgname=" + clgname + "]";
	}
	
	
}
