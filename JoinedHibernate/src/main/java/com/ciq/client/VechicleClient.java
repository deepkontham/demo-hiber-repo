package com.ciq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ciq.model.MahedhraCar;
import com.ciq.model.RenaltoCar;
import com.ciq.model.Vehicle;

public class VechicleClient {
	
	public static void main(String[] args) {
		Vehicle ve=new Vehicle("Car","4" );
		MahedhraCar m=new MahedhraCar("Mahendhra","4", "XUV",4);
		RenaltoCar c=new RenaltoCar("Renalto", "4", "Kwid", "RR");
		Configuration con =new Configuration().configure("joinedtable.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
	    Session session = sessionFactory.openSession();
		session.beginTransaction();
		//Retrive one class
//		Vehicle v=session.get(Vehicle.class,2);
//		System.out.println(v);
		
//		List<Vehicle> list = session.createQuery("from Vehicle").list();
//		for (Vehicle vehicle : list) {
//			System.out.println(vehicle);
//		}
		
		session.save(ve);
		session.save(m);
		session.save(c);
		session.getTransaction().commit();
		session.close();

	}
	

}
