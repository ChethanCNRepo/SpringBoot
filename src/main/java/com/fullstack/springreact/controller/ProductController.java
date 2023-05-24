package com.fullstack.springreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.fullstack.springreact.entity.Product;
import com.fullstack.springreact.service.ProductService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class ProductController {
//change
	@Autowired
	ProductService productService;

	@GetMapping("/")
	public RedirectView handleRoot() {
		return new RedirectView("/get-all-products");
	}

	

	@GetMapping("/get-all-products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/products")
	public List<Product> getByProductType(@RequestParam("type") String productType) {
		return productService.getByProductType(productType);

	}
}
