package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTPCS {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("siva");
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("ranjith");
		
		RegularEmply remp=new RegularEmply();
		
		remp.setId(3);
		remp.setName("mahesh");
		remp.setSalary(5000);
		remp.setBonus(5);
		
		ContractEmply cemp=new ContractEmply();
		cemp.setId(4);
		cemp.setName("mallesh");
		cemp.setPer_per_hour(6000);
		cemp.setDuration("45days");
		
		s.save(emp);
		s.save(emp2);
		s.save(remp);
		s.save(cemp);
		tx.commit();
		s.close();
		
		

	}

}
