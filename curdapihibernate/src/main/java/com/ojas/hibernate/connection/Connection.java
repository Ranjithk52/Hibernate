package com.ojas.hibernate.connection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection {
	
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	
	

}
