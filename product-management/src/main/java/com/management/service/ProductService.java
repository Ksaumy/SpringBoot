package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.Product;
import com.management.repository.ProductRepository;

/**
 * Author : saumy Date : 01-Jan-2025 Time : 11:55:09 am
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		// TODO Auto-generated method stub

		return productRepository.save(product);
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	public void delete(Long productId) {
		productRepository.deleteById(productId);
	}

}
