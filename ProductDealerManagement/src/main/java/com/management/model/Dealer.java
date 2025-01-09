package com.management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
	* Author : saumy
	* Date	 : 02-Jan-2025
	* Time   : 10:24:10 am
*/
@Data

@Entity
@Table(name = "dealers")
public class Dealer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dealerId ;
	
	@Column(nullable = false , unique = false)
	private String city ;
	
	@Column(nullable = false , unique = true)
	private String phone ;

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Dealer(Long dealerId, String city, String phone) {
		super();
		this.dealerId = dealerId;
		this.city = city;
		this.phone = phone;
	}
	
	public Dealer() {
		
	}
}
