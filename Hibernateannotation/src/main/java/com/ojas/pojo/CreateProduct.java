package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateProduct {

	public static void main(String[] args) {
//		Configuration cfg=new Configuration();
//		cfg.configure();
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session s=sf.openSession();
//		Transaction tx=s.beginTransaction();
//		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tx=s.beginTransaction();
		
		Product prd=new Product();
		
		prd.setPid(4);
		prd.setPname("Desktops");
		prd.setQty(5);
		if(s.contains(prd)){
			System.out.println("transient");
		}else{
			System.out.println("not transient");
		}
		
		s.save(prd);
		if(s.contains(prd)){
			System.out.println("persistent");
		}else{
			System.out.println("not persistent");
		}
		
		tx.commit();
		s.close();
		//sf.close();
		
	}

}
