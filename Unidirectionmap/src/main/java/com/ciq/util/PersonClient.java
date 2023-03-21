package com.ciq.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;

import com.unicone.Unidirectionutil;
import com.unicone.Unidirectionutil2;

public class PersonClient {
	public static void main(String[] args) throws ParseException {

		Adharcard adr = new Adharcard(560611306006l, "Ramagundam"); 
//	LocalDate date=LocalDate.of(1995, 03, 17);
//	ZoneId s=ZoneId.systemDefault();
//	Date dd=s.from(date.atStartOfDay(s
		SimpleDateFormat s = new SimpleDateFormat("yyyy/mm/dd");
		Date date = s.parse("1995/03/17");

		Person pr = new Person("pradeep", date, adr);
		Session session=Unidirectionutil2.getsSession();
		session.beginTransaction();
		session.save(pr);
		session.getTransaction().commit();
		Unidirectionutil.CloseSess();

	}
}
