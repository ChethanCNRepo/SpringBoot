package com.fullstack.springreact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.springreact.entity.Product;
import com.fullstack.springreact.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	
	}
	
	public List<Product> getByProductType(String productType){
		return productRepository.getByProductType(productType);
	}
}
