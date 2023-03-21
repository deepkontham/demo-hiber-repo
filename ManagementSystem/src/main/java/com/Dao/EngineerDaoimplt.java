package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Engineer;

import Queries.Query;
import connection.Connectionutil;

public class EngineerDaoimplt implements DaoEngineer {

	@Override
	public void insert(Engineer engineer) {
     Connection connection=null;
     PreparedStatement ps=null;
     try {
         connection=Connectionutil.getConnection();
		ps=connection.prepareStatement(Query.INSERT_QUERY);
		ps.setInt(1, engineer.getId());
		ps.setString(1, engineer.getEname());
		ps.setDouble(3, engineer.getEsalary());
		ps.setString(4, engineer.getEmail());
		ps.executeUpdate();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//     Connectionutil.closeConnection(ps);
     
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public void upadate(Engineer engineer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Engineer> getAll() {
		List<Engineer> engineers=new ArrayList<Engineer>();
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		connection=Connectionutil.getConnection();
		try {
			connection=Connectionutil.getConnection();

			ps=connection.prepareStatement(Query.GetAll_QUERY);
			rs=ps.executeQuery();
        while(rs.next()) {
        	Engineer e=new Engineer();
        	e.setId(rs.getInt(1));
        	e.setEname(rs.getString(2));
        	e.setEsalary(rs.getDouble(3));
        	e.setEmail(rs.getString(4));
        	engineers.add(e);

        }
        return engineers;
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
