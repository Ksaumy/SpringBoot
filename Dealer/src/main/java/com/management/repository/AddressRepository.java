package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Address;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 10:04:44 am
*/
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>
{

}
