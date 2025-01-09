package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Cart;

/**
	* Author : saumy
	* Date	 : 09-Jan-2025
	* Time   : 7:12:52 am
*/
@Repository
public interface CartRespository extends JpaRepository<Cart, Long>
{

}
