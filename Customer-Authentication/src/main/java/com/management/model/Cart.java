package com.management.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
	* Author : saumy
	* Date	 : 09-Jan-2025
	* Time   : 7:03:19 am
*/
@Entity
@Table(name="CART")
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
