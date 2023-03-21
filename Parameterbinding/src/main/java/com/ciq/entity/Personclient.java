package com.ciq.entity;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Personclient {
	public static void main(String[] args) {
		String mydob="17/03/1995";
		LocalDate date=LocalDate.of(1995, 03, 17);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date dob=Date.from(date.atStartOfDay(defaultZoneId).toInstant());
		Perrson pr=new Perrson("pradeep", dob, 23456.00);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.ciq.entity");
		EntityManager entityManager=entityManagerFactory.createEntityManager();  
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(pr);
		tx.commit();
		Query query=entityManager.createQuery("from Perrson");
		List resultlist=query.getResultList();
		System.out.println(resultlist);
		entityManager.close();
	}

}
