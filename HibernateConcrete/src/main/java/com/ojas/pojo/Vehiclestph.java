package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Vehiclestph {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Vehicle veh=new Vehicle();
		veh.setId(1);
		veh.setName("truck");
		TwoWheeler veh2=new TwoWheeler();
		veh2.setId(2);
		veh2.setName("bike");
		veh2.setWheels2(2);
		ThreeWheeler veh3=new ThreeWheeler();
		veh3.setId(3);
		veh3.setName("Auto");
		veh3.setWheels3(3);
		FourWheeler veh4=new FourWheeler();
		veh4.setId(4);
		veh4.setName("car");
		veh4.setWheels4(4);
		s.save(veh);
		s.save(veh2);
		s.save(veh3);
		s.save(veh4);
		tx.commit();
		s.close();
		
		

	}

}
