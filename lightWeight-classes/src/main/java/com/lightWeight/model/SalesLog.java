package com.lightWeight.model;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class SalesLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSale;
	private int idBuyer;
	private int idProduct;
	private Double totalPrice;
	private Double unitPrice;
	private int ammount;
	private int discount;
	private Date date;
	
	
	
	public SalesLog(int idSale, int idBuyer, int idProduct, Double totalPrice, Double unitPrice, int ammount,
			int discount, Date date) {
		super();
		this.idSale = idSale;
		this.idBuyer = idBuyer;
		this.idProduct = idProduct;
		this.totalPrice = totalPrice;
		this.unitPrice = unitPrice;
		this.ammount = ammount;
		this.discount = discount;
		this.date = date;
	}
	public int getIdSale() {
		return idSale;
	}
	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}
	public int getIdBuyer() {
		return idBuyer;
	}
	public void setIdBuyer(int idBuyer) {
		this.idBuyer = idBuyer;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
