package com.Dao;

import java.util.List;

import com.model.Engineer;

public interface DaoEngineer {
	public void insert(Engineer engineer);
	public void delete(int id);
	public void upadate(Engineer engineer);
	List<Engineer> getAll();
	
	


}
