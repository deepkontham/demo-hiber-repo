package com.ciq.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingTest {
	public static void main(String[] args) {
//		List<Cachings> c=new ArrayList<Cachings>();
//		c.add(new Cachings(1, "pradeep", "Ramagundam"));
//		c.add(new Cachings(2, "deep", "Ramagundam"));
//		c.add(new Cachings(3, "laxman", "Ramagundam"));
//		c.add(new Cachings(4, "ranjith", "Ramagundam"));
		
		Cachings a=null;
		
		Configuration con = new Configuration().configure("Caching.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		for (Cachings cachings : c) {
//			session.save(cachings);
//			
//			
//		} 
		// First Level Caching
		a = session.get(Cachings.class, 1);
		System.out.println(a);
//		a= session.get(Cachings.class, 1);
//		System.out.println(a);
		transaction.commit();
		session.close();
		
		Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session.beginTransaction();
		a = session.get(Cachings.class, 1);
		System.out.println(a);
//		 System.out.println(a);
		transaction1.commit();
		session1.close();
		
		

	}

}
