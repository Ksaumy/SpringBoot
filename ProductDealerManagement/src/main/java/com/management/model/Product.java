package com.management.model;
/**
	* Author : saumy
	* Date	 : 02-Jan-2025
	* Time   : 10:23:54 am
*/

import jakarta.persistence.*;
import lombok.Data;


//@Data

@Entity
@Table(name = "products")
public class Product {
	public Product(Long productId, String productName, double price, Dealer dealer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.dealer = dealer;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId ;
	
	@Column(nullable = false , unique = false)
	private String productName ;
	
	@Column(nullable = false , unique = false)
	private double price ;
	
	@ManyToOne()
	@JoinColumn(name = "dealer_id", nullable = false)
	private Dealer dealer ;

	
	public Product() {
		
	}
	
	
}
