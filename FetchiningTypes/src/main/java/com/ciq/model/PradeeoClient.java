package com.ciq.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PradeeoClient {
	public static void main(String[] args) {

//		List<Laptop> lp = new ArrayList<Laptop>();
//		lp.add(new Laptop(22, "dell"));
//		lp.add(new Laptop(23, "dell"));

		//Pradeep p = new Pradeep(1l, "pradeep", lp);
		Configuration con = new Configuration().configure("Fetching.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Pradeep pradeep = session.get(Pradeep.class, 1l);
		System.out.println(pradeep);
         
		
		
		//session.save(p);
		transaction.commit();

	}

}
