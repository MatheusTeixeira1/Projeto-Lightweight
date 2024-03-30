package com.lightWeight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private Long idCreator;
	private Double price;
	private String name;
	private String description;
	private ProductType productType;
	private Double rawWeight;
	private int amount;
	
	public Product() {
		super();
	}
	
	public Product(Long idProduct, Long idCreator, double price, String name, String description, ProductType productType,
			Double rawWeight, int amount) {
		super();
		this.idProduct = idProduct;
		this.idCreator = idCreator;
		this.price = price;
		this.name = name;
		this.description = description;
		this.rawWeight = rawWeight;
		this.amount = amount;
		this.productType = productType;
	}
	
	
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIdCreator() {
		return idCreator;
	}
	public void setIdCreator(Long idCreator) {
		this.idCreator = idCreator;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Double getRawWeight() {
		return rawWeight;
	}
	public void setRawWeight(Double rawWeight) {
		this.rawWeight = rawWeight;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
