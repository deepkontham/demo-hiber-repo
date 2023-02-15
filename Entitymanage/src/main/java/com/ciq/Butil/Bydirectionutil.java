package com.ciq.Butil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bydirectionutil {
	static SessionFactory se;
	static {
		Configuration con=new Configuration().configure("bydirection.xml");
        se=con.buildSessionFactory();
        
	}
	public  static Session getSession() {
	
		return se.openSession();
		
	}
	public static void Closesess() {
		if(getSession()!=null) {
			getSession().close();
		}
	}
	public static void main(String[] args) {
		System.out.println(getSession().isConnected());
	}

}
