package com.ciq.util;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.jboss.jandex.Main;

import com.unicone.Unidirectionutil2;

public class personNamedTest {
	public static void main(String[] args) {
		Session session = Unidirectionutil2.geteSession();
		getAllNamedQueryByName(session);

//		Query query = session.getNamedQuery("get.Persons");
//		List<Person> list = query.list();
//		for (Person per : list) {
//			System.out.println(per.getId());
//			System.out.println(per.getName());
////			System.out.println(per.getAdharcard());

//		}
	}

	public static void getAllNamedQueryByName(Session session) {
//			List<Person> list = session.getNamedQuery("get.ByName").getResultList();
//		
//			for (Person per : list) {
//				System.out.println(per.getId());
//				System.out.println(per.getName());
//				Adharcard adr=	per.getAdharcard();
//				System.out.println(adr.getAd_id());
//				System.out.println(adr.getAddress());
//				System.out.println(adr.getAdharnumber());
//				
//			}

		Query query = session.getNamedQuery("get.ByName1");
		List<?> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Object[] row = (Object[]) list.get(i);
			Person per = (Person) row[0];
			Adharcard adr = (Adharcard) row[1];
			System.out.println(per.getId() + " " + per.getName() + " " + adr.getAd_id() + " " + adr.getAdharnumber()
					+ " " + adr.getAddress());
		}

	}
}
