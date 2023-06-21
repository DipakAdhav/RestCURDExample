package com.RestExample.SpringBootApp.service;

import java.util.List;

import com.RestExample.SpringBootApp.Entities.Student;

public interface StudentService {
	
	public List<Student> getAllstudent();
	
	public Student getStudent(long id);
	
	public Student addStudent(Student student);
	
	public Student UpdateStudent(Student student);
	
	
	public void  DetleteStudent(long id);
	

}
