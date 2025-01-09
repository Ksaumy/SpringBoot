package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Student;
import com.management.service.StudentService;

/**
	* Author : saumy
	* Date	 : 04-Jan-2025
	* Time   : 11:03:00 pm
*/
@RestController
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
	   Student stud = studentService.addStudent(student);
	   return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> students = studentService.getAllStudent(); 
	return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Long id)
	{
		studentService.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student student)
	{
		Student Studup = studentService.updateStudent(id, student);
		return new ResponseEntity<>(Studup, HttpStatus.OK);
	}

}
