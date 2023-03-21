package com.Query;

public interface Queries {
	String INSERT_QUERY="insert into professor values(?,?,?,?)";
	String GetAll_QUERY="select * from professor ";
	String Upadte_QUERY="Upadate professor set ,ename=?,salary=?,clgname=? where eid=?";
	String Delete_QUERY="delete from professor where eid=?";

}
