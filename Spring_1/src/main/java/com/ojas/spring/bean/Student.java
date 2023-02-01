package com.ojas.spring.bean;

public class Student {
	
	private String firstname;
	public Student(){
		System.out.println("Student bean object created");
				
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void display(){
		
		System.out.println("Welcome to Spring Framework : "+firstname);
	}
}
