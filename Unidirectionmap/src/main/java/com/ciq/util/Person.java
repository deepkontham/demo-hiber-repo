package com.ciq.util;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="Persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "P_name",nullable = false)
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinTable(name = "Peson_Adhar",
	joinColumns =@JoinColumn(name="Person_id"),
	inverseJoinColumns = @JoinColumn(name="Adhar_id"))
	private Adharcard adharcard;
	
	public Person() {
	
	}
	public Person( String name, Date dob, Adharcard adharcard) {

		this.name = name;
		this.dob = dob;
		this.adharcard = adharcard;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Adharcard getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(Adharcard adharcard) {
		this.adharcard = adharcard;
	}
	
	

	

}
