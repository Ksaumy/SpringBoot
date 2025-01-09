package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Product;
import com.management.repository.ProductRepository;

/**
	* Author : saumy
	* Date	 : 02-Jan-2025
	* Time   : 10:24:57 am
*/

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository ;

	public Product addProduct(Product product) {
		
		
		return productRepository.save(product);
	}

}
