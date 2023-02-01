package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Tpcc {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=new Employee();
	emp.setName("siva");
	Regular remp=new Regular();
	remp.setName("Ravi");
	remp.setSalary(5000);
	remp.setBonus(5);
	Contract cemp=new Contract();
	cemp.setName("rakesh");
	cemp.setPay_per_hour(4000);
	cemp.setDuration("40days");
	s.save(emp);
	s.save(remp);
	s.save(cemp);
	tx.commit();
	s.close();

	}

}
