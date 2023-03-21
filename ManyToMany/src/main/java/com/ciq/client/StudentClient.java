package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ciq.entity.Student;
import com.ciq.entity.Subject;
import com.ciq.util.ManyToManyutil;

public class StudentClient {
	public static void main(String[] args) {
		List<Subject> subjects=new ArrayList<Subject>();
		Subject sub=new Subject("java");
		subjects.add(sub);
	
	Student s=new Student("pradeep", subjects);
	Session session=ManyToManyutil.getSession();
	session.beginTransaction();
	session.save(s);
	session.getTransaction().commit();
	ManyToManyutil.Closesess();
		
	}
}
