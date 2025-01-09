package com.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Customer;

/**
	* Author : saumy
	* Date	 : 09-Jan-2025
	* Time   : 7:11:49 am
*/

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

	Optional<Customer> findByEmail(String cust);

}
