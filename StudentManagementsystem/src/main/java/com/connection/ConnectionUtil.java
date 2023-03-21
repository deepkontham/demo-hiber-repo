package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {
	
	static Connection connection=null;
	static Properties properties=null;
	
	static {
		try {
			properties=new Properties();
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driver"));
			connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("pwd"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
		
	}
	public static void main(String[] args) {
		System.out.println(connection);
	}

}
