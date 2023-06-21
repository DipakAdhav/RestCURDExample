package com.RestExample.SpringBootApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestExample.SpringBootApp.Dao.StudentRepository;
import com.RestExample.SpringBootApp.Entities.Student;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> getAllstudent() {
		
		return  repo.findAll();
		 
	}

	@Override
	public Student getStudent(long id) {
		
		Optional<Student> std=repo.findById(id);
		return std.get();
	}

	@Override
	public Student addStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student UpdateStudent(Student student) {
		
		Student exitStudent=repo.findById(student.getId()).get();
		exitStudent.setName(student.getName());
		exitStudent.setMobile(student.getMobile());
		exitStudent.setEmail(student.getEmail());
		exitStudent.setPercentage(student.getPercentage());
		Student update=  repo.save(exitStudent);
		System.out.print(update);
		return update;
	}

	@Override
	public void DetleteStudent(long id) {
		
		repo.deleteById(id);
		
		
	}

	

	


}
