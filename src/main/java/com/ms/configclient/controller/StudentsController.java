package com.ms.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.configclient.beans.Student;

@RestController
@RequestMapping("/api/v1")
public class StudentsController {

	@Autowired
	private Environment env;
	
	
	@GetMapping("/students")
	public ResponseEntity<Student> getStudentDetails(){
		Student student = new Student();
		student.setStudentName(env.getProperty("student.name"));
		student.setStudentRollNo(env.getProperty("student.rollNo"));
		student.setStudentEmail(env.getProperty("student.email"));
		student.setPhone(env.getProperty("student.phone"));
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
