package com.management.model;

import jakarta.persistence.*;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:54:46 pm
*/
@Entity
@Table(name="cart")
public class Cart
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
	
	@Column(nullable=false, unique = false)
	private String productName;
	
	@Column(nullable=false, unique = false)
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Customer customer;

	public Cart() 
	{
	}

	public Cart(Long cartId, String productName, double price, Customer customer) 
	{
		
		this.cartId = cartId;
		this.productName = productName;
		this.price = price;
		this.customer = customer;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCoustomer() {
		return customer;
	}

	public void setCoustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	

}
