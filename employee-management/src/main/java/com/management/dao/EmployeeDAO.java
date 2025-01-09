package com.management.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.management.model.Employee;

/**
	* Author : saumy
	* Date	 : 30-Dec-2024
	* Time   : 6:14:02 pm
*/
@Repository
public class EmployeeDAO 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addEmployee(Employee employee)
	{
		String query = "insert into employee (empName,empGender,empAge) values(?,?,?)";
		return jdbcTemplate.update(query,employee.getEmpName(),employee.getEmpGender(),employee.getEmpAge());
	}
	
	public List<Employee> list()
	{
		String query = "select * from employee";
		return jdbcTemplate.query(query, new EmployeeRowMapper());
	}

	public int delete(int empId)
	{ 
		String query = "DELETE FROM employee WHERE empId = ?";
	return jdbcTemplate.update(query, empId);
	}

	

	public Employee get(int id) 
	{
	    String query = "select * from employee where empId=?";
	    return jdbcTemplate.queryForObject(query,new EmployeeRowMapper(),id);
	}  
	
	public int update(Employee employee)
	{
		String query = "update employee set empName =? where empId =?";
		return jdbcTemplate.update(query, employee.getEmpName(),employee.getEmpId());
	}

}
