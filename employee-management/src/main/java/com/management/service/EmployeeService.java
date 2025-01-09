package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.dao.EmployeeDAO;
import com.management.model.Employee;

/**
	* Author : saumy
	* Date	 : 30-Dec-2024
	* Time   : 6:14:31 pm
*/
@Service
public class EmployeeService 
{
	@Autowired
	EmployeeDAO employeeDAO;
	
	public void addEmployee(Employee employee)
	{
		employeeDAO.addEmployee(employee);
	}
	
	public List<Employee> list()
	{
		return employeeDAO.list();
	}

	public void deleteId(int empId) 
	{
		
		employeeDAO.delete(empId);
	}

	public Employee getSingleEmployee(int empId) 
	{
		return employeeDAO.get(empId);
	}
	
	public void update(Employee employee)
	{
		employeeDAO.update(employee);
	}

}
