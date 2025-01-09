package com.management.model;

import jakarta.persistence.*;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 9:50:47 am
*/
@Entity
@Table(name = "dealer")
public class Dealer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,unique = false)
	private String name;
	
	@Column(nullable = false,unique = false)
	private String dealName;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name= "addressId",referencedColumnName = "addressId")
	private Address address;

	public Dealer() {
		
	}

	public Dealer(Long id, String name, String dealName, Address address) {
		
		this.id = id;
		this.name = name;
		this.dealName = dealName;
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

	public String getDealName() {
		return dealName;
	}

	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
