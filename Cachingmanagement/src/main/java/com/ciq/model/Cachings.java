package com.ciq.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Caching_table")
public class Cachings {
	@Id
	private Integer id;
	private String name;
	private String Address;
	
	public Cachings(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		Address = address;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Cachings() {
	
	}
	@Override
	public String toString() {
		return "Cachings [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	
	

}
