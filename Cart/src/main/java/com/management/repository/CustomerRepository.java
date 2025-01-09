package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Customer;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:56:40 pm
*/
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
