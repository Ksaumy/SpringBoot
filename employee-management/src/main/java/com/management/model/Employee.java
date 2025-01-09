package com.management.model;
/**
	* Author : saumy
	* Date	 : 30-Dec-2024
	* Time   : 6:14:12 pm
*/

public class Employee 
{
	private int empId;
	private String empName;
	private String empGender;
	private int empAge;
	
	public Employee()
	{
	}

	public Employee(int empId, String empName, String empGender, int empAge)
	{
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
	}
