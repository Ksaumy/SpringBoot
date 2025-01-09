package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Dealer;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 10:03:41 am
*/
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long>
{

}
