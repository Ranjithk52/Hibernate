package com.ojas;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoOne {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Address address=new Address();
		address.setCity("Hyderabad");
		Address address2=new Address();
		address2.setCity("Banglore");
		
		
		Employee employee=new Employee();
		employee.setEmpname("Ranjith");
		employee.setAddress(address);
		employee.setEmail("ranjith@gmail.com");
		Employee employee1=new Employee();
		employee1.setEmpname("Siva");
		employee1.setAddress(address);
		employee1.setEmail("siva@gmail.com");
		Employee employee2=new Employee();
		employee2.setEmpname("Rakesh");
		employee2.setAddress(address2);
		employee2.setEmail("rakesh@gmail.com");
		Employee employee3=new Employee();
		employee3.setEmpname("Arjun");
		employee3.setAddress(address2);
		employee3.setEmail("arjun@gmail.com");
		s.save(employee);
		s.save(employee1);
		s.save(employee2);
		s.save(employee3);
		tx.commit();
		s.close();
		
		
		
		

	}

}
