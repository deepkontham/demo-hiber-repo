package com.ciq.util;

import java.text.ParseException;

import java.text.SimpleDateFormat;
//import java.time.LocalDate;

//import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.unicone.Unidirectionutil2;

public class PersonClient {
	public static void main(String[] args) throws ParseException {

		//Adharcard adr = new Adharcard(560611306006l, "Ramagundam"); 
////	LocalDate date=LocalDate.of(1995, 03, 17);
////	ZoneId s=ZoneId.systemDefault();
////	Date dd=s.from(date.atStartOfDay(s
//		SimpleDateFormat s = new SimpleDateFormat("yyyy/mm/dd");
//		Date date = s.parse("1995/03/17");
//
		// Person pr = new Person("pradeep", date, adr);
		Session session=Unidirectionutil2.geteSession();
		session.beginTransaction();
		//session.save(pr);
		//getSessionbyid(session);
	//	getAll(session);
		getNativeSqlData(session);
//		getAllNamedQuery(session);
		session.getTransaction().commit();
		Unidirectionutil2.CloseSess();

	}
//	public static void getSessionbyid(Session session) {
//		Person pe=session.get(Person.class, 1);
//		System.out.println(pe);
//	}
	
//	public static void getAll(Session session) {
//		List<Object> alldata=session.createNativeQuery("select * from persons_td").list();
//         System.out.println(alldata);
//		
//	}
	public static void getNativeSqlData(Session session) {
		List<Object[]> allData = session.createNativeQuery("select * from persons_td ").list();


		for (Object[] objects : allData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
	}
//		public static void getAllNamed Query(Session session) {
//			List<Person> list = session.createNamedQuery("get.Persons").list();
//            for (Person person : list) {
//            	System.out.println(person.getId());
//            	System.out.println(person.getName());
//            	System.out.println(person.getAdharcard());
//
//				
//			}			
		

	}
	


