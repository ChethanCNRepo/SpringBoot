package com.fullstack.springreact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.springreact.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	public List<Product> getByProductType(String productType);
	
	
	
	

}
