package com.fullstack.springreact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	//add
	//bbb
	//aa
	//aaa
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long productId;

	private String productType;

	private String productName;

	private Integer price;

	private String description;

	private Integer cashBack;

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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Integer getCashBack() {
		return cashBack;
	}

	public void setCashBack(Integer cashBack) {
		this.cashBack = cashBack;
	}

	public Product() {

	}

	public Product(long productId, String productType, Integer price, String description, Integer cashBack) {

		super();
		this.productId = productId;
		this.productType = productType;
		this.price = price;
		this.description = description;
		this.cashBack = cashBack;
	}

}
