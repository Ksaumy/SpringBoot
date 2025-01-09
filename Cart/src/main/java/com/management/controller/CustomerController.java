package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exception.CartNotFound;
import com.management.model.Customer;
import com.management.service.CustomerService;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:55:10 pm
*/
@RestController
@RequestMapping("/cart")
public class CustomerController
{
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public ResponseEntity<Customer>addProduct(@RequestBody Customer customer)
	{
		Customer cust = customerService.addProduct(customer);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK); 
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Customer>> getAllProduct()
	{
		List<Customer> list = customerService.getAllProduct();
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) throws CartNotFound
	{
		boolean cust = customerService.deleteProduct(id);
		if(cust)
		{
			return new ResponseEntity<String>("Delete Successfully", HttpStatus.OK);
		}
		else
		{
			throw new CartNotFound("Item not found" + id);
		}
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateProduct(@PathVariable Long id, @RequestBody Customer customer) throws CartNotFound
	{
		Customer cust = customerService.updateProduct(id,customer);
		if(cust != null)
		{
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
		{
			throw new CartNotFound("Item not found" + id);
		}
	}

}
