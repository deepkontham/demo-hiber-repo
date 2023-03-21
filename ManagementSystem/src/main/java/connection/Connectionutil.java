package connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connectionutil {
	static Connection connection=null;
	static Properties properties=null;
	 static {
		
		 try {
			 properties=new Properties();	
			properties.load(Connectionutil.class.getClassLoader().getResourceAsStream("com/properties/db.properties"));
			Class.forName(properties.getProperty("Driver"));
		} catch (IOException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	 }
	 
	 public static Connection getConnection() {
		 try {
			connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("pwd"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		 
		 
	 }
	 
	 public static void closeConnection(Connection connection) {
		  if(connection!=null) {
			  try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	 }
	 public static void closeConnection(Statement statement) {
		 if(statement!=null) {
			 try {
				statement.close();
				closeConnection(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
	 }
	 public static void closeConnection(ResultSet rs,Statement statement) {
		 if(rs!=null) {
			 try {
				rs.close();
				 closeConnection(statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
	 }
public static void main(String[] args) {
	System.out.println(getConnection());
	
		//System.out.println("driver");

//	System.out.println(properties.getProperty("url"));
//	System.out.println(properties.getProperty("user"));
//	System.out.println(properties.getProperty("pwd"));

	
}
}
