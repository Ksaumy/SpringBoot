package com.management.model;

import jakarta.persistence.*;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 9:51:01 am
*/
@Entity
@Table(name="dAddress")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	
	@Column(nullable = false,unique = false)
	private String city;
	
	@Column(nullable = false,unique = false)
	private String state;

	public Address() {
		
	}

	public Address(Long addressId, String city, String state)
	{
		this.addressId = addressId;
		this.city = city;
		this.state = state;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

	
	
	
}
