package com.management.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.model.Employee;
import com.management.service.EmployeeService;



/**
	* Author : saumy
	* Date	 : 30-Dec-2024
	* Time   : 6:13:42 pm
*/
@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employee")
	public String displayHomePage()
	{
		return"index";
	}
	
	@GetMapping("/form")
	public String addEmployee(Model m)
	{
		Employee employee = new Employee();
		m.addAttribute("employee", employee);
		return "form";
	}
	
	@PostMapping("/form")
	public String addEmployee(@ModelAttribute("employee") Employee employee)
	{
		employeeService.addEmployee(employee);
		return "index";
	}
	
	@GetMapping("/list")
	public String list(Model m)
	{
		List<Employee> employee = employeeService.list();
		m.addAttribute("employeelist", employee);
		return "list";
	}
	
	@GetMapping("/delete/{empId}")
	public String delete(@PathVariable int empId)
	{
		employeeService.deleteId(empId);
		return "redirect:/list";
	}
	
	@GetMapping("/edit/{empId}")
	public String updateSingle(@PathVariable int empId,Model m)
	{
		Employee employee = employeeService.getSingleEmployee(empId);
		System.out.println(employee.getEmpName());
		m.addAttribute("employee",employee);
		return "update";
	}
	
	
	@PostMapping("/update/{empId}")
	public String update(@PathVariable int empId,@ModelAttribute("employee") Employee employee)
	{
		employee.setEmpId(empId);
		employeeService.update(employee);
		return "redirect:/list";
	}
	

}
