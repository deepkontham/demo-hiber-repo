package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Query.Queries;
import com.connection.ConnectionUtil;
import com.model.Student;



public class Studentdoaimplt implements StudentDao{

	@Override
	public void insert(Student student) {
		
	}

	@Override
	public void update(Student student) {
		
	}

	@Override
	public void delete(int eid) {
      		
	}

	@Override
	public List<Student> getall() {
		List<Student> students=new ArrayList<>();
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			connection=ConnectionUtil.getConnection();

			ps=connection.prepareStatement(Queries.GetAll_QUERY);
			rs=ps.executeQuery();
        while(rs.next()) {
        	Student e=new Student();
        	e.setEid(rs.getInt(1));
        	e.setEname(rs.getString(2));
        	e.setSalary(rs.getDouble(3));
        	e.setClgname(rs.getString(4));
        	students.add(e);

        }
        return students;
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
