package com.test;

import com.dao.Studentdoaimplt;
import com.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Studentdoaimplt dao=new Studentdoaimplt();
		Student s=new Student();
		System.out.println(dao.getall());
	}

}
