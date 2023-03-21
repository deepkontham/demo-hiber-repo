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
		Teacher t1=new Teacher("vamshi",32345.00, "vbhs");
		Teacher t2=new Teacher("jithendhar",34321.00, "vbhs");
		Teacher t3=new Teacher("laxmam",34569.00, "vbhs");
		Teacher t4=new Teacher("ranjith",765476.00, "vbhs");
	
		Teacher s []= {t1,t2,t3,t4};
		


 
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 SessionFactory sessionfactory=configuration.buildSessionFactory();
		 Session session=sessionfactory.openSession(); 
		 Transaction tx=session.beginTransaction();
		 for (Teacher teacher : s) {
			 session.save(teacher);
			}
			
		 
//		   Query create = session.createQuery("from Teacher");
//		   List<Teacher> teachers = create.list();
//		   for (Teacher teacher : teachers) {
//			   System.out.println(teacher);
//			
//		}
//		 
		 tx.commit();
		 session.close();
	}

}
