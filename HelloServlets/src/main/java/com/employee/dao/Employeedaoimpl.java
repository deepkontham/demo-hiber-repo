package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employeequaries.Employeequaries;

import Connections.ConnectionUtil;

public class Employeedaoimpl {
	
	public List<Employee> getall(){
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Employee> employees = null;
		try {
			preparedStatement = connection.prepareStatement(Employeequaries.FIND_ALL_EMPLOYEE);
			resultSet =  preparedStatement.executeQuery();
			employees = new ArrayList<>();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setFname(resultSet.getString(2));
				employee.setLname(resultSet.getString(3));
				employee.setSalary(resultSet.getDouble(4));

				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(resultSet, preparedStatement, connection);
		}
		
		return null;
		

}
}