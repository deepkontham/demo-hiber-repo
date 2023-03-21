package com.ciq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table (name="students")
public class Student {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private double fee;
	@Column
	private String sclname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, double fee, String sclname) {
		super();
		this.name = name;
		this.fee = fee;
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getSclname() {
		return sclname;
	}
	public void setSclname(String sclname) {
		this.sclname = sclname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", sclname=" + sclname + "]";
	}
	

}
