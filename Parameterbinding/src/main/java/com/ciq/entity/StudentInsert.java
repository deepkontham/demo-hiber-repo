package com.ciq.entity;

import java.util.Iterator;

import org.hibernate.Session;

import com.ciq.util.Sessionutil;

public class StudentInsert {
	public static void main(String[] args) {
		Student s=new Student("pradeep", 2345.00, "vbhs");
		Student s1=new Student("vamshi", 2325.00, "vbhs");
		Student s2=new Student("laxman", 23456.00, "vbhs");
		
		Student[]r= {s,s1,s2};
		Session session=Sessionutil.buildsess();
		session.getTransaction().begin();
		for (Student student : r) {
			session.persist(student);
			
		}
		session.getTransaction().commit();
		session.close();

		
	}

}
