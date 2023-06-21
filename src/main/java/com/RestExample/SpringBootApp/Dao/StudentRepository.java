package com.RestExample.SpringBootApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestExample.SpringBootApp.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
