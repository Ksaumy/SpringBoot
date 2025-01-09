package com.management.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

/**
	* Author : saumy
	* Date	 : 04-Jan-2025
	* Time   : 10:47:29 pm
*/
@Entity
@Table(name="students")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,unique = false)
	private String name;
	@Column(nullable = false,unique = false)
	private String course;
	
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="addressId",referencedColumnName="addressId")
	private Address address;


	public Student()
	{
	}


	public Student(Long id, String name, String course, Address address) 
	{
		this.id = id;
		this.name = name;
		this.course = course;
		this.address = address;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	

}
