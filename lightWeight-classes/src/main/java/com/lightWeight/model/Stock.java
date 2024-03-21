package com.lightWeight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	private int idCreator;
	private String name;
	private String description;
	private ProductType productType;
	private Double rawWeight;
	private int amount;
	
	
	
	public Stock(int idProduct, int idCreator, String name, String description, ProductType productType,
			Double rawWeight, int amount) {
		super();
		this.idProduct = idProduct;
		this.idCreator = idCreator;
		this.name = name;
		this.description = description;
		this.productType = productType;
		this.rawWeight = rawWeight;
		this.amount = amount;
	}
	
	
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdCreator() {
		return idCreator;
	}
	public void setIdCreator(int idCreator) {
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
	
	
}
