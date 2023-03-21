package com.services;

import java.util.List;

import com.model.Engineer;

public interface Engineerservice {
	public void insert(Engineer engineer);
	public void delete(int id);
	public void upadate(Engineer engineer);
	List<Engineer> getAll();

}
