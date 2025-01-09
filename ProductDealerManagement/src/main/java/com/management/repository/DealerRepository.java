package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Dealer;

/**
	* Author : saumy
	* Date	 : 02-Jan-2025
	* Time   : 10:24:41 am
*/
@Repository
public interface DealerRepository extends JpaRepository<Dealer , Long>{

}
