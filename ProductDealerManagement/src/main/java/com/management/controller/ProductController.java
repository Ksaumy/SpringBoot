package com.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Dealer;
import com.management.model.Product;
import com.management.repository.DealerRepository;
import com.management.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
	* Author : saumy
	* Date	 : 02-Jan-2025
	* Time   : 10:23:38 am
*/

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService ;
	
	@Autowired 
	private DealerRepository dealerRepository; 
	
	@PostMapping("/add") public ResponseEntity<Product> addProduct(@RequestBody Product product) { 
		Dealer dealer = dealerRepository.findById(product.getDealer().getDealerId()) 
				.orElseThrow(() -> new RuntimeException("Dealer not found with id: " + product.getDealer().getDealerId())); 
		product.setDealer(dealer); Product savedProduct = productService.addProduct(product); 
		return new ResponseEntity<>(savedProduct, HttpStatus.OK); }
	
}
