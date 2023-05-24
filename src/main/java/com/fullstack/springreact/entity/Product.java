package com.fullstack.springreact.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	
	
	private String productType;
	

	private double price;
	

	private String description;
	

	private double cashBack;
	
	
	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
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

	public Product(long productId, String productType, double price, String description, double cashBack) {

=======
	public Product(Integer productId, String productType, double price, String description, Integer cashBack) {
>>>>>>> a72b007997c0450c1194e49bae94b056e0aadc58
		super();
		this.productId = productId;
		this.productType = productType;
		this.price = price;
		this.description = description;
		this.cashBack = cashBack;
	}


	
	
}
