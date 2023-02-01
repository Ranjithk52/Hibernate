package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")

public class Student {
	@Id
	
	int Student_id;
	String Student_Name;
	int Student_Marks;
	public Student(){
		
	}
	
	public Student(int student_id, String student_Name, int student_Marks) {
		super();
		Student_id = student_id;
		Student_Name = student_Name;
		Student_Marks = student_Marks;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getStudent_Marks() {
		return Student_Marks;
	}
	public void setStudent_Marks(int student_Marks) {
		Student_Marks = student_Marks;
	}

	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_Name=" + Student_Name + ", Student_Marks="
				+ Student_Marks + "]";
	}
	
	
	

}
