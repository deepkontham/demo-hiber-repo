package com.services;

import java.util.List;

import com.Dao.EngineerDaoimplt;
import com.model.Engineer;

public class ServicesImplt implements Engineerservice{

	EngineerDaoimplt dao=new EngineerDaoimplt();
	@Override
	public void insert(Engineer engineer) {
		dao.insert(engineer);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upadate(Engineer engineer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Engineer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
