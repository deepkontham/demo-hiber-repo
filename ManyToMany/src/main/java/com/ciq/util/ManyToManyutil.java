package com.ciq.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyutil {
	static SessionFactory sf;
	static {
		Configuration con=new Configuration().configure("ManyToMany.xml");
		sf=con.buildSessionFactory();
		
	}
	public static Session getSession() {
		return sf.openSession();
		
	}
	public static void Closesess() {
		if(getSession()!=null) {
			getSession().close();
		}
	}
	public static void main(String[] args) {
		System.out.println(getSession());
	}

}
