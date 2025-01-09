package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exception.CartNotFound;
import com.management.model.Customer;
import com.management.repository.CustomerRepository;

/**
	* Author : saumy
	* Date	 : 08-Jan-2025
	* Time   : 10:56:52 pm
*/
@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository customerRepository;

	public Customer addProduct(Customer customer)
	{
		return customerRepository.save(customer) ;
	}
	
	public List<Customer> getAllProduct()
	{
		return customerRepository.findAll();
	}


	public boolean deleteProduct(Long id) 
	{
		if(customerRepository.existsById(id))
		{
			customerRepository.deleteById(id);
			return true;
		}
		else
		{
			return false;
		}
	}

	

	public Customer updateProduct(Long id, Customer customer) throws CartNotFound
	{
		Optional<Customer> cust = customerRepository.findById(id);
		if(cust.isPresent())
		{
			Customer customer1 = cust.get() ;
			customer1.setEmail(customer.getEmail());
			customer1.setFirstName(customer.getFirstName());
			customer1.setPassword(customer.getPassword());
			customer1.setCart(customer.getCart());
			return customerRepository.save(customer1);
		}
		else
		{
			throw new CartNotFound("Product not found" + id);
		}
	}

	
	
}
