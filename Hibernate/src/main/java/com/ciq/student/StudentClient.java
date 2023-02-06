package com.ciq.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {
	public static void main(String[] args) {
		
		Student s=new Student(1, "pradeep", 2344.00);
		Student e = new Student(3,"deep", 26780.99);
		Student s1 = new Student(2,"pradeep", 26780.99);
		Student s2 = new Student(5,"ranjith", 65432.99);
		Student s3 = new Student(6,"vamshi", 34567.99);
		Student t[]= {e,s1,s2,s3};
		Configuration con=new Configuration();
		con.configure("hibernatecon.cfg.xml");
		SessionFactory se=con.buildSessionFactory();
		Session sef=se.openSession();
		Transaction tx=sef.beginTransaction();
		for (Student student : t) {
			sef.save(student);
		}
		
		tx.commit();
		sef.close();
		
		
	}
 

}
