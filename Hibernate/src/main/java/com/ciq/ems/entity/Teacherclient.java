package com.ciq.ems.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Teacherclient {

	public static void main(String[] args) {
		Teacher t=new Teacher("pradeep",22339.00, "vishwabharathi");
		Teacher t1=new Teacher("kumar",34569.00, "vbhs");

 
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 SessionFactory sessionfactory=configuration.buildSessionFactory();
		 Session session=sessionfactory.openSession(); 
		 Transaction tx=session.beginTransaction();
		 session.save(t1);
		   org.hibernate.query.Query create = session.createQuery("from Teacher");
		   List<Teacher> teachers = create.list();
		   for (Teacher teacher : teachers) {
			   System.out.println(teacher);
			
		}
		 
		 tx.commit();
		 session.close();
	}

}
