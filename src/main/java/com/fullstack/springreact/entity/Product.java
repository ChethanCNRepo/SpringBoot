package com.fullstack.springreact.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	
	
	private String productType;
	

	private Integer price;
	

	private String description;
	

	private double cashBack;
	
	
	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getCashBack() {
		return cashBack;
	}


	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}


	public Product() {
	
	}

<<<<<<< HEAD
=======

<<<<<<< HEAD



	public Product(long productId, String productType, double price, String description, Integer cashBack) {

=======
>>>>>>> d666f5ba1411ce76f07a27ffb3bf3eaf3ddbbed8
	public Product(Integer productId, String productType, Integer price, String description, Integer cashBack) {

		super();
		this.productId = productId;
		this.productType = productType;
		this.price = price;
		this.description = description;
		this.cashBack = cashBack;
	}


	
	
}
