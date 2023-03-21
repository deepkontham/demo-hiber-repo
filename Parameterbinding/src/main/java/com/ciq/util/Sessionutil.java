package com.ciq.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sessionutil {
	static SessionFactory sf;
	static {
		Configuration con=new Configuration();
		con.configure("com/resources/parameter.cfg.xml");
		sf=con.buildSessionFactory();
		
		
	}
	public static Session buildsess() {
		return sf.openSession();
		
	}
	public static void Sessionclose() {
		buildsess().close();
	}

	public static void main(String[] args) {
		System.out.println(buildsess());
	}
}
