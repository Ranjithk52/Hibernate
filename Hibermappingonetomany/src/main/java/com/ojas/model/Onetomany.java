package com.ojas.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Onetomany {

	public static void main(String[] args) {

		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
			Answers answer=new Answers();
			answer.setAnswername("Java is Programming language");
			answer.setPostedby("Ranjith");
			Answers answer1=new Answers();
			answer1.setAnswername("Java is platform independent");
			answer1.setPostedby("Siva");
			
			List<Answers> li1=new ArrayList<Answers>();
			li1.add(answer);
			li1.add(answer1);
			Answers answer2=new Answers();
			answer2.setAnswername("Servlet is an Interface");
			answer2.setPostedby("Ranjith");
			Answers answer3=new Answers();
			answer3.setAnswername("Servlet is an API");
			answer3.setPostedby("Siva");
			List<Answers> li2=new ArrayList<Answers>();
			li2.add(answer2);
			li2.add(answer3);
			
			
			Question question=new Question();
			question.setQname("What is java");
			question.setAnswers(li1);
			
			Question question2=new Question();
			question2.setQname("What is Servlet");
			question2.setAnswers(li2);
			
			s.save(question);
			s.save(question2);
			tx.commit();
			s.close();
		
			
			

	}

}
