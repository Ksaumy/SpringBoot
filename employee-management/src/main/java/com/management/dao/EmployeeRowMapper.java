package com.management.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.management.model.Employee;

/**
	* Author : saumy
	* Date	 : 30-Dec-2024
	* Time   : 6:53:21 pm
*/
public class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setEmpName(rs.getString("empName"));
		employee.setEmpGender(rs.getString("empGender"));
		employee.setEmpAge(rs.getInt("empAge"));
		return employee;
	}

}
