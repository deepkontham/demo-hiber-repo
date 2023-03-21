package com.ciq.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int S_id;
	@Column
	private String name;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student"  )
	private List<Subject> subject;

	public Student() {

	}

	public Student(String name, List<Subject> subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", name=" + name + ", subject=" + subject + "]";
	}

}