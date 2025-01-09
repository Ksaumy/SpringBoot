package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Cart;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:56:25 pm
*/
@Repository
public interface CartRepository  extends JpaRepository<Cart, Long>
{

}
