package com.ciq.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Componentutil {
	public static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		Configuration con = new Configuration();
		con.configure("Component.cfg.xml");
		System.out.println("success");
		SessionFactory sessionFactory = con.buildSessionFactory();
		return sessionFactory;

	}
	public static Session getSession() {
		if(sessionFactory==null) {
			sessionFactory=buildSessionFactory();

		}
		return sessionFactory.openSession();

		
	}
	public static void Closeses(Session session) {
		if(session!=null) {
			session.close();
			
		}
	}
	public static void main(String[] args) {
		System.out.println(getSession());
	}
}
