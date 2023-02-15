package com.ciq.m2m;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.unicone.Unidirectionutil;

public class DepartmentClient {
	public static void main(String[] args) throws ParseException {
		Department de = new Department("mining", "Manager");
		SimpleDateFormat se = new SimpleDateFormat("yyyy/mm/dd");
		Date date = se.parse("1995/03/17");
		Engineer en = new Engineer("deep", date, de);
		List<Engineer> en1 = new ArrayList<Engineer>();
		en1.add(new Engineer("ranjith", date, de));
		en1.add(new Engineer("vamshi", date, de));
		en1.add(new Engineer("laxman", date, de));
		en1.add(new Engineer("jithu", date, de));

		Session session = Unidirectionutil.getsSession();
		session.beginTransaction();
		for (Engineer engineer : en1) {
			session.save(engineer);
		}
		
		session.getTransaction().commit();
		Unidirectionutil.CloseSess();

	}
}
