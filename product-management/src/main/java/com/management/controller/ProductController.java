package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.Product;
import com.management.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


/**
	* Author : saumy
	* Date	 : 01-Jan-2025
	* Time   : 11:54:44 am
*/

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService ;
	
	@PostMapping("/add")
	public ResponseEntity<Product> postMethodName(@RequestBody Product product ) {
		Product prod = productService.addProduct(product) ;
		System.out.println(prod);
		return new ResponseEntity<>(prod, HttpStatus.OK);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> products =  productService.getProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@GetMapping("/delete/{productId}")
	public ResponseEntity<Void> delete(@PathVariable Long productId) {
	    productService.delete(productId);
	    return new ResponseEntity<>(HttpStatus.OK);
	}

	
	
	
	
}
