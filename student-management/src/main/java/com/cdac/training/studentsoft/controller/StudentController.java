package com.cdac.training.studentsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.training.studentsoft.model.Student;
import com.cdac.training.studentsoft.service.StudentService;




/**
	* Author : Saumya
	* Date	 : 26-Dec-2024
	* Time   : 3:46:41 pm
*/

@Controller
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	//http://localhost:8085/studentsoft
	@GetMapping("/student")
	public String displayHomePage() {
		return "index";
	}
	
	@GetMapping("/new")
	public String getMethodNode(Model m) {
		Student student = new Student();
		
		m.addAttribute(student);
		
		return "student-form" ;
		
	}
	
	@PostMapping("/students")
	public String postMethodName(@ModelAttribute("student") Student stud) {
		studentService.saveStudent(stud); //Invoke save() of Service Layer
		return "redirect:/student"
				; //redirect to students route - GET request	
	}
	
	@GetMapping("/students")
	public String showStudentList(Model model)
	{
		List<Student> studentList = studentService.studentList(); 
		model.addAttribute("stud", studentList);
		return "student"; // Ensure this matches your JSP file name
	}

	
	@GetMapping("/shopping")
	public String doShopping()
	{
		return "shopping";
	}
	
	
	
}
