package com.ojas.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Main {

	public static void main(String[] args) {
		Session s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		
		Query query=s.createQuery("from Employee");
		List<Employee> employe=query.getResultList();
		for(Employee emp:employe){
			System.out.println(emp);
		}
		tx.commit();
		s.close();
		
		
	}

}
