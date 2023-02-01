package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployees {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee em=s.get(Employee.class, new Integer(103));
		em.setName("Ramesh");
		s.update(em);
		tx.commit();
		s.close();
		sf.close();

	}

}
