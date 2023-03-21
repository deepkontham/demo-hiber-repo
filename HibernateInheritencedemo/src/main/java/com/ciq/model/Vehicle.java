package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value ="V_db")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String V_name;
	@Column
	private String V_type;
	
	public Vehicle() {
		
	}

	public Vehicle( String v_name, String v_type) {

		V_name = v_name;
		V_type = v_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getV_name() {
		return V_name;
	}

	public void setV_name(String v_name) {
		V_name = v_name;
	}

	public String getV_type() {
		return V_type;
	}

	public void setV_type(String v_type) {
		V_type = v_type;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", V_name=" + V_name + ", V_type=" + V_type + "]";
	}
	
	
	

	
}
