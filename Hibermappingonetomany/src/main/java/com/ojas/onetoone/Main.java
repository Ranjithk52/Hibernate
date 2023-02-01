package com.ojas.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session s=new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Address address=new Address();
		address.setCity("Hyderabad");
		Address address2=new Address();
		address2.setCity("Banglore");
		Employee employee=new Employee();
		employee.setEname("Ranjith");
		employee.setEmail("ranjith@gmail.com");
		Employee employee2=new Employee();
		employee2.setEname("Siva");
		employee2.setEmail("siva@gmail.com");
		employee.setAddress(address);
		employee2.setAddress(address2);
		address.setEmployee(employee);
		address2.setEmployee(employee2);
		s.save(employee);
		s.save(employee2);
		tx.commit();
		s.clear();
		
		
		
		
	}

}
