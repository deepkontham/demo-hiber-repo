package com.ciq.bydirection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ciq.Butil.Bydirectionutil;

public class EngineerClient {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sis = new SimpleDateFormat("yyyy/mm/dd");
		Date dates = sis.parse("1995/03/17");
		Department d = new Department();
		Session session = Bydirectionutil.getSession();
		session.beginTransaction();

		Engineer en = new Engineer();
		d.setMine("mining");
		d.setRoll("manager");
		d.setEngineer(en);
		en.setName("chinna");
		en.setDob(dates);
		en.setDepartment(d);
		session.persist(en);
		session.persist(d);
		session.getTransaction().commit();
		session.close();

	}
}