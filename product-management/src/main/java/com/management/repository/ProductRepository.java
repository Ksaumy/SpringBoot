package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Product;

/**
	* Author : saumy
	* Date	 : 01-Jan-2025
	* Time   : 11:54:58 am
*/

@Repository
public interface ProductRepository extends JpaRepository<Product , Long>{

}
