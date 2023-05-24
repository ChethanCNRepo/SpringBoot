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
	
	private String productName;

	private long price;
	

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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}

	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
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





	public Product(Integer productId, String productType, long price, String description, Integer cashBack) {

		super();
		this.productId = productId;
		this.productType = productType;
		this.price = price;
		this.description = description;
		this.cashBack = cashBack;
	}


	
	
}
