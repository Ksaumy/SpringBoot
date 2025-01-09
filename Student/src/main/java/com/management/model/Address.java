package com.management.model;

import jakarta.persistence.*;

/**
	* Author : saumy
	* Date	 : 04-Jan-2025
	* Time   : 10:47:40 pm
*/

@Entity
@Table(name="address")

public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	
	@Column(nullable = false,unique = false)
	private String city;
	
	@Column(nullable = false,unique = false)
	private String state;
	
	@Column(nullable = false,unique = false)
	private Long pincode;
	
	
	public Address()
	{
	}


	public Address(Long addressId, String city, String state, Long pincode) 
	{
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
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


	public Long getPincode() {
		return pincode;
	}


	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
	

}
