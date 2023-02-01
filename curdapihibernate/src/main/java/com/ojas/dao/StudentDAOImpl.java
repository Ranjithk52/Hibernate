package com.ojas.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.model.Student;

public class StudentDAOImpl implements StudentDAO {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	

	public String createStudent(int id,String name,int marks) {
		
		
		
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student student=new Student();
		student.setStudent_id(id);
		student.setStudent_Name(name);
		student.setStudent_Marks(marks);
		
		s.saveOrUpdate(student);
		tx.commit();
		
		
		
		return "Successfully created Student";
	}

	public List<Student> getALLStudents() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query query=s.createQuery("from Student");
		
		return query.list();
	}

	public Student getStudentbyID(int student_id) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student std=s.get(Student.class,student_id);
//		Query query=s.createQuery("from Student where Student_id=:student_id");
//		query.setParameter("student_id",student_id);
//		
//		return query.list();
		
		System.out.println(std);
		return std;
		
	}

	public String updateStudent(int student_id, String name,int marks) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query query=s.createQuery("update Student set Student_Name=:name,Student_Marks=:marks where Student_id=:student_id");
		query.setParameter("student_id",student_id);
		query.setParameter("name", name);
		query.setParameter("marks", marks);
		query.executeUpdate();
		tx.commit();
		
		return "Successfully updated....";
	}

	public String deleteStudent(int student_id) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query query=s.createQuery("delete from Student where Student_id=:student_id");
		query.setParameter("student_id", student_id);
		query.executeUpdate();
		tx.commit();
		
		return "Successfully deleted.....";
	}

	

}
