package com.ojas.dao;

import java.util.List;

import com.ojas.model.Student;

public interface StudentDAO {
	
	
	public String createStudent(int id,String name,int marks);
	public List<Student> getALLStudents();
	public Student getStudentbyID(int student_id);
	public String updateStudent(int student_id, String name,int marks);
	public String deleteStudent(int student_id);
	

}
