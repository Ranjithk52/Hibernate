package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserEmployees {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=new Employee();
		emp.setEid(103);
		emp.setName("Rajesh");
		emp.setSalary(70000);
		Employee emp1=new Employee();
		emp1.setEid(104);
		emp1.setName("Radhesh");
		emp1.setSalary(80000);
		s.save(emp);
		s.save(emp1);
		
		tx.commit();
		
		s.close();
		sf.close();
		
		
	}

}
