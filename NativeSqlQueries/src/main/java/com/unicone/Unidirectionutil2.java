package com.unicone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Unidirectionutil2 {
	static SessionFactory sf;
	
	static {
		Configuration con=new Configuration().configure("unidirectional.xml");
		 sf = con.buildSessionFactory();
		 
	}
	public static Session geteSession() {
		return sf.openSession();
		
	}
	public static void CloseSess() {
		if(geteSession()!=null) {
			geteSession().close();
		}
	}
	public static void main(String[] args) {
		System.out.println(geteSession());
	}

}
