package com.management.model;

import java.time.LocalDate;

import jakarta.persistence.*;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:54:54 pm
*/
@Entity
@Table(name="Customer")
public class Customer
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	
	@Column(nullable=false, unique = true)
	private String email;
	
	@Column(nullable=false, unique = false)
	private String FirstName;
	
	@Column(nullable=false, unique = false)
	private String LastName;
	
	@Column(nullable=false, unique = true)
	private String password;
	
	@Column(nullable=false, unique = false)
	private LocalDate Dob;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_Id", referencedColumnName = "cartId")
	private Cart cart;

	public Customer() 
	{
		
	}

	public Customer(Long id, String email, String firstName, String lastName, String password, LocalDate dob,
			Cart cart) 
	{
		
		this.id = id;
		this.email = email;
		FirstName = firstName;
		LastName = lastName;
		this.password = password;
		Dob = dob;
		this.cart = cart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return Dob;
	}

	public void setDob(LocalDate dob) {
		Dob = dob;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
	
	

}
