package com.ciq.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;

import com.ciq.util.Componentutil;

public class StudentClient {
	public static void main(String[] args) throws ParseException {
		Address ad=new Address("ramagundam", "505208");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
		Date ds=sdf.parse("1995/03/17");
		Address ad1=new Address("ram", "505209");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/mm/dd");
		Date ds1=sdf.parse("1991/10/02");
//		LocalDate date=LocalDate.of(1995, 03,17);
//		ZoneId defaultZoneId = ZoneId.systemDefault();
// 		Date dob=Date.from(date.atStartOfDay(defaultZoneId).toInstant());
		Student s=new Student("pradeep", "kontham", ds, ad);
		Student s1=new Student("jithu", "pendli", ds1, ad1);

		Session session=Componentutil.getSession();
		session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.getTransaction().commit();
		Componentutil.Closeses(session);
		
				
	}

}
