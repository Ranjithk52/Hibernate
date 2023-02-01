package com.ojas.model2;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class Main {

	public static void main(String[] args) {
		//Session s=new Configuration().configure("usertables.cfg.xml").buildSessionFactory().openSession();
		Configuration cfg=new Configuration();
		cfg.configure("usertables.cfg.xml");
		org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		
		Transaction tx=s.beginTransaction();
		//usertable table=s.get(usertable.class, 2);
		Query query=s.createQuery("from usertable");
		List<usertable> li1=query.getResultList();
		for(usertable ut:li1){
			System.out.println(ut);
		}
				
//				System.out.println(table);
//				
//				
//				usertable table1=s.get(usertable.class, 2);
//				 System.out.println(s.contains(table1));
//				System.out.println(table1);
	
	///System.out.println(s.contains(li1));
		Query query1=s.createQuery("from usertable");
		List<usertable> li2=query1.getResultList();
		for(usertable ut:li2){
			System.out.println(ut);
		}
		
	

	}

}
