package com.management.service;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Customer;
import com.management.repository.CustomerRepository;

/**
	* Author : saumy
	* Date	 : 09-Jan-2025
	* Time   : 7:09:41 am
*/
@Service
public class CustomerService
{
	@Autowired
	CustomerRepository customerRepository;

	
	public String encodedPassword(String password)
	{
		return Base64.getEncoder().encodeToString(password.getBytes());
	}
	
	public String decodedPassword(String encodedPassword)
	{
		return new String(Base64.getDecoder().decode(encodedPassword));
		
	}

	public Customer addCustomer(Customer customer) 
	{
		customer.setPassword(encodedPassword(customer.getPassword()));
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomer()
	{
		List<Customer> customer = customerRepository.findAll();
		String p = "@@@@@@@";
		for(Customer c : customer)
		{
			c.setPassword(p);
		}
		return customer;
	}
	
	public Customer getCustomer(String cust)
	{
		Optional<Customer> c = customerRepository.findByEmail(cust);
		if(c.isPresent())
		{
			Customer cu = c.get();
			cu.setPassword(decodedPassword(cu.getPassword()));
			return cu;
		}
		return null;
	}
	
}
