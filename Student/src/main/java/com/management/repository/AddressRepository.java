package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Address;

/**
	* Author : saumy
	* Date	 : 04-Jan-2025
	* Time   : 11:15:05 pm
*/
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>
{

}
