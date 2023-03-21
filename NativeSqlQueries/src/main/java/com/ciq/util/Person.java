package com.ciq.util;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Persons_td")
@NamedQueries(value = { @NamedQuery(name = "get.Persons", query = "from  ")

		, @NamedQuery(name = "get.ByName", query = "from Person p where p.name='pradeep'")
, @NamedQuery(name = "get.ByName1", query = "from Person as per INNER JOIN per.adharcard as dep")

})
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "P_name", nullable = false)
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Adharcard adharcard;
 
	public Person() {

	}

	public Person(String name, Date dob, Adharcard adharcard) {

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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + ", adharcard=" + adharcard + "]";
	}

}
