package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	void insert(Student student);
	void update(Student student);
	void delete(int eid);
	List<Student> getall();
	

}
