package com.ojas.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction  tx=s.beginTransaction();
		Answers answers=new Answers();
		answers.setAnsname("Java is a programming Language");
		answers.setPostedby("Ranjith");
		Answers answers2=new Answers();
		answers2.setAnsname("Java is a platform ");
		answers2.setPostedby("Siva");
		Answers answers3=new Answers();
		answers3.setAnsname("Servlet is an interface");
		answers3.setPostedby("Rakesh");
		Answers answers4=new Answers();
		answers4.setAnsname("Servlet is an API");
		answers4.setPostedby("Arjun");
		
		List <Answers> li1=new ArrayList<Answers>();
		li1.add(answers);
		li1.add(answers2);
		List <Answers> li2=new ArrayList<Answers>();
		li2.add(answers3);
		li2.add(answers4);
		
		
		
		Question question=new Question();
		question.setQname("What is java");
		question.setAnswers(li1);
		
		Question  question2=new Question();
		question2.setQname("What is a Servlet");
		question2.setAnswers(li2);
		
		s.save(question);
		s.save(question2);
		tx.commit();
		s.close();
		
		
		

	}

}
