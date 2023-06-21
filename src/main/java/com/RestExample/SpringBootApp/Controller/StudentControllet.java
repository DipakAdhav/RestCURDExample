package com.RestExample.SpringBootApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestExample.SpringBootApp.Entities.Student;
import com.RestExample.SpringBootApp.service.StudentService;

@RestController
public class StudentControllet {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/students")
	public List<Student> getAllStudent()
	{
		return service.getAllstudent();
	}
	
	@RequestMapping("students/{studentId}")
	public Student getStudent(@PathVariable String studentId)
	{
		
		return service.getStudent(Long.parseLong(studentId));
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		System.out.print(student);

		return service.addStudent(student);
	}
	
	@DeleteMapping("/students/{student}")
	public void deleteStudent(@PathVariable String student)
	{
		 service.DetleteStudent(Long.parseLong(student));
	}
	
	@PutMapping("/students/{studentid}")
	public Student UpdateStudent(@PathVariable Long studentid, @RequestBody Student sd)
	{
		sd.setId(studentid);
		return service.UpdateStudent(sd);
	}


}
