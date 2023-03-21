package Queries;

public interface Query {
	String INSERT_QUERY="insert into engineers values(?,?,?,?)";
	String GetAll_QUERY="select * from engineers ";
	String Upadte_QUERY="Upadate engineers set ,ename=?,esalary=?,email=? where id=?";
	String Delete_QUERY="delete from engineers where id=?";




}
