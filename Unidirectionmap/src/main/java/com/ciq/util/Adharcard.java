package com.ciq.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Adharcard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ad_id;
    @Column(name = "Adher_no",nullable =false,unique = true)
	private long Adharnumber;
    @Column
	private String Address;
    @OneToOne(mappedBy ="adharcard")
	private Person person;
     
	public Adharcard() {
		
	}
	public Adharcard(long adharnumber, String address) {
 		Adharnumber = adharnumber;
		Address = address;
	}
	public Integer getAd_id() {
		return ad_id;
	}
	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}
	public long getAdharnumber() {
		return Adharnumber;
	}
	public void setAdharnumber(long adharnumber) {
		Adharnumber = adharnumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Adharcard [ad_id=" + ad_id + ", Adharnumber=" + Adharnumber + ", Address=" + Address + ", person="
				+ person + "]";
	}
    
    

}
