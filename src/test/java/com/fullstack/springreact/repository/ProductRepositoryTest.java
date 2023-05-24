package com.fullstack.springreact.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.fullstack.springreact.entity.Product;
import com.fullstack.springreact.repository.ProductRepository;

@DataJpaTest
public class ProductRepositoryTest {
	
	@Autowired
   ProductRepository productRepository;
	
	@Test
	public void testRepository() {
		List<Product> products=productRepository.getByProductType("Shirt");
		
		assertEquals(3,products.size());
	}

}
