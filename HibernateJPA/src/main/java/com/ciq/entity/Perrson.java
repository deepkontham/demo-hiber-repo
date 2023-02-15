package com.ciq.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class Perrson {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int P_id;
	@Column
	private String P_name;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column
	private double income;
	public Perrson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Perrson(String p_name, Date dob, double income) {
		super();
		P_name = p_name;
		this.dob = dob;
		this.income = income;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Perrson [P_id=" + P_id + ", P_name=" + P_name + ", dob=" + dob + ", income=" + income + "]";
	}
	
	

}
