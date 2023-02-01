package com.ojas.dao;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.ojas.model.Student;
@Path("/student")


public class StudentServices {
	StudentDAOImpl stdao=new StudentDAOImpl();
	
	@POST
	@Path("/create/{id}/{name}/{marks}")
	public String createStudent(@PathParam("id") int id,@PathParam ("name") String name,@PathParam("marks") int marks) {
		
		
		return stdao.createStudent(id,name,marks);
		
	}

	@GET
	@Path("/allstudents")
	public List<Student> getALLStudents() {
		
		
		return stdao.getALLStudents();
		
	}

	@GET
	
	@Path("/getstudentbyid/{id}")
	public Student getStudentbyID(@PathParam("id") int student_id) {
		
		return stdao.getStudentbyID(student_id);
	}

	@PUT
	@Path("/update/{id}/{name}/{marks}")
	public String updateStudent(@PathParam("id") int student_id,@PathParam("name") String name,@PathParam("marks") int marks) {
		
		
		return stdao.updateStudent(student_id,name,marks);
	}

	@DELETE
	@Path("/delete/{id}")
	public String deleteStudent(@PathParam("id") int student_id) {
		
		return stdao.deleteStudent(student_id);
	}
	
	

}
