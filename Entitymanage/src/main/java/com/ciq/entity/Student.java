package com.ciq.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table
public class Student {
	@Column (name="S_id",length = 20,unique = true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String f_name;
	@Column
	private String l_name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="street",column = @Column(name="street"))
//		@AttributeOverride(name="pincode",column = @Column(name="pincode"))
//
//	})
	
	private Address address;
	
	public Student() {
	}
	public Student(String f_name, String l_name, Date dob, Address address) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.dob = dob;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", dob=" + dob + ", address="
				+ address + "]";
	}
	
	

}
