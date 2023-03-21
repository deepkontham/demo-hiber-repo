package com.ciq.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sub_id;
	@Column
	private String sub_names;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinTable(name = "student_sub", joinColumns = @JoinColumn(name ="subs_id" ), inverseJoinColumns = @JoinColumn(name ="stu_id" ))

	private Student student; 

	public Subject() {

	}

	public Subject(String sub_names) {
		super();
		this.sub_names = sub_names;
	}

	public int getSub_id() {
		return Sub_id;
	}

	public void setSub_id(int sub_id) {
		Sub_id = sub_id;
	}

	public String getSub_names() {
		return sub_names;
	}

	public void setSub_names(String sub_names) {
		this.sub_names = sub_names;
	}

	@Override
	public String toString() {
		return "Subject [Sub_id=" + Sub_id + ", sub_names=" + sub_names + "]";
	}

}
